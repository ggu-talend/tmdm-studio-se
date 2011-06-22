/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmserverobject.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.mdm.repository.model.mdmserverobject.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdmserverobjectFactoryImpl extends EFactoryImpl implements MdmserverobjectFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MdmserverobjectFactory init() {
        try {
            MdmserverobjectFactory theMdmserverobjectFactory = (MdmserverobjectFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.talend.org/mdmserverobject"); 
            if (theMdmserverobjectFactory != null) {
                return theMdmserverobjectFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MdmserverobjectFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MdmserverobjectFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case MdmserverobjectPackage.MDM_SERVER_OBJECT: return createMDMServerObject();
            case MdmserverobjectPackage.EWS_MENU: return createEWSMenu();
            case MdmserverobjectPackage.EWS_MENU_ENTRY: return createEWSMenuEntry();
            case MdmserverobjectPackage.WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E: return createWSMenuMenuEntriesDescriptionsE();
            case MdmserverobjectPackage.WS_ROLE_E: return createWSRoleE();
            case MdmserverobjectPackage.WS_ROLE_SPECIFICATION_E: return createWSRoleSpecificationE();
            case MdmserverobjectPackage.WS_ROLE_SPECIFICATION_INSTANCE_E: return createWSRoleSpecificationInstanceE();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case MdmserverobjectPackage.STRING_ARRAY:
                return createStringArrayFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case MdmserverobjectPackage.STRING_ARRAY:
                return convertStringArrayToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MDMServerObject createMDMServerObject() {
        MDMServerObjectImpl mdmServerObject = new MDMServerObjectImpl();
        return mdmServerObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EWSMenu createEWSMenu() {
        EWSMenuImpl ewsMenu = new EWSMenuImpl();
        return ewsMenu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EWSMenuEntry createEWSMenuEntry() {
        EWSMenuEntryImpl ewsMenuEntry = new EWSMenuEntryImpl();
        return ewsMenuEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WSMenuMenuEntriesDescriptionsE createWSMenuMenuEntriesDescriptionsE() {
        WSMenuMenuEntriesDescriptionsEImpl wsMenuMenuEntriesDescriptionsE = new WSMenuMenuEntriesDescriptionsEImpl();
        return wsMenuMenuEntriesDescriptionsE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WSRoleE createWSRoleE() {
        WSRoleEImpl wsRoleE = new WSRoleEImpl();
        return wsRoleE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WSRoleSpecificationE createWSRoleSpecificationE() {
        WSRoleSpecificationEImpl wsRoleSpecificationE = new WSRoleSpecificationEImpl();
        return wsRoleSpecificationE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WSRoleSpecificationInstanceE createWSRoleSpecificationInstanceE() {
        WSRoleSpecificationInstanceEImpl wsRoleSpecificationInstanceE = new WSRoleSpecificationInstanceEImpl();
        return wsRoleSpecificationInstanceE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
        return (String[])super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MdmserverobjectPackage getMdmserverobjectPackage() {
        return (MdmserverobjectPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MdmserverobjectPackage getPackage() {
        return MdmserverobjectPackage.eINSTANCE;
    }

} //MdmserverobjectFactoryImpl