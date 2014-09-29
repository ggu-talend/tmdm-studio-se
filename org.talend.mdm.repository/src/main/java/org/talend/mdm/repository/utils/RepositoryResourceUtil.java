// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.xsd.XSDIdentityConstraintDefinition;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDXPathDefinition;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.utils.VersionUtils;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.BusinessProcessItem;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.FolderType;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryEditorInput;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.repository.RepositoryObject;
import org.talend.core.model.repository.RepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.ResourceModelUtils;
import org.talend.core.repository.utils.ResourceFilenameHelper;
import org.talend.core.repository.utils.XmiResourceManager;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.designer.core.ui.editor.ProcessEditorInput;
import org.talend.mdm.repository.core.IRepositoryNodeConfiguration;
import org.talend.mdm.repository.core.IRepositoryNodeResourceProvider;
import org.talend.mdm.repository.core.IServerObjectRepositoryType;
import org.talend.mdm.repository.core.bridge.MDMRepositoryNode;
import org.talend.mdm.repository.core.command.CommandManager;
import org.talend.mdm.repository.core.command.ICommand;
import org.talend.mdm.repository.core.service.ContainerCacheService;
import org.talend.mdm.repository.core.service.IInteractiveHandler;
import org.talend.mdm.repository.core.service.InteractiveService;
import org.talend.mdm.repository.core.service.RepositoryQueryService;
import org.talend.mdm.repository.extension.RepositoryNodeConfigurationManager;
import org.talend.mdm.repository.i18n.Messages;
import org.talend.mdm.repository.model.mdmmetadata.MDMServerDef;
import org.talend.mdm.repository.model.mdmproperties.ContainerItem;
import org.talend.mdm.repository.model.mdmproperties.MDMServerObjectItem;
import org.talend.mdm.repository.model.mdmproperties.MdmpropertiesFactory;
import org.talend.mdm.repository.model.mdmproperties.WorkspaceRootItem;
import org.talend.mdm.repository.model.mdmserverobject.MDMServerObject;
import org.talend.mdm.repository.model.mdmserverobject.WSDataModelE;
import org.talend.mdm.repository.models.FolderRepositoryObject;
import org.talend.mdm.repository.models.WSRootRepositoryObject;
import org.talend.mdm.repository.ui.editors.IRepositoryViewEditorInput;
import org.talend.mdm.workbench.serverexplorer.core.ServerDefService;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.ERepositoryStatus;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;

import com.amalto.workbench.utils.Util;
import com.amalto.workbench.utils.XtentisException;
import com.amalto.workbench.webservices.WSConceptKey;
import com.amalto.workbench.webservices.WSGetBusinessConceptKey;

/**
 * DOC hbhong class global comment. Detailled comment <br/>
 * 
 */
public class RepositoryResourceUtil {

    /**
     *
     */
    private static final String SVN_FOLDER_NAME = ".svn"; //$NON-NLS-1$

    private static final String DOT = "."; //$NON-NLS-1$

    private static final String UNDERLINE = "_"; //$NON-NLS-1$

    static Logger log = Logger.getLogger(RepositoryResourceUtil.class);

    static XmiResourceManager resourceManager = new XmiResourceManager();

    private static final String DIVIDE = "/"; //$NON-NLS-1$

    public static boolean checkServerConnection(Shell shell, final MDMServerDef serverDef) {
        try {
            ServerDefService.checkMDMConnection(serverDef);
            return true;
        } catch (Exception e) {
            log.debug(e.getMessage(), e);
            if (shell != null) {
                String title = Messages.bind(Messages.Server_cannot_connected, serverDef.getUrl());
                MessageDialog.openError(shell, title, Messages.AbstractDataClusterAction_ConnectFailed);
            }
        }
        return false;
    }

    public static boolean createItem(Item item, String propLabel) {
        return createItem(item, propLabel, VersionUtils.DEFAULT_VERSION);
    }

    public static boolean isLockedViewObject(IRepositoryViewObject viewObj) {
        IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        ERepositoryStatus status = factory.getStatus(viewObj);
        return status == ERepositoryStatus.LOCK_BY_USER || status == ERepositoryStatus.LOCK_BY_OTHER;
    }

    public static boolean isLockedAndEdited(IRepositoryViewObject viewObj) {
        IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        ERepositoryStatus status = factory.getStatus(viewObj);
        if (status == ERepositoryStatus.LOCK_BY_OTHER) {
            return true;
        } else if (status == ERepositoryStatus.LOCK_BY_USER) {
            IEditorReference openRef = RepositoryResourceUtil.isOpenedInEditor(viewObj);
            return openRef != null;
        }
        return false;
    }

    public static boolean isLockedItem(Item item) {
        IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        ERepositoryStatus status = factory.getStatus(item);
        return status == ERepositoryStatus.LOCK_BY_USER || status == ERepositoryStatus.LOCK_BY_OTHER;
    }

    public static void saveItem(Item item) {
        IRepositoryNodeConfiguration configuration = RepositoryNodeConfigurationManager.getConfiguration(item);
        if (configuration != null) {
            IRepositoryNodeResourceProvider resourceProvider = configuration.getResourceProvider();
            if (resourceProvider.needSaveReferenceFile()) {
                resourceProvider.handleReferenceFile(item);
            }

            // save
            IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
            try {
                factory.save(item);
            } catch (PersistenceException e) {
                log.error(e);
            }
        }
    }

    public static boolean createItem(Item item, String propLabel, String version) {
        return createItem(item, propLabel, version, true);
    }

    public static boolean createItem(Item item, String propLabel, String version, boolean pushCommandStack) {
        String name = propLabel;
        IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        RepositoryContext context = factory.getRepositoryContext();

        Property prop = PropertiesFactory.eINSTANCE.createProperty();
        item.setProperty(prop);
        try {
            String nextId = factory.getNextId();
            Property property = item.getProperty();
            property.setId(nextId);
            property.setVersion(version);
            property.setAuthor(context.getUser());
            property.setLabel(propLabel);
            //
            factory.create(item, new Path(item.getState().getPath()));
            //
            IRepositoryNodeConfiguration configuration = RepositoryNodeConfigurationManager.getConfiguration(item);
            if (configuration != null) {
                IRepositoryNodeResourceProvider resourceProvider = configuration.getResourceProvider();
                if (resourceProvider.needSaveReferenceFile()) {

                    resourceProvider.handleReferenceFile(item);
                    try {
                        factory.unlock(item);
                    } catch (LoginException e) {
                        log.error(e.getMessage(), e);
                    }

                }
            }
            if (pushCommandStack) {
                CommandManager.getInstance().pushCommand(ICommand.CMD_ADD, nextId, name);
            }
            return true;
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
        return false;
    }

    public static String getVersionFileName(File file, String version) {
        if (version == null) {
            version = VersionUtils.DEFAULT_VERSION;
        }
        String fileName = file.getName();
        int index = fileName.lastIndexOf(DOT);
        if (index > 0) {
            fileName = fileName.substring(0, index) + UNDERLINE + version + fileName.substring(index);
        }
        return fileName;
    }

    public static IFile copyOSFileTOProject(IProject prj, String path, IFolder desFolder, String version, boolean overwrite,
            IProgressMonitor progressMonitor) throws CoreException, PersistenceException {
        if (path == null || desFolder == null) {
            throw new IllegalArgumentException();
        }
        if (prj == null) {
            Project project = ProjectManager.getInstance().getCurrentProject();
            prj = ResourceModelUtils.getProject(project);
        }
        if (version == null) {
            version = VersionUtils.DEFAULT_VERSION;
        }
        if (desFolder.exists()) {
            File file = new File(path);
            if (file.exists()) {
                FileInputStream fileInputStream = null;
                try {
                    String fileName = getVersionFileName(file, version);
                    IFile desfile = desFolder.getFile(fileName);
                    File osDesFile = new File(desfile.getLocation().toOSString());
                    boolean exists = osDesFile.exists();
                    if (exists) {
                        if (overwrite) {
                            osDesFile.delete();
                            desFolder.refreshLocal(IResource.DEPTH_ONE, progressMonitor);
                        }
                    }
                    fileInputStream = new FileInputStream(file);
                    desfile.create(fileInputStream, false, progressMonitor);
                    return desfile;
                } catch (FileNotFoundException e) {
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                        }
                    }
                }
            }

        }
        return null;
    }

    public static IFolder getFolder(IRepositoryViewObject viewObj) {

        Item pItem = viewObj.getProperty().getItem();
        ERepositoryObjectType type = viewObj.getRepositoryObjectType();
        return getFolder(type, pItem);
    }

    public static IFolder getFolder(ERepositoryObjectType type, Item item) {
        try {
            Project project = ProjectManager.getInstance().getCurrentProject();
            IProject fsProject = ResourceModelUtils.getProject(project);
            ItemState state = item.getState();

            String path = ERepositoryObjectType.getFolderName(type);
            if (!path.isEmpty()) {
                path += state.getPath();
            }

            return fsProject.getFolder(path);
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    public static String getTextFileContent(IFile file, String encode) {
        String filePath = file.getLocation().toOSString();
        File osfile = new File(filePath);
        if (!osfile.exists() || !file.exists()) {
            return null;
        }
        InputStream inputStream = null;

        ByteArrayOutputStream os = null;
        try {
            file.refreshLocal(0, null);
            os = new ByteArrayOutputStream();
            inputStream = file.getContents();
            byte[] ba = new byte[inputStream.available()];
            inputStream.read(ba);
            os.write(ba);
            return os.toString(encode);

        } catch (CoreException e) {
            log.error(e.getMessage(), e);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                }
            }
        }

        return null;
    }

    public static IFile findReferenceFile(ERepositoryObjectType type, Item item, String fileExtension) {
        IFolder folder = RepositoryResourceUtil.getFolder(type);
        String path = item.getState().getPath();
        if (path != null && path.length() > 0) {
            folder = folder.getFolder(path);
        }
        Property property = item.getProperty();

        String fileName = ResourceFilenameHelper.getExpectedFileName(property.getLabel(), property.getVersion()) + DOT
                + (fileExtension != null ? fileExtension : ""); //$NON-NLS-1$
        IFile file = folder.getFile(fileName);
        return file;
    }

    public static IFolder getFolder(ERepositoryObjectType type) {
        IFolder objectFolder = null;
        try {
            Project currentProject = ProjectManager.getInstance().getCurrentProject();
            IProject fsProject = ResourceModelUtils.getProject(currentProject);
            if (fsProject == null) {
                return null;
            }

            objectFolder = ResourceUtils.getFolder(fsProject, ERepositoryObjectType.getFolderName(type), true);
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }

        return objectFolder;
    }

    private static boolean isSystemFolder(Item pItem, String folderName) {
        if (pItem instanceof ContainerItem) {
            return ((ContainerItem) pItem).getType().equals(FolderType.SYSTEM_FOLDER_LITERAL)
                    && folderName.equalsIgnoreCase("system"); //$NON-NLS-1$
        }
        return false;
    }

    public static IRepositoryViewObject createFolderViewObject(ERepositoryObjectType type, String folderName, Item pItem,
            boolean isSystem) {
        Property prop = PropertiesFactory.eINSTANCE.createProperty();
        prop.setId(EcoreUtil.generateUUID());
        //

        ContainerItem item = MdmpropertiesFactory.eINSTANCE.createContainerItem();
        isSystem = isSystemFolder(pItem, folderName);
        item.setType(isSystem ? FolderType.STABLE_SYSTEM_FOLDER_LITERAL : FolderType.FOLDER_LITERAL);

        item.setLabel(folderName);
        item.setRepObjType(type);
        ItemState itemState = PropertiesFactory.eINSTANCE.createItemState();
        itemState.setDeleted(false);

        item.setState(itemState);

        //
        prop.setItem(item);
        prop.setLabel(folderName);
        try {
            //

            if (!isSystem) {
                Project project = ProjectManager.getInstance().getCurrentProject();
                IProject fsProject = ResourceModelUtils.getProject(project);
                ItemState state = pItem.getState();
                itemState.setPath(state.getPath() + IPath.SEPARATOR + folderName);
                String path = ERepositoryObjectType.getFolderName(type);
                if (!path.isEmpty()) {
                    path += itemState.getPath();
                }

                IFolder folder = fsProject.getFolder(path);
                if (!folder.exists()) {

                    ResourceUtils.createFolder(folder);

                }

            } else {
                itemState.setPath(folderName);
            }
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
        FolderRepositoryObject containerRepositoryObject = new FolderRepositoryObject(prop);
        //
        ContainerCacheService.putContainer(containerRepositoryObject);
        //
        return containerRepositoryObject;
    }

    public static FolderRepositoryObject createDeletedFolderViewObject(ERepositoryObjectType type, String path,
            String folderName, FolderRepositoryObject parentConObj) {
        Property prop = PropertiesFactory.eINSTANCE.createProperty();
        prop.setId(EcoreUtil.generateUUID());
        //

        ContainerItem item = MdmpropertiesFactory.eINSTANCE.createContainerItem();

        item.setType(FolderType.FOLDER_LITERAL);

        item.setLabel(folderName);
        item.setRepObjType(type);
        ItemState itemState = PropertiesFactory.eINSTANCE.createItemState();

        itemState.setPath(path);
        item.setState(itemState);
        //

        prop.setItem(item);
        prop.setLabel(folderName);
        itemState.setDeleted(true);
        FolderRepositoryObject containerRepositoryObject = new FolderRepositoryObject(prop);
        // update cache
        ContainerCacheService.putContainer(containerRepositoryObject);
        //
        parentConObj.getChildren().add(containerRepositoryObject);
        return containerRepositoryObject;
    }

    private static IRepositoryViewObject[] categoryViewObjects = null;

    public static IRepositoryViewObject[] getCategoryViewObjects() {
        if (categoryViewObjects == null) {
            List<IRepositoryNodeConfiguration> configurations = RepositoryNodeConfigurationManager.getConfigurations();
            List<IRepositoryViewObject> results = new LinkedList<IRepositoryViewObject>();
            for (IRepositoryNodeConfiguration conf : configurations) {
                if (conf.getContentProvider().isShownInRoot()) {
                    IRepositoryViewObject categoryViewObject = getCategoryViewObject(conf);
                    if (categoryViewObject != null) {
                        results.add(categoryViewObject);
                    }
                }
            }
            categoryViewObjects = results.toArray(new IRepositoryViewObject[0]);
        }
        return categoryViewObjects;
    }

    public static IRepositoryViewObject[] getCategoryViewObjects(ERepositoryObjectType type) {
        IRepositoryViewObject[] viewObjects = getCategoryViewObjects();
        if (viewObjects != null) {
            for (IRepositoryViewObject viewObj : viewObjects) {
                if (viewObj.getRepositoryObjectType().equals(type)) {
                    return new IRepositoryViewObject[] { viewObj };
                }
            }
        }
        return new IRepositoryViewObject[0];
    }

    private static IRepositoryViewObject rootViewObj = null;

    public static IRepositoryViewObject[] getCategoryViewObjectsWithRecycle() {
        if (rootViewObj == null) {
            //
            rootViewObj = null;
            Property prop = PropertiesFactory.eINSTANCE.createProperty();

            ItemState state = PropertiesFactory.eINSTANCE.createItemState();
            WorkspaceRootItem item = MdmpropertiesFactory.eINSTANCE.createWorkspaceRootItem();
            item.setState(state);
            prop.setItem(item);
            rootViewObj = new WSRootRepositoryObject(prop);
            //
            IRepositoryViewObject[] cvos = getCategoryViewObjects();
            List<IRepositoryViewObject> newViewObjs = rootViewObj.getChildren();
            for (IRepositoryViewObject viewObj : cvos) {
                newViewObjs.add(viewObj);
            }
            //

            newViewObjs.add(getCategoryViewObject(RepositoryNodeConfigurationManager.getRecycleBinNodeConfiguration()));

        }
        return new IRepositoryViewObject[] { rootViewObj };
    }

    public static IRepositoryViewObject getCategoryViewObject(IRepositoryNodeConfiguration conf) {
        Property prop = PropertiesFactory.eINSTANCE.createProperty();
        prop.setId(EcoreUtil.generateUUID());
        //
        ContainerItem item = MdmpropertiesFactory.eINSTANCE.createContainerItem();
        item.setType(FolderType.SYSTEM_FOLDER_LITERAL);

        ERepositoryObjectType type = conf.getResourceProvider().getRepositoryObjectType(item);
        if (type == null) {
            return null;
        }
        item.setRepObjType(type);
        ItemState itemState = PropertiesFactory.eINSTANCE.createItemState();
        itemState.setDeleted(false);
        itemState.setPath(""); //$NON-NLS-1$
        item.setState(itemState);
        item.setLabel(conf.getLabelProvider().getCategoryLabel(item.getRepObjType()));
        //
        prop.setItem(item);
        //
        FolderRepositoryObject containerObject = new FolderRepositoryObject(prop);
        ContainerCacheService.putContainer(containerObject);
        return containerObject;
    }

    public static List<IRepositoryViewObject> findAllViewObjects(ERepositoryObjectType type) {
        return findAllViewObjects(type, true);
    }

    public static List<IRepositoryViewObject> findAllViewObjectsWithDeleted(ERepositoryObjectType type) {
        return findAllViewObjects(type, true, true);
    }

    public static List<MDMServerObject> findAllServerObjects(ERepositoryObjectType type) {
        List<IRepositoryViewObject> viewObjects = RepositoryResourceUtil.findAllViewObjects(type);
        List<MDMServerObject> serverObjects = new LinkedList<MDMServerObject>();
        if (viewObjects != null) {
            for (IRepositoryViewObject viewObj : viewObjects) {
                Item item = viewObj.getProperty().getItem();
                if (item instanceof MDMServerObjectItem) {
                    serverObjects.add(((MDMServerObjectItem) item).getMDMServerObject());
                }
            }
        }
        return serverObjects;
    }

    public static void removeViewObjectPhysically(ERepositoryObjectType type, String name, String version, String path) {
        if (type == null || name == null) {
            throw new IllegalArgumentException();
        }
        if (version == null) {
            version = VersionUtils.DEFAULT_VERSION;
        }
        if (path == null) {
            path = ""; //$NON-NLS-1$
        }
        try {
            IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
            for (IRepositoryViewObject viewObj : factory.getAll(type)) {
                Property property = viewObj.getProperty();
                String itemPath = property.getItem().getState().getPath();
                if (itemPath.equals(path) && property.getLabel().equals(name) && property.getVersion().equals(version)) {
                    factory.deleteObjectPhysical(viewObj, version);
                    return;
                }
            }
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
    }

    public static List<IRepositoryViewObject> findAllViewObjects(ERepositoryObjectType type, boolean useRepositoryViewObject) {
        return findAllViewObjects(type, useRepositoryViewObject, false);
    }

    public static List<IRepositoryViewObject> findAllViewObjects(ERepositoryObjectType type, boolean useRepositoryViewObject,
            boolean withDeleted) {
        IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        try {
            List<IRepositoryViewObject> allObjs = factory.getAll(type, withDeleted);
            List<IRepositoryViewObject> viewObjects = new LinkedList<IRepositoryViewObject>();
            for (IRepositoryViewObject viewObj : allObjs) {
                Item item = viewObj.getProperty().getItem();
                ItemState state = item.getState();
                if (!state.isDeleted() || withDeleted) {
                    try {
                        IInteractiveHandler handler = InteractiveService.findHandler(viewObj.getRepositoryObjectType());
                        if (handler != null) {
                            handler.assertPropertyIsInited(item);
                        }
                        IRepositoryViewObject cacheViewObj = getCacheViewObject(viewObj.getProperty(), viewObj,
                                useRepositoryViewObject);
                        viewObjects.add(cacheViewObj);
                    } catch (Exception e) {
                        log.error(e.getMessage(), e);
                    }
                }
            }
            return viewObjects;
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    public static boolean isExistByName(ERepositoryObjectType type, String name) {
        List<IRepositoryViewObject> viewObjects = findAllViewObjectsWithDeleted(type);
        if (viewObjects != null) {
            for (IRepositoryViewObject viewObj : viewObjects) {
                if (viewObj.getProperty().getLabel().equalsIgnoreCase(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static IRepositoryViewObject findViewObjectByName(ERepositoryObjectType type, String name) {
        List<IRepositoryViewObject> viewObjects = findAllViewObjectsWithDeleted(type);
        if (viewObjects != null) {
            for (IRepositoryViewObject viewObj : viewObjects) {
                if (viewObj.getProperty().getLabel().equalsIgnoreCase(name)) {
                    return viewObj;
                }
            }
        }
        return null;
    }

    public static IRepositoryViewObject findViewObjectByReferenceResource(ERepositoryObjectType type, IFile file) {
        String name = file.getName();
        String ext = file.getFileExtension();
        List<IRepositoryViewObject> viewObjects = findAllViewObjectsWithDeleted(type);
        if (viewObjects != null) {
            for (IRepositoryViewObject viewObj : viewObjects) {
                Property property = viewObj.getProperty();
                if (property != null) {
                    String fileName = ResourceFilenameHelper.getExpectedFileName(property.getLabel(), property.getVersion())
                            + DOT + ext;
                    if (fileName != null && fileName.equals(name)) {
                        return viewObj;
                    }
                }
            }
        }
        return null;
    }

    public static List<IRepositoryViewObject> findViewObjects(ERepositoryObjectType type, Item parentItem) {
        return findViewObjects(type, parentItem, true);
    }

    public static boolean isDeletedFolder(Item item, ERepositoryObjectType type) {
        ItemState state = item.getState();
        if (item instanceof ContainerItem) {

            String path = ERepositoryObjectType.getFolderName(type);
            if (!path.isEmpty()) {
                path += state.getPath();
            }
            List<String> deletedFolderPaths = ProjectManager.getInstance().getCurrentProject().getEmfProject()
                    .getDeletedFolders();
            return deletedFolderPaths.contains(path);
        } else {
            return state.isDeleted();
        }
    }

    public static List<IRepositoryViewObject> findViewObjects(ERepositoryObjectType type, Item parentItem,
            boolean useRepositoryViewObject) {
        return findViewObjects(type, parentItem, useRepositoryViewObject, false);
    }

    public static List<IRepositoryViewObject> findViewObjects(ERepositoryObjectType type, Item parentItem,
            boolean useRepositoryViewObject, boolean withDeleted) {
        try {
            Project project = ProjectManager.getInstance().getCurrentProject();
            IProject fsProject = ResourceModelUtils.getProject(project);

            String path = ERepositoryObjectType.getFolderName(type);
            if (!path.isEmpty()) {
                if (!path.endsWith(DIVIDE)) {
                    path += DIVIDE;
                }
                path += parentItem.getState().getPath();
                IFolder folder = fsProject.getFolder(new Path(path));
                return findViewObjects(type, parentItem, folder, useRepositoryViewObject, withDeleted);
            }
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
        return Collections.EMPTY_LIST;

    }

    public static List<IRepositoryViewObject> findViewObjects(ERepositoryObjectType type, Item parentItem, IFolder folder,
            boolean useRepositoryViewObject, boolean withDeleted) {
        List<IRepositoryViewObject> viewObjects = new LinkedList<IRepositoryViewObject>();
        if (folder.exists()) {
            try {
                for (IResource res : folder.members()) {
                    if (res instanceof IFolder) {
                        if ((withDeleted || !isDeletedFolder((IFolder) res)) && !isSVNFolder((IFolder) res)) {
                            IRepositoryViewObject folderObject = null;

                            // firstly,to get the cached one, if not find, create it
                            String resPath = parentItem.getState().getPath() + IPath.SEPARATOR + res.getName();
                            folderObject = ContainerCacheService.get(type, resPath);

                            if (folderObject == null) {
                                folderObject = createFolderViewObject(type, res.getName(), parentItem, false);
                            }

                            viewObjects.add(folderObject);
                        }
                    }
                }
                List<IRepositoryViewObject> children = findViewObjectsInFolder(type, parentItem, useRepositoryViewObject,
                        withDeleted);
                viewObjects.addAll(children);

            } catch (CoreException e) {
                log.error(e.getMessage(), e);
            }
        }
        // ((ContainerRepositoryObject) parentItem.getParent()).getChildren().addAll(viewObjects);
        return viewObjects;
    }

    private static boolean isDeletedFolder(IFolder folder) {
        String path = folder.getProjectRelativePath().toString();
        return isDeletedFolder(path);
    }

    private static boolean isSVNFolder(IFolder folder) {
        return folder.getName().equalsIgnoreCase(SVN_FOLDER_NAME);
    }

    private static boolean isDeletedFolder(String folderPath) {
        if (folderPath == null) {
            throw new IllegalArgumentException();
        }
        List deletedFolders = ProjectManager.getInstance().getCurrentProject().getEmfProject().getDeletedFolders();
        return deletedFolders.contains(folderPath);
    }

    public static List<IRepositoryViewObject> findViewObjectsInFolder(ERepositoryObjectType type, Item parentItem,
            boolean useRepositoryViewObject) {
        return findViewObjectsInFolder(type, parentItem, useRepositoryViewObject, false);
    }

    private static IRepositoryViewObject getCacheViewObject(Property property, IRepositoryViewObject viewObj,
            boolean useRepositoryViewObject) {
        IRepositoryViewObject cacheViewObj = ContainerCacheService.get(property);
        if (cacheViewObj == null) {
            if (useRepositoryViewObject) {
                cacheViewObj = new RepositoryViewObject(property);
            } else {
                cacheViewObj = viewObj;
            }
            ContainerCacheService.put(property, cacheViewObj);
        } else {
            if (!useRepositoryViewObject) {
                ((RepositoryObject) cacheViewObj).setProperty(viewObj.getProperty());
            }
        }
        return cacheViewObj;
    }

    public static IRepositoryViewObject assertViewObject(IRepositoryViewObject viewObj) {
        if (viewObj == null) {
            throw new IllegalArgumentException();
        }
        if (viewObj instanceof RepositoryViewObject) {

            boolean reload = false;

            Property property = viewObj.getProperty();
            if (property != null) {
                Item item = property.getItem();
                Resource eResource = item.eResource();
                reload = eResource == null;
            } else {
                reload = true;
            }
            if (reload) {
                IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
                try {
                    IRepositoryViewObject newViewObj = factory.getLastVersion(viewObj.getId());
                    if (newViewObj != null) {
                        ContainerCacheService.put(newViewObj);
                    }
                    return newViewObj;
                } catch (PersistenceException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
        return viewObj;
    }

    public static Item assertItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        if (item instanceof WorkspaceRootItem) {
            return item;
        }
        Property property = item.getProperty();
        if (property != null) {

            Resource eResource = item.eResource();
            if (eResource == null) {
                IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
                try {
                    IRepositoryViewObject newViewObj = factory.getLastVersion(property.getId());
                    ContainerCacheService.put(newViewObj);
                    return newViewObj.getProperty().getItem();
                } catch (PersistenceException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }

        return item;

    }

    public static List<IRepositoryViewObject> findViewObjectsInFolder(ERepositoryObjectType type, Item parentItem,
            boolean useRepositoryViewObject, boolean withDeleted) {
        // because the IProxyRepositoryFactory doesn't expose the getSerializableFromFolder method ,so only through the
        // following to get object
        List<IRepositoryViewObject> viewObjects = new LinkedList<IRepositoryViewObject>();
        String parentPath = parentItem.getState().getPath();
        String parentPath2 = parentPath;
        if (parentPath.length() > 1) {
            if (parentPath.startsWith(DIVIDE)) {
                parentPath2 = parentPath.substring(1);
            } else {
                parentPath2 = DIVIDE + parentPath;
            }
        }
        IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        try {

            List<IRepositoryViewObject> allObjs = factory.getAll(type, withDeleted);
            for (IRepositoryViewObject viewObj : allObjs) {
                Property property = viewObj.getProperty();

                ItemState state = property.getItem().getState();
                if ((!state.isDeleted() || withDeleted)
                        && (state.getPath().equalsIgnoreCase(parentPath) || state.getPath().equalsIgnoreCase(parentPath2))) {
                    IRepositoryViewObject cacheViewObj = getCacheViewObject(property, viewObj, useRepositoryViewObject);

                    viewObjects.add(cacheViewObj);
                }
            }
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
        return viewObjects;

    }

    public static IRepositoryViewObject findViewObjectByName(ContainerItem parentItem, String objName, boolean caseSensitive) {
        List<IRepositoryViewObject> viewObjects = findViewObjectsInFolder(parentItem.getRepObjType(), parentItem, false);
        for (IRepositoryViewObject viewObj : viewObjects) {
            boolean result = caseSensitive ? viewObj.getLabel().equalsIgnoreCase(objName) : viewObj.getLabel().equals(objName);
            if (result) {
                return viewObj;
            }
        }
        return null;
    }

    public static List<IRepositoryViewObject> findViewObjectsByType(ERepositoryObjectType type, Item parentItem, int systemType) {
        return findViewObjectsByType(type, parentItem, systemType, true);
    }

    public static List<IRepositoryViewObject> findViewObjectsByType(ERepositoryObjectType type, Item parentItem, int systemType,
            boolean useRepositoryViewObject) {
        try {
            Project project = ProjectManager.getInstance().getCurrentProject();
            IProject fsProject = ResourceModelUtils.getProject(project);
            IFolder stableFolder = fsProject.getFolder(((ContainerItem) parentItem).getRepObjType().getFolder());
            List<IRepositoryViewObject> viewObjects = findViewObjects(type, parentItem, stableFolder, useRepositoryViewObject,
                    false);

            return viewObjects;
        } catch (PersistenceException e) {
            return Collections.EMPTY_LIST;
        }
    }

    public static Item getItemFromRepViewObj(Object element) {
        synchronized (element) {
            if (element instanceof IRepositoryViewObject) {
                Item item = ((IRepositoryViewObject) element).getProperty().getItem();
                return item;
            }
            return null;
        }
    }

    public static boolean hasContainerItem(Object obj, FolderType... fTypes) {

        if (obj instanceof FolderRepositoryObject) {
            if (fTypes == null) {
                return true;
            }
            FolderType type = ((FolderItem) ((FolderRepositoryObject) obj).getProperty().getItem()).getType();
            for (FolderType fType : fTypes) {
                if (type == fType) {
                    return true;
                }
            }
        }
        return false;
    }

    public static RepositoryNode convertToNode(IRepositoryViewObject viewObj) {
        Item item = viewObj.getProperty().getItem();
        ENodeType type = ENodeType.REPOSITORY_ELEMENT;

        if (item instanceof ContainerItem) {
            FolderType folderType = ((ContainerItem) item).getType();
            switch (folderType.getValue()) {
            case FolderType.SYSTEM_FOLDER:
                type = ENodeType.SYSTEM_FOLDER;
                break;
            case FolderType.STABLE_SYSTEM_FOLDER:
                type = ENodeType.STABLE_SYSTEM_FOLDER;
                break;
            case FolderType.FOLDER:
                type = ENodeType.SIMPLE_FOLDER;
                break;
            default:
                break;
            }

        }
        ERepositoryObjectType repObjType = viewObj.getRepositoryObjectType();
        RepositoryNode node = new MDMRepositoryNode(viewObj, null, type);

        node.setProperties(EProperties.LABEL, viewObj.getLabel());
        node.setProperties(EProperties.CONTENT_TYPE, repObjType);

        addChildrenToNode(viewObj, node);

        return node;
    }

    /**
     * convert viewObj's children to RepositoryNode type and add to node as its children
     * 
     * @param viewObj
     * @param node RepositoryNode Object corresponding to viewObj
     */
    private static void addChildrenToNode(IRepositoryViewObject viewObj, RepositoryNode node) {
        if (viewObj instanceof FolderRepositoryObject) {
            List<IRepositoryViewObject> children = findViewObjects(viewObj.getRepositoryObjectType(), viewObj.getProperty()
                    .getItem());
            if (children != null && children.size() > 0) {
                for (IRepositoryViewObject child : children) {
                    RepositoryNode convertToNode = convertToNode(child);
                    convertToNode.setParent(node);
                    node.getChildren().add(convertToNode);
                }
            }
        }
    }

    public static IEditorReference isOpenedInEditor(IRepositoryViewObject viewObj) {
        IEditorReference[] editorReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getEditorReferences();
        for (IEditorReference ref : editorReferences) {
            if (ref != null) {
                try {
                    IEditorInput editorInput = ref.getEditorInput();
                    if (editorInput instanceof IRepositoryViewEditorInput) {
                        Item inputItem = ((IRepositoryViewEditorInput) editorInput).getInputItem();
                        if (inputItem != null) {
                            IRepositoryViewObject vObj = ContainerCacheService.get(inputItem.getProperty());
                            if (vObj != null && vObj.equals(viewObj)) {
                                return ref;
                            }
                        }
                    }

                    if (RepositoryWorkflowUtil.isWorkflowEditorFromBPM(ref.getEditor(false))) {
                        IRepositoryViewObject workflowViewObject = RepositoryWorkflowUtil.getWorkflowViewObject(ref
                                .getEditor(false));
                        if (isIdEquals(viewObj, workflowViewObject)) {
                            return ref;
                        }
                    }

                    if (editorInput instanceof ProcessEditorInput) {
                        ProcessEditorInput processEditorInput = (ProcessEditorInput) editorInput;
                        Property property = processEditorInput.getItem().getProperty();
                        if (viewObj.getProperty().getId().equals(property.getId())) {
                            return ref;
                        }
                    }
                } catch (PartInitException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
        return null;
    }

    private static boolean isIdEquals(IRepositoryViewObject objA, IRepositoryViewObject objB) {
        if (objA != null && objB != null && objA.getId().equals(objB.getId())) {
            return true;
        }

        return false;
    }

    public static void closeEditor(IEditorReference ref, boolean save) {
        if (ref != null) {
            IEditorReference[] editorRefs = new IEditorReference[] { ref };
            IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            activePage.closeEditors(editorRefs, save);
        }
    }

    public static void closeEditor(IRepositoryViewObject viewObj, boolean save) {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorReference[] editorReferences = activePage.getEditorReferences();
        for (IEditorReference ref : editorReferences) {
            if (ref != null) {
                try {
                    IEditorInput editorInput = ref.getEditorInput();
                    if (editorInput instanceof IRepositoryViewEditorInput) {
                        Item inputItem = ((IRepositoryViewEditorInput) editorInput).getInputItem();
                        if (inputItem != null) {
                            IRepositoryViewObject vObj = ContainerCacheService.get(inputItem.getProperty());
                            if (vObj != null && vObj.equals(viewObj)) {
                                activePage.closeEditors(new IEditorReference[] { ref }, save);
                            }
                        }
                    }
                } catch (PartInitException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
    }

    public static void initialize() {
        IProgressService progressService = PlatformUI.getWorkbench().getProgressService();
        try {
            progressService.run(true, true, initializeProcess);
        } catch (InvocationTargetException e) {
            log.error(e.getMessage(), e);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }

    }

    private static IRunnableWithProgress initializeProcess = new IRunnableWithProgress() {

        public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
            try {
                final ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                factory.initialize();
            } catch (PersistenceException e) {
                log.error(e.getMessage(), e);
            }

        }
    };

    private static Map<String, ERepositoryObjectType> typePathMap = null;

    public static ERepositoryObjectType getTypeByPath(String path) {
        if (typePathMap == null) {
            typePathMap = new HashMap<String, ERepositoryObjectType>();
            for (ERepositoryObjectType type : IServerObjectRepositoryType.ALL_TYPES) {
                typePathMap.put(type.getFolder(), type);
            }
        }
        return typePathMap.get(path);
    }

    public static final String PROP_LAST_SERVER_DEF = "lastServerDef"; //$NON-NLS-1$

    /**
     * 
     * @param viewObj
     * @return A decrypted serverDef
     */
    public static MDMServerDef getLastServerDef(IRepositoryViewObject viewObj) {
        if (viewObj != null) {
            Item item = viewObj.getProperty().getItem();
            return getLastServerDef(item);
        }
        return null;
    }

    /**
     * 
     * @param item
     * @return A decrypted serverDef
     */
    public static MDMServerDef getLastServerDef(Item item) {
        if (item != null) {
            if (item instanceof MDMServerObjectItem) {
                MDMServerDef lastServerDef = ((MDMServerObjectItem) item).getMDMServerObject().getLastServerDef();
                if (lastServerDef != null) {
                    return lastServerDef.getDecryptedServerDef();
                }
            }
            Property property = item.getProperty();
            if (property != null) {
                Object value = property.getAdditionalProperties().get(PROP_LAST_SERVER_DEF);
                if (value != null) {
                    return ServerDefService.findServerDefByName((String) value);
                }
            }
        }
        return null;
    }

    /**
     * 
     * @param item
     * @param def need A decrypted serverDef
     */
    @SuppressWarnings("unchecked")
    public static void setLastServerDef(Item item, MDMServerDef def) {
        if (item == null) {
            return;
        }
        if (item instanceof MDMServerObjectItem) {
            MDMServerObject mdmServerObject = ((MDMServerObjectItem) item).getMDMServerObject();
            if (def != null) {
                MDMServerDef encryptedServerDef = def.getEncryptedServerDef();
                mdmServerObject.setLastServerDef(encryptedServerDef);
            } else {
                mdmServerObject.setLastServerDef(null);
            }
            return;
        }
        Property property = item.getProperty();
        if (property != null) {
            if (def != null) {
                property.getAdditionalProperties().put(PROP_LAST_SERVER_DEF, def.getName());
            } else {
                property.getAdditionalProperties().remove(PROP_LAST_SERVER_DEF);
            }
        }

    }

    public static boolean isOpenedItemInEditor(IRepositoryViewObject objectToMove) {
        try {
            if (objectToMove != null) {
                IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                if (activeWorkbenchWindow != null) {
                    IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
                    if (activePage != null) {
                        IEditorReference[] editorReferences = activePage.getEditorReferences();
                        if (editorReferences != null) {
                            for (IEditorReference editorReference : editorReferences) {
                                IEditorInput editorInput = editorReference.getEditorInput();
                                if ((editorInput != null && editorInput instanceof IRepositoryViewEditorInput)) {
                                    IRepositoryViewEditorInput rInput = (IRepositoryViewEditorInput) editorInput;
                                    if (rInput != null) {
                                        Property openedProperty = rInput.getInputItem().getProperty();
                                        if (openedProperty.getId().equals(objectToMove.getId())
                                                && VersionUtils.compareTo(openedProperty.getVersion(), objectToMove.getVersion()) == 0) {
                                            return true;
                                        }
                                    }
                                } else if (objectToMove.getProperty().getItem() instanceof BusinessProcessItem) {
                                    Object obj = editorInput.getAdapter(IRepositoryEditorInput.class);
                                    if (obj instanceof IRepositoryEditorInput) {
                                        IRepositoryEditorInput rInput = (IRepositoryEditorInput) obj;
                                        if (rInput != null) {
                                            Property openedProperty = rInput.getItem().getProperty();
                                            if (openedProperty.getId().equals(objectToMove.getId())
                                                    && VersionUtils.compareTo(openedProperty.getVersion(),
                                                            objectToMove.getVersion()) == 0) {
                                                return true;
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        } catch (PartInitException e) {
            ExceptionHandler.process(e);
        }
        return false;
    }

    public static WSConceptKey getBusinessConceptKey(WSGetBusinessConceptKey businessConcepKey) throws RemoteException,
            XtentisException {
        String pk = businessConcepKey.getWsDataModelPK().getPk();
        String concept = businessConcepKey.getConcept();
        WSDataModelE dataModel = RepositoryQueryService.findDataModelByName(pk);
        if (dataModel != null) {
            try {
                XSDSchema xsdSchema = Util.getXSDSchema(dataModel.getXsdSchema());
                for (XSDIdentityConstraintDefinition idDef : xsdSchema.getIdentityConstraintDefinitions()) {

                    if (idDef.getName().equals(concept)) {
                        WSConceptKey key = new WSConceptKey();
                        //
                        XSDXPathDefinition selector = idDef.getSelector();
                        key.setSelector(selector.getValue());
                        //
                        EList<XSDXPathDefinition> fields = idDef.getFields();
                        String[] keyFields = new String[fields.size()];
                        int i = 0;
                        for (XSDXPathDefinition pathDef : fields) {
                            keyFields[i] = pathDef.getValue();
                            i++;
                        }
                        key.setFields(keyFields);
                        return key;
                    }
                }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }
        return null;
    }
}
