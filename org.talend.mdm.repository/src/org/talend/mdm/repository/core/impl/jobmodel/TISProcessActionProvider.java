// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2011 Talend �C www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.mdm.repository.core.impl.jobmodel;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.ui.navigator.CommonViewer;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.FolderType;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.mdm.repository.core.AbstractRepositoryAction;
import org.talend.mdm.repository.core.impl.RepositoryNodeActionProviderAdapter;
import org.talend.mdm.repository.model.mdmproperties.ContainerItem;
import org.talend.mdm.repository.ui.actions.bridge.CreateFolderAction;
import org.talend.mdm.repository.ui.actions.bridge.DeleteAction;
import org.talend.mdm.repository.ui.actions.bridge.RenameFolderAction;
import org.talend.mdm.repository.ui.actions.job.CreateProcessAction;
import org.talend.mdm.repository.ui.actions.job.EditProcessAction;
import org.talend.mdm.repository.ui.actions.job.GenerateJobTransformerAction;
import org.talend.mdm.repository.ui.actions.job.OpenExistVersionProcessAction;
import org.talend.mdm.repository.ui.actions.job.ReadProcessAction;
import org.talend.mdm.repository.ui.actions.job.RunProcessAction;
import org.talend.mdm.repository.ui.editors.IRepositoryViewEditorInput;

/**
 * DOC hbhong class global comment. Detailled comment <br/>
 * 
 */
public class TISProcessActionProvider extends RepositoryNodeActionProviderAdapter {

    AbstractRepositoryAction createFolderAction;

    AbstractRepositoryAction createProcessAction;

    AbstractRepositoryAction renameFolderAction;

    AbstractRepositoryAction editProcessAction;

    AbstractRepositoryAction readProcessAction;

    AbstractRepositoryAction runProcessAction;

    AbstractRepositoryAction openExistVersionProcessAction;

    AbstractRepositoryAction generateTransformerAction;

    AbstractRepositoryAction deleteAction;

    // AbstractRepositoryAction exportJobScriptAction;

    @Override
    public void initCommonViewer(CommonViewer commonViewer) {
        super.initCommonViewer(commonViewer);
        createFolderAction = new CreateFolderAction();
        renameFolderAction = new RenameFolderAction();
        createProcessAction = new CreateProcessAction();
        editProcessAction = new EditProcessAction();
        readProcessAction = new ReadProcessAction();
        runProcessAction = new RunProcessAction();
        openExistVersionProcessAction = new OpenExistVersionProcessAction();
        deleteAction = new DeleteAction();
        generateTransformerAction = new GenerateJobTransformerAction();

        // exportJobScriptAction = new ExportJobScriptAction();
        //
        createFolderAction.initCommonViewer(commonViewer);
        renameFolderAction.initCommonViewer(commonViewer);
        createProcessAction.initCommonViewer(commonViewer);
        editProcessAction.initCommonViewer(commonViewer);
        readProcessAction.initCommonViewer(commonViewer);
        runProcessAction.initCommonViewer(commonViewer);
        openExistVersionProcessAction.initCommonViewer(commonViewer);
        deleteAction.initCommonViewer(commonViewer);
        generateTransformerAction.initCommonViewer(commonViewer);
        // exportJobScriptAction.initCommonViewer(commonViewer);

    }

    @Override
    public List<AbstractRepositoryAction> getActions(IRepositoryViewObject viewObj) {
        List<AbstractRepositoryAction> actions = new LinkedList<AbstractRepositoryAction>();
        Item item = viewObj.getProperty().getItem();
        if (item instanceof ContainerItem) {
            FolderType type = ((FolderItem) item).getType();
            switch (type.getValue()) {
            case FolderType.SYSTEM_FOLDER:
                actions.add(createFolderAction);
                actions.add(createProcessAction);
                break;
            case FolderType.STABLE_SYSTEM_FOLDER:
                actions.add(createFolderAction);
                break;

            case FolderType.FOLDER:
                actions.add(createProcessAction);
                actions.add(createFolderAction);
                actions.add(renameFolderAction);
                actions.add(deleteAction);
                break;
            }

        } else if (item instanceof ProcessItem) {
            actions.add(editProcessAction);
            actions.add(readProcessAction);
            actions.add(runProcessAction);
            actions.add(openExistVersionProcessAction);
            // actions.add(exportJobScriptAction);
            actions.add(deleteAction);
            actions.add(generateTransformerAction);
        }
        return actions;
    }

    @Override
    public AbstractRepositoryAction getOpenAction(IRepositoryViewObject viewObj) {
        return editProcessAction;
    }

    @Override
    public IRepositoryViewEditorInput getOpenEditorInput(Item item) {
        return null;
    }

}