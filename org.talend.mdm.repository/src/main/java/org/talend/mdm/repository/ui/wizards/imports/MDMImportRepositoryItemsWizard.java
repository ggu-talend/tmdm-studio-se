// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.ui.wizards.imports;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.wizards.datatransfer.ArchiveFileManipulations;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;
import org.eclipse.ui.internal.wizards.datatransfer.TarException;
import org.eclipse.ui.internal.wizards.datatransfer.TarFile;
import org.eclipse.ui.internal.wizards.datatransfer.TarLeveledStructureProvider;
import org.eclipse.ui.internal.wizards.datatransfer.ZipLeveledStructureProvider;
import org.eclipse.ui.progress.UIJob;
import org.talend.mdm.repository.ui.navigator.MDMRepositoryView;
import org.talend.mdm.repository.ui.wizards.imports.viewer.ImportRepositoryObjectCheckTreeViewer;
import org.talend.repository.imports.ImportItemUtil;
import org.talend.repository.imports.ItemRecord;
import org.talend.repository.imports.ResourcesManager;
import org.talend.repository.imports.ResourcesManagerFactory;

import com.amalto.workbench.export.ImportItemsWizard;

/**
 * DOC hywang class global comment. Detailled comment
 */
public class MDMImportRepositoryItemsWizard extends ImportItemsWizard {

    private ImportItemUtil repositoryUtil = new ImportItemUtil();

    private List<ItemRecord> selectedItems = new ArrayList<ItemRecord>();

    private ResourcesManager manager;

    ImportRepositoryObjectCheckTreeViewer checkTreeViewer;

    public MDMImportRepositoryItemsWizard(IStructuredSelection sel) {
        super(sel);
    }

    @Override
    public void doImport(Object[] selectedObjs, IProgressMonitor monitor) {
        List<ItemRecord> itemRecords = new LinkedList<ItemRecord>();
        for (Object obj : selectedObjs) {
            if (obj instanceof ItemRecord) {
                itemRecords.add((ItemRecord) obj);
            }
        }
        repositoryUtil.importItemRecords(manager, itemRecords, monitor, isOverride, null, ""); //$NON-NLS-1$
    }

    protected void createOverwriteBtn(Composite composite) {
        btnOverwrite = new Button(composite, SWT.CHECK);
        btnOverwrite.setText("Overwrite existing items"); //$NON-NLS-N$
        btnOverwrite.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                isOverride = btnOverwrite.getSelection();
                parse();
            }

        });
    }

    @Override
    protected void createViewer() {
        checkTreeViewer = new ImportRepositoryObjectCheckTreeViewer(repositoryUtil);
    }

    /** need to override this method to list all the import items to the viewer **/
    @Override
    protected void parses(boolean importFromArchieve, String zipFilePath, IProgressMonitor monitor) {
        selectedItems.clear();
        String importPath = importFromArchieve ? zipFilePath : importFolder;
        final Collection<ItemRecord> items = new ArrayList<ItemRecord>();

        monitor.beginTask(DataTransferMessages.WizardProjectsImportPage_SearchingMessage, 100);
        File directory = new File(importPath);
        monitor.worked(10);
        if (importFromArchieve && ArchiveFileManipulations.isTarFile(importPath)) {
            TarFile sourceTarFile = getSpecifiedTarSourceFile(importPath);
            if (sourceTarFile == null) {
                return;
            }

            TarLeveledStructureProvider provider = new TarLeveledStructureProvider(sourceTarFile);
            manager = ResourcesManagerFactory.getInstance().createResourcesManager(provider);

            if (!manager.collectPath2Object(provider.getRoot())) {
                return;
            }
        } else if (importFromArchieve && ArchiveFileManipulations.isZipFile(importPath)) {
            ZipFile sourceFile = getSpecifiedZipSourceFile(importPath);
            if (sourceFile == null) {
                return;
            }
            ZipLeveledStructureProvider provider = new ZipLeveledStructureProvider(sourceFile);
            manager = ResourcesManagerFactory.getInstance().createResourcesManager(provider);

            if (!manager.collectPath2Object(provider.getRoot())) {
                return;
            }
        } else if (!importFromArchieve && directory.isDirectory()) {
            manager = ResourcesManagerFactory.getInstance().createResourcesManager();

            if (!manager.collectPath2Object(directory)) {
                return;
            }
        } else {
            monitor.worked(60);
        }
        repositoryUtil.clearAllData();
        if (manager != null)
            items.addAll(repositoryUtil.populateItems(manager, isOverride, monitor));

        selectedItems.addAll(items);

        this.getShell().getDisplay().syncExec(new Runnable() {

            public void run() {
                checkTreeViewer.getViewer().setInput(repositoryUtil.getTreeViewInput());
            }
        });

        monitor.done();

    }

    @Override
    protected Object[] getCheckedObjects() {
        return checkTreeViewer.getCheckNodes();
    }

    private ZipFile getSpecifiedZipSourceFile(String fileName) {
        if (fileName.length() == 0) {
            return null;
        }

        try {
            return new ZipFile(fileName);
        } catch (ZipException e) {
            displayErrorDialog(DataTransferMessages.ZipImport_badFormat);
        } catch (IOException e) {
            displayErrorDialog(DataTransferMessages.ZipImport_couldNotRead);
        }

        zip.getText().setFocus();
        return null;
    }

    private TarFile getSpecifiedTarSourceFile(String fileName) {
        if (fileName.length() == 0) {
            return null;
        }

        try {
            return new TarFile(fileName);
        } catch (TarException e) {
            displayErrorDialog(DataTransferMessages.TarImport_badFormat);
        } catch (IOException e) {
            displayErrorDialog(DataTransferMessages.ZipImport_couldNotRead);
        }

        zip.getText().setFocus();
        return null;
    }

    protected void displayErrorDialog(String message) {
        MessageDialog.openError(getContainer().getShell(), getErrorDialogTitle(), message);
    }

    protected String getErrorDialogTitle() {
        return IDEWorkbenchMessages.WizardExportPage_internalErrorTitle;
    }

    @Override
    protected void refreshViewJob() {
        new UIJob("Refreshing server") {

            @Override
            public IStatus runInUIThread(IProgressMonitor monitor) {
                MDMRepositoryView.show().getCommonViewer().refresh();
                return Status.OK_STATUS;
            }

        }.schedule();
    }


    protected Composite initItemTreeViewer(Composite composite) {
        Composite returnComposite = checkTreeViewer.createItemList(composite);
        checkTreeViewer.getViewer().setInput(null);
        checkTreeViewer.setItemText("Select items to import:");
        return returnComposite;
    }

}