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
package com.amalto.workbench.detailtabs.sections;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xsd.XSDParticle;

import com.amalto.workbench.detailtabs.exception.CommitException;
import com.amalto.workbench.detailtabs.exception.CommitValidationException;
import com.amalto.workbench.detailtabs.sections.composites.ElementInfoConfigComposite;
import com.amalto.workbench.detailtabs.sections.model.ISubmittable;
import com.amalto.workbench.detailtabs.sections.model.element.ElementWrapper;

public class ElementMainSection extends CommitBarListenerSection<XSDParticle> {

    private XSDParticle curXSDParticle;

    private ElementInfoConfigComposite compElementInfoCfg;

    private ElementWrapper elementWrapper;

    @Override
    protected XSDParticle getEditedObj() {
        return curXSDParticle;
    }

    @Override
    protected void initUIContents(XSDParticle editedObj) {
        curXSDParticle = editedObj;

        compElementInfoCfg.setXSDParticle(curXSDParticle);
    }

    @Override
    protected ISubmittable getSubmittedObj() {
        elementWrapper = new ElementWrapper(curXSDParticle, compElementInfoCfg.getElementName(),
                compElementInfoCfg.getElementReference(), compElementInfoCfg.getMinCardinality(),
                compElementInfoCfg.getMaxCardinality());

        return elementWrapper;
    }

    @Override
    protected boolean doSubmit() throws CommitException, CommitValidationException {

        boolean result = super.doSubmit();

        initUIContents(elementWrapper.getSourceElement());

        return result;
    }

    @Override
    protected String getSectionTitle() {
        return "Main";
    }

    @Override
    protected void createControlsInSection(Composite compSectionClient) {

        compSectionClient.setLayout(new GridLayout());

        compElementInfoCfg = new ElementInfoConfigComposite(compSectionClient, SWT.NONE,this,curXSDParticle);
        GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
        compElementInfoCfg.setLayoutData(data);

    }

}