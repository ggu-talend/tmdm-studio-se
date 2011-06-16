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
package com.amalto.workbench.editors.xsdeditor;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTerm;

public class XSDSelectionListener implements ISelectionChangedListener {

    XSDEditor editor;

    XSDSchema xsdSchema;

    public XSDSelectionListener(XSDEditor editor, XSDSchema xsdSchema) {
        this.editor = editor;
        this.xsdSchema = xsdSchema;
    }

    public void selectionChanged(SelectionChangedEvent event) {
        // do not fire selection in source editor if the current active page is the InternalXSDMultiPageEditor (source)
        // We only want to make source selections if the active page is either the outline or properties (a modify
        // has been done via the outline or properties and not the source view). We don't want to be selecting
        // and unselecting things in the source when editing in the source!!
        boolean makeSelection = true;
        if (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() != null) {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            if (page.getActivePart() instanceof XSDEditor) {
                if (editor.getActivePage() == editor.SOURCE_PAGE_INDEX) {
                    makeSelection = false;
                }
            }
        }

        // do not fire selection in source editor if selection event came
        // from source editor
        if (event.getSource() != editor.getTextEditor().getSelectionProvider() && makeSelection) {
            ISelection selection = event.getSelection();
            if (selection instanceof StructuredSelection) {

                XSDElementDeclaration element = getElement(((StructuredSelection) selection).getFirstElement());
                if (element == null)
                    return;
                // find the element in Design page' xsdSchema according to DataModelMainPage's selection element
                XSDElementDeclaration sel = null;
                for (XSDElementDeclaration el : editor.getXSDSchema().getElementDeclarations()) {
                    if (el.getName().equals(element.getName())) {
                        sel = el;
                        break;
                    }
                }
                if (sel != null)
                    editor.getSelectionManager().setSelection(new StructuredSelection(sel));
            }
        }
    }

    /**
     * get the selection element in the datamodelmainpage's TreeViewer
     * 
     * @param object
     * @return
     */
    private XSDElementDeclaration getElement(Object object) {
        XSDElementDeclaration el;
        if (object instanceof XSDElementDeclaration) {
            el = (XSDElementDeclaration) object;
            return el;
        }
        if (object instanceof XSDParticle) {
            XSDTerm term = ((XSDParticle) object).getTerm();
            if (term instanceof XSDElementDeclaration) {
                return (XSDElementDeclaration) term;
            }
        }
        if (object instanceof XSDModelGroup) {
            XSDModelGroup group = (XSDModelGroup) object;
            if (group.getContainer() instanceof XSDParticle) {
                if (((XSDParticle) group.getContainer()).getTerm() instanceof XSDElementDeclaration)
                    return (XSDElementDeclaration) ((XSDParticle) group.getContainer()).getTerm();
            }
        }
        return null;
    }

}