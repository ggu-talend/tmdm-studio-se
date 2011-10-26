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
package org.talend.mdm.repository.ui.wizards.imports.viewer;

import java.util.List;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.talend.mdm.repository.ui.widgets.AbstractNodeCheckTreeViewer;
import org.talend.repository.imports.ImportItemUtil;
import org.talend.repository.imports.ItemRecord;
import org.talend.repository.imports.TreeBuilder.IContainerNode;

import com.amalto.workbench.widgets.FilteredCheckboxTree;

/**
 * DOC hbhong class global comment. Detailled comment
 */
public class ImportRepositoryObjectCheckTreeViewer extends AbstractNodeCheckTreeViewer {

    private ImportItemUtil repositoryUtil;

    /**
     * DOC hbhong RepositoryObjectCheckTreeViewer constructor comment.
     * 
     * @param repositoryUtil
     */
    public ImportRepositoryObjectCheckTreeViewer(ImportItemUtil repositoryUtil) {
        super(new StructuredSelection());
        this.repositoryUtil = repositoryUtil;
    }

    /**
     * DOC hbhong RepositoryObjectCheckTreeViewer constructor comment.
     * 
     * @param selection
     */
    public ImportRepositoryObjectCheckTreeViewer(IStructuredSelection selection) {
        super(selection);
    }

    protected void createTreeViewer(Composite itemComposite) {
        filteredCheckboxTree = new FilteredCheckboxTree(itemComposite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI) {

            ContainerCheckedTreeViewer treeViewer;

            @Override
            protected CheckboxTreeViewer doCreateTreeViewer(Composite parent, int style) {
                treeViewer = new ContainerCheckedTreeViewer(parent);
                treeViewer.setContentProvider(new ITreeContentProvider() {

                    public void dispose() {
                    }

                    public Object[] getChildren(Object parentElement) {
                        if (parentElement instanceof IContainerNode) {
                            return ((IContainerNode) parentElement).getChildren().toArray();
                        }
                        return null;
                    }

                    public Object[] getElements(Object inputElement) {
                        // return getValidItems();
                        return repositoryUtil.getTreeViewInput().toArray();
                    }

                    public Object getParent(Object element) {
                        return null;
                    }

                    public boolean hasChildren(Object element) {
                        if (element instanceof IContainerNode) {
                            return ((IContainerNode) element).hasChildren();
                        }
                        return false;
                    }

                    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
                    }

                });

                treeViewer.setLabelProvider(new LabelProvider() {

                    @Override
                    public Image getImage(Object element) {
                        if (element instanceof IContainerNode) {
                            return ((IContainerNode) element).getImage();
                        } else if (element instanceof ItemRecord) {
                            return ((ItemRecord) element).getImage();
                        }

                        return super.getImage(element);
                    }

                    @Override
                    public String getText(Object element) {
                        if (element instanceof IContainerNode) {
                            return ((IContainerNode) element).getLabel();
                        }
                        return ((ItemRecord) element).getLabel();
                    }

                });
                return treeViewer;
            }

            @Override
            protected boolean isNodeCollectable(TreeItem item) {
                return false;
            }

            @Override
            protected void refreshCompleted() {
                treeViewer.expandToLevel(3);
                restoreCheckedElements();
            }
        };

    }

    @Override
    protected void filterCheckedObjects(Object[] selected, List<Object> ret) {
        for (Object obj : selected) {
            ret.add(obj);
        }

    }

}
