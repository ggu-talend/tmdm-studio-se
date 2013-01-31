// ============================================================================
//
// Copyright (C) 2006-2013 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.core.service;

import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.talend.core.IService;
import org.talend.core.model.repository.IRepositoryViewObject;

/**
 * created by HHB on 2013-1-23 Detailled comment
 * 
 */
public interface IModelValidationService extends IService {

    public static final int VALIDATE_IMMEDIATE = 1;

    public static final int VALIDATE_AFTER_SAVE = 2;

    public static final int VALIDATE_BEFORE_DEPLOY = 4;

    public static final int BUTTON_OK = IDialogConstants.OK_ID;

    public static final int BUTTON_CANCEL = IDialogConstants.CANCEL_ID;

    public static final int BUTTON_SKIP_ERROR = IDialogConstants.SKIP_ID;

    public static final int BUTTON_SKIP_ERROR_WARNING = IDialogConstants.CLIENT_ID + 1;

    /**
     * DOC HHB Comment method "validate".
     * 
     * @param viewObjs
     * @param condition defined in current interface VALIDATE_XXXX
     * @return TODO
     */
    public int validate(List<IRepositoryViewObject> viewObjs, int condition);
}