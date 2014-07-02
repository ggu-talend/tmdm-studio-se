// ============================================================================
//
// Copyright (C) 2006-2014 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package com.amalto.workbench.actions;

import com.amalto.workbench.exadapter.IExAdapter;
import com.amalto.workbench.models.TreeObject;
import com.amalto.workbench.webservices.XtentisPort;

/**
 * created by HHB on 2014-1-7 Detailled comment
 * 
 */
public interface IEditXObjectActionExAdapter extends IExAdapter<EditXObjectAction> {

    void run(XtentisPort port, TreeObject xobject);
}