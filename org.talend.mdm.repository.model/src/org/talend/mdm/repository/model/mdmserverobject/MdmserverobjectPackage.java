/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmserverobject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.mdm.repository.model.mdmserverobject.MdmserverobjectFactory
 * @model kind="package"
 * @generated
 */
public interface MdmserverobjectPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "mdmserverobject";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/mdmserverobject";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "mdmserverobject";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MdmserverobjectPackage eINSTANCE = org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.MDMServerObjectImpl <em>MDM Server Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MDMServerObjectImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getMDMServerObject()
     * @generated
     */
    int MDM_SERVER_OBJECT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT__SYSTEM = 2;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT__LAST_SERVER_DEF = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT__TYPE = 4;

    /**
     * The number of structural features of the '<em>MDM Server Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEImpl <em>WS Menu E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSMenuE()
     * @generated
     */
    int WS_MENU_E = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Menu Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_E__MENU_ENTRIES = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>WS Menu E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEntryEImpl <em>WS Menu Entry E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEntryEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSMenuEntryE()
     * @generated
     */
    int WS_MENU_ENTRY_E = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ENTRY_E__ID = 0;

    /**
     * The feature id for the '<em><b>Application</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ENTRY_E__APPLICATION = 1;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ENTRY_E__CONTEXT = 2;

    /**
     * The feature id for the '<em><b>Icon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ENTRY_E__ICON = 3;

    /**
     * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ENTRY_E__DESCRIPTIONS = 4;

    /**
     * The feature id for the '<em><b>Sub Menus</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ENTRY_E__SUB_MENUS = 5;

    /**
     * The number of structural features of the '<em>WS Menu Entry E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ENTRY_E_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuMenuEntriesDescriptionsEImpl <em>WS Menu Menu Entries Descriptions E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuMenuEntriesDescriptionsEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSMenuMenuEntriesDescriptionsE()
     * @generated
     */
    int WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E = 3;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E__LANGUAGE = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E__LABEL = 1;

    /**
     * The number of structural features of the '<em>WS Menu Menu Entries Descriptions E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleEImpl <em>WS Role E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSRoleE()
     * @generated
     */
    int WS_ROLE_E = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Specification</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_E__SPECIFICATION = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>WS Role E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationEImpl <em>WS Role Specification E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSRoleSpecificationE()
     * @generated
     */
    int WS_ROLE_SPECIFICATION_E = 5;

    /**
     * The feature id for the '<em><b>Admin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_E__ADMIN = 0;

    /**
     * The feature id for the '<em><b>Object Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_E__OBJECT_TYPE = 1;

    /**
     * The feature id for the '<em><b>Instance</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_E__INSTANCE = 2;

    /**
     * The number of structural features of the '<em>WS Role Specification E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_E_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationInstanceEImpl <em>WS Role Specification Instance E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationInstanceEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSRoleSpecificationInstanceE()
     * @generated
     */
    int WS_ROLE_SPECIFICATION_INSTANCE_E = 6;

    /**
     * The feature id for the '<em><b>Instance Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_INSTANCE_E__INSTANCE_NAME = 0;

    /**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_INSTANCE_E__WRITABLE = 1;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_INSTANCE_E__PARAMETER = 2;

    /**
     * The number of structural features of the '<em>WS Role Specification Instance E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_SPECIFICATION_INSTANCE_E_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSViewEImpl <em>WS View E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSViewEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSViewE()
     * @generated
     */
    int WS_VIEW_E = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Searchable Business Elements</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__SEARCHABLE_BUSINESS_ELEMENTS = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Viewable Business Elements</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__VIEWABLE_BUSINESS_ELEMENTS = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Transformer Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__TRANSFORMER_ACTIVE = MDM_SERVER_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Where Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__WHERE_CONDITIONS = MDM_SERVER_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Transformer Active</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E__IS_TRANSFORMER_ACTIVE = MDM_SERVER_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>WS View E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_VIEW_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereConditionEImpl <em>WS Where Condition E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereConditionEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSWhereConditionE()
     * @generated
     */
    int WS_WHERE_CONDITION_E = 8;

    /**
     * The feature id for the '<em><b>Left Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_CONDITION_E__LEFT_PATH = 0;

    /**
     * The feature id for the '<em><b>Right Value Or Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_CONDITION_E__RIGHT_VALUE_OR_PATH = 1;

    /**
     * The feature id for the '<em><b>String Predicate</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_CONDITION_E__STRING_PREDICATE = 2;

    /**
     * The feature id for the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_CONDITION_E__OPERATOR = 3;

    /**
     * The feature id for the '<em><b>Spell Check</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_CONDITION_E__SPELL_CHECK = 4;

    /**
     * The number of structural features of the '<em>WS Where Condition E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_CONDITION_E_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereOperatorEImpl <em>WS Where Operator E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereOperatorEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSWhereOperatorE()
     * @generated
     */
    int WS_WHERE_OPERATOR_E = 9;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_OPERATOR_E__VALUE = 0;

    /**
     * The number of structural features of the '<em>WS Where Operator E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WHERE_OPERATOR_E_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSStringPredicateEImpl <em>WS String Predicate E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSStringPredicateEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSStringPredicateE()
     * @generated
     */
    int WS_STRING_PREDICATE_E = 10;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STRING_PREDICATE_E__VALUE = 0;

    /**
     * The number of structural features of the '<em>WS String Predicate E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STRING_PREDICATE_E_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSDataModelEImpl <em>WS Data Model E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSDataModelEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSDataModelE()
     * @generated
     */
    int WS_DATA_MODEL_E = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_MODEL_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_MODEL_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_MODEL_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_MODEL_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_MODEL_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Xsd Schema</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_MODEL_E__XSD_SCHEMA = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>WS Data Model E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_MODEL_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSDataClusterEImpl <em>WS Data Cluster E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSDataClusterEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSDataClusterE()
     * @generated
     */
    int WS_DATA_CLUSTER_E = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_CLUSTER_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_CLUSTER_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_CLUSTER_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_CLUSTER_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_CLUSTER_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Vocabulary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_CLUSTER_E__VOCABULARY = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>WS Data Cluster E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_DATA_CLUSTER_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSStoredProcedureEImpl <em>WS Stored Procedure E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSStoredProcedureEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSStoredProcedureE()
     * @generated
     */
    int WS_STORED_PROCEDURE_E = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Procedure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E__PROCEDURE = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Refresh Cache</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E__REFRESH_CACHE = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>WS Stored Procedure E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_STORED_PROCEDURE_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseEImpl <em>WS Universe E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSUniverseE()
     * @generated
     */
    int WS_UNIVERSE_E = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Default Items Revision ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__DEFAULT_ITEMS_REVISION_ID = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xtentis Objects Revision IDs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__XTENTIS_OBJECTS_REVISION_IDS = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Items Revision IDs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E__ITEMS_REVISION_IDS = MDM_SERVER_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>WS Universe E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseXtentisObjectsRevisionIDsEImpl <em>WS Universe Xtentis Objects Revision IDs E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseXtentisObjectsRevisionIDsEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSUniverseXtentisObjectsRevisionIDsE()
     * @generated
     */
    int WS_UNIVERSE_XTENTIS_OBJECTS_REVISION_IDS_E = 15;

    /**
     * The feature id for the '<em><b>Xtentis Object Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_XTENTIS_OBJECTS_REVISION_IDS_E__XTENTIS_OBJECT_NAME = 0;

    /**
     * The feature id for the '<em><b>Revision ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_XTENTIS_OBJECTS_REVISION_IDS_E__REVISION_ID = 1;

    /**
     * The number of structural features of the '<em>WS Universe Xtentis Objects Revision IDs E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_XTENTIS_OBJECTS_REVISION_IDS_E_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseItemsRevisionIDsEImpl <em>WS Universe Items Revision IDs E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseItemsRevisionIDsEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSUniverseItemsRevisionIDsE()
     * @generated
     */
    int WS_UNIVERSE_ITEMS_REVISION_IDS_E = 16;

    /**
     * The feature id for the '<em><b>Concept Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_ITEMS_REVISION_IDS_E__CONCEPT_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Xtentis Object Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_ITEMS_REVISION_IDS_E__XTENTIS_OBJECT_NAME = 1;

    /**
     * The number of structural features of the '<em>WS Universe Items Revision IDs E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_UNIVERSE_ITEMS_REVISION_IDS_E_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanEImpl <em>WS Synchronization Plan E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanE()
     * @generated
     */
    int WS_SYNCHRONIZATION_PLAN_E = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Remote System Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_NAME = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Remote System URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_URL = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Remote System Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_USERNAME = MDM_SERVER_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Remote System Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_PASSWORD = MDM_SERVER_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Tis URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__TIS_URL = MDM_SERVER_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Tis Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__TIS_USERNAME = MDM_SERVER_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Tis Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__TIS_PASSWORD = MDM_SERVER_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Tis Parameters</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__TIS_PARAMETERS = MDM_SERVER_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Xtentis Objects Synchronizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS = MDM_SERVER_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Items Synchronizations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS = MDM_SERVER_OBJECT_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>WS Synchronization Plan E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanItemsSynchronizationsEImpl <em>WS Synchronization Plan Items Synchronizations E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanItemsSynchronizationsEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E = 18;

    /**
     * The feature id for the '<em><b>Concept Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__CONCEPT_NAME = 0;

    /**
     * The feature id for the '<em><b>Ids Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__IDS_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Local Cluster</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__LOCAL_CLUSTER = 2;

    /**
     * The feature id for the '<em><b>Local Revision ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__LOCAL_REVISION_ID = 3;

    /**
     * The feature id for the '<em><b>Remote Cluster</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__REMOTE_CLUSTER = 4;

    /**
     * The feature id for the '<em><b>Remote Revision ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__REMOTE_REVISION_ID = 5;

    /**
     * The feature id for the '<em><b>Algorithm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__ALGORITHM = 6;

    /**
     * The number of structural features of the '<em>WS Synchronization Plan Items Synchronizations E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsEImpl <em>WS Synchronization Plan Xtentis Objects Synchronizations E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanXtentisObjectsSynchronizationsE()
     * @generated
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_E = 19;

    /**
     * The feature id for the '<em><b>Xtentis Object Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_E__XTENTIS_OBJECT_NAME = 0;

    /**
     * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_E__SYNCHRONIZATIONS = 1;

    /**
     * The number of structural features of the '<em>WS Synchronization Plan Xtentis Objects Synchronizations E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_E_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsEImpl <em>WS Synchronization Plan Xtentis Objects Synchronizations Synchronizations E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE()
     * @generated
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E = 20;

    /**
     * The feature id for the '<em><b>Instance Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__INSTANCE_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Local Revision ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__LOCAL_REVISION_ID = 1;

    /**
     * The feature id for the '<em><b>Remote Revision ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__REMOTE_REVISION_ID = 2;

    /**
     * The feature id for the '<em><b>Algorithm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__ALGORITHM = 3;

    /**
     * The number of structural features of the '<em>WS Synchronization Plan Xtentis Objects Synchronizations Synchronizations E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSBooleanEImpl <em>WS Boolean E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSBooleanEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSBooleanE()
     * @generated
     */
    int WS_BOOLEAN_E = 21;

    /**
     * The feature id for the '<em><b>true</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_BOOLEAN_E__TRUE = 0;

    /**
     * The number of structural features of the '<em>WS Boolean E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_BOOLEAN_E_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSWorkflowDeployEImpl <em>WS Workflow Deploy E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSWorkflowDeployEImpl
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSWorkflowDeployE()
     * @generated
     */
    int WS_WORKFLOW_DEPLOY_E = 22;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WORKFLOW_DEPLOY_E__NAME = MDM_SERVER_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WORKFLOW_DEPLOY_E__DESCRIPTION = MDM_SERVER_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WORKFLOW_DEPLOY_E__SYSTEM = MDM_SERVER_OBJECT__SYSTEM;

    /**
     * The feature id for the '<em><b>Last Server Def</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WORKFLOW_DEPLOY_E__LAST_SERVER_DEF = MDM_SERVER_OBJECT__LAST_SERVER_DEF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WORKFLOW_DEPLOY_E__TYPE = MDM_SERVER_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WORKFLOW_DEPLOY_E__FILENAME = MDM_SERVER_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>WS Workflow Deploy E</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_WORKFLOW_DEPLOY_E_FEATURE_COUNT = MDM_SERVER_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '<em>String Array</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getStringArray()
     * @generated
     */
    int STRING_ARRAY = 23;


    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.MDMServerObject <em>MDM Server Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MDM Server Object</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.MDMServerObject
     * @generated
     */
    EClass getMDMServerObject();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getName()
     * @see #getMDMServerObject()
     * @generated
     */
    EAttribute getMDMServerObject_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getDescription()
     * @see #getMDMServerObject()
     * @generated
     */
    EAttribute getMDMServerObject_Description();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#isSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#isSystem()
     * @see #getMDMServerObject()
     * @generated
     */
    EAttribute getMDMServerObject_System();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getLastServerDef <em>Last Server Def</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Last Server Def</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getLastServerDef()
     * @see #getMDMServerObject()
     * @generated
     */
    EReference getMDMServerObject_LastServerDef();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.MDMServerObject#getType()
     * @see #getMDMServerObject()
     * @generated
     */
    EAttribute getMDMServerObject_Type();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuE <em>WS Menu E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Menu E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuE
     * @generated
     */
    EClass getWSMenuE();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuE#getMenuEntries <em>Menu Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Menu Entries</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuE#getMenuEntries()
     * @see #getWSMenuE()
     * @generated
     */
    EReference getWSMenuE_MenuEntries();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE <em>WS Menu Entry E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Menu Entry E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE
     * @generated
     */
    EClass getWSMenuEntryE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getId()
     * @see #getWSMenuEntryE()
     * @generated
     */
    EAttribute getWSMenuEntryE_Id();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getApplication <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getApplication()
     * @see #getWSMenuEntryE()
     * @generated
     */
    EAttribute getWSMenuEntryE_Application();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getContext()
     * @see #getWSMenuEntryE()
     * @generated
     */
    EAttribute getWSMenuEntryE_Context();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getIcon <em>Icon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Icon</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getIcon()
     * @see #getWSMenuEntryE()
     * @generated
     */
    EAttribute getWSMenuEntryE_Icon();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getDescriptions <em>Descriptions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Descriptions</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getDescriptions()
     * @see #getWSMenuEntryE()
     * @generated
     */
    EReference getWSMenuEntryE_Descriptions();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getSubMenus <em>Sub Menus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Menus</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE#getSubMenus()
     * @see #getWSMenuEntryE()
     * @generated
     */
    EReference getWSMenuEntryE_SubMenus();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE <em>WS Menu Menu Entries Descriptions E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Menu Menu Entries Descriptions E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE
     * @generated
     */
    EClass getWSMenuMenuEntriesDescriptionsE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE#getLanguage()
     * @see #getWSMenuMenuEntriesDescriptionsE()
     * @generated
     */
    EAttribute getWSMenuMenuEntriesDescriptionsE_Language();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE#getLabel()
     * @see #getWSMenuMenuEntriesDescriptionsE()
     * @generated
     */
    EAttribute getWSMenuMenuEntriesDescriptionsE_Label();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleE <em>WS Role E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Role E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleE
     * @generated
     */
    EClass getWSRoleE();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleE#getSpecification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Specification</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleE#getSpecification()
     * @see #getWSRoleE()
     * @generated
     */
    EReference getWSRoleE_Specification();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE <em>WS Role Specification E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Role Specification E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE
     * @generated
     */
    EClass getWSRoleSpecificationE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE#isAdmin <em>Admin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Admin</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE#isAdmin()
     * @see #getWSRoleSpecificationE()
     * @generated
     */
    EAttribute getWSRoleSpecificationE_Admin();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE#getObjectType <em>Object Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Object Type</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE#getObjectType()
     * @see #getWSRoleSpecificationE()
     * @generated
     */
    EAttribute getWSRoleSpecificationE_ObjectType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE#getInstance <em>Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instance</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE#getInstance()
     * @see #getWSRoleSpecificationE()
     * @generated
     */
    EReference getWSRoleSpecificationE_Instance();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE <em>WS Role Specification Instance E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Role Specification Instance E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE
     * @generated
     */
    EClass getWSRoleSpecificationInstanceE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE#getInstanceName <em>Instance Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instance Name</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE#getInstanceName()
     * @see #getWSRoleSpecificationInstanceE()
     * @generated
     */
    EAttribute getWSRoleSpecificationInstanceE_InstanceName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE#isWritable <em>Writable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Writable</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE#isWritable()
     * @see #getWSRoleSpecificationInstanceE()
     * @generated
     */
    EAttribute getWSRoleSpecificationInstanceE_Writable();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameter</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE#getParameter()
     * @see #getWSRoleSpecificationInstanceE()
     * @generated
     */
    EAttribute getWSRoleSpecificationInstanceE_Parameter();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSViewE <em>WS View E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS View E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSViewE
     * @generated
     */
    EClass getWSViewE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSViewE#getSearchableBusinessElements <em>Searchable Business Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Searchable Business Elements</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSViewE#getSearchableBusinessElements()
     * @see #getWSViewE()
     * @generated
     */
    EAttribute getWSViewE_SearchableBusinessElements();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSViewE#getViewableBusinessElements <em>Viewable Business Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Viewable Business Elements</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSViewE#getViewableBusinessElements()
     * @see #getWSViewE()
     * @generated
     */
    EAttribute getWSViewE_ViewableBusinessElements();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSViewE#isTransformerActive <em>Transformer Active</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transformer Active</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSViewE#isTransformerActive()
     * @see #getWSViewE()
     * @generated
     */
    EAttribute getWSViewE_TransformerActive();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSViewE#getWhereConditions <em>Where Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Where Conditions</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSViewE#getWhereConditions()
     * @see #getWSViewE()
     * @generated
     */
    EReference getWSViewE_WhereConditions();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.mdm.repository.model.mdmserverobject.WSViewE#getIsTransformerActive <em>Is Transformer Active</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Is Transformer Active</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSViewE#getIsTransformerActive()
     * @see #getWSViewE()
     * @generated
     */
    EReference getWSViewE_IsTransformerActive();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE <em>WS Where Condition E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Where Condition E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE
     * @generated
     */
    EClass getWSWhereConditionE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getLeftPath <em>Left Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Left Path</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getLeftPath()
     * @see #getWSWhereConditionE()
     * @generated
     */
    EAttribute getWSWhereConditionE_LeftPath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getRightValueOrPath <em>Right Value Or Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Right Value Or Path</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getRightValueOrPath()
     * @see #getWSWhereConditionE()
     * @generated
     */
    EAttribute getWSWhereConditionE_RightValueOrPath();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getStringPredicate <em>String Predicate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>String Predicate</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getStringPredicate()
     * @see #getWSWhereConditionE()
     * @generated
     */
    EReference getWSWhereConditionE_StringPredicate();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operator</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#getOperator()
     * @see #getWSWhereConditionE()
     * @generated
     */
    EReference getWSWhereConditionE_Operator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#isSpellCheck <em>Spell Check</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Spell Check</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE#isSpellCheck()
     * @see #getWSWhereConditionE()
     * @generated
     */
    EAttribute getWSWhereConditionE_SpellCheck();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereOperatorE <em>WS Where Operator E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Where Operator E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereOperatorE
     * @generated
     */
    EClass getWSWhereOperatorE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereOperatorE#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereOperatorE#getValue()
     * @see #getWSWhereOperatorE()
     * @generated
     */
    EAttribute getWSWhereOperatorE_Value();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSStringPredicateE <em>WS String Predicate E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS String Predicate E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSStringPredicateE
     * @generated
     */
    EClass getWSStringPredicateE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSStringPredicateE#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSStringPredicateE#getValue()
     * @see #getWSStringPredicateE()
     * @generated
     */
    EAttribute getWSStringPredicateE_Value();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSDataModelE <em>WS Data Model E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Data Model E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSDataModelE
     * @generated
     */
    EClass getWSDataModelE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSDataModelE#getXsdSchema <em>Xsd Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xsd Schema</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSDataModelE#getXsdSchema()
     * @see #getWSDataModelE()
     * @generated
     */
    EAttribute getWSDataModelE_XsdSchema();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSDataClusterE <em>WS Data Cluster E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Data Cluster E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSDataClusterE
     * @generated
     */
    EClass getWSDataClusterE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSDataClusterE#getVocabulary <em>Vocabulary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vocabulary</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSDataClusterE#getVocabulary()
     * @see #getWSDataClusterE()
     * @generated
     */
    EAttribute getWSDataClusterE_Vocabulary();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE <em>WS Stored Procedure E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Stored Procedure E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE
     * @generated
     */
    EClass getWSStoredProcedureE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE#getProcedure <em>Procedure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Procedure</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE#getProcedure()
     * @see #getWSStoredProcedureE()
     * @generated
     */
    EAttribute getWSStoredProcedureE_Procedure();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE#isRefreshCache <em>Refresh Cache</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Refresh Cache</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE#isRefreshCache()
     * @see #getWSStoredProcedureE()
     * @generated
     */
    EAttribute getWSStoredProcedureE_RefreshCache();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseE <em>WS Universe E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Universe E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseE
     * @generated
     */
    EClass getWSUniverseE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseE#getDefaultItemsRevisionID <em>Default Items Revision ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Items Revision ID</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseE#getDefaultItemsRevisionID()
     * @see #getWSUniverseE()
     * @generated
     */
    EAttribute getWSUniverseE_DefaultItemsRevisionID();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseE#getXtentisObjectsRevisionIDs <em>Xtentis Objects Revision IDs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Xtentis Objects Revision IDs</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseE#getXtentisObjectsRevisionIDs()
     * @see #getWSUniverseE()
     * @generated
     */
    EReference getWSUniverseE_XtentisObjectsRevisionIDs();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseE#getItemsRevisionIDs <em>Items Revision IDs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Items Revision IDs</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseE#getItemsRevisionIDs()
     * @see #getWSUniverseE()
     * @generated
     */
    EReference getWSUniverseE_ItemsRevisionIDs();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE <em>WS Universe Xtentis Objects Revision IDs E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Universe Xtentis Objects Revision IDs E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE
     * @generated
     */
    EClass getWSUniverseXtentisObjectsRevisionIDsE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE#getXtentisObjectName <em>Xtentis Object Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xtentis Object Name</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE#getXtentisObjectName()
     * @see #getWSUniverseXtentisObjectsRevisionIDsE()
     * @generated
     */
    EAttribute getWSUniverseXtentisObjectsRevisionIDsE_XtentisObjectName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE#getRevisionID <em>Revision ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision ID</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE#getRevisionID()
     * @see #getWSUniverseXtentisObjectsRevisionIDsE()
     * @generated
     */
    EAttribute getWSUniverseXtentisObjectsRevisionIDsE_RevisionID();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE <em>WS Universe Items Revision IDs E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Universe Items Revision IDs E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE
     * @generated
     */
    EClass getWSUniverseItemsRevisionIDsE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE#getConceptPattern <em>Concept Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concept Pattern</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE#getConceptPattern()
     * @see #getWSUniverseItemsRevisionIDsE()
     * @generated
     */
    EAttribute getWSUniverseItemsRevisionIDsE_ConceptPattern();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE#getXtentisObjectName <em>Xtentis Object Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xtentis Object Name</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE#getXtentisObjectName()
     * @see #getWSUniverseItemsRevisionIDsE()
     * @generated
     */
    EAttribute getWSUniverseItemsRevisionIDsE_XtentisObjectName();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE <em>WS Synchronization Plan E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Synchronization Plan E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE
     * @generated
     */
    EClass getWSSynchronizationPlanE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemName <em>Remote System Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote System Name</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemName()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_RemoteSystemName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemURL <em>Remote System URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote System URL</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemURL()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_RemoteSystemURL();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemUsername <em>Remote System Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote System Username</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemUsername()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_RemoteSystemUsername();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemPassword <em>Remote System Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote System Password</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getRemoteSystemPassword()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_RemoteSystemPassword();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisURL <em>Tis URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tis URL</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisURL()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_TisURL();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisUsername <em>Tis Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tis Username</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisUsername()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_TisUsername();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisPassword <em>Tis Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tis Password</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisPassword()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_TisPassword();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisParameters <em>Tis Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tis Parameters</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getTisParameters()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanE_TisParameters();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getXtentisObjectsSynchronizations <em>Xtentis Objects Synchronizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Xtentis Objects Synchronizations</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getXtentisObjectsSynchronizations()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EReference getWSSynchronizationPlanE_XtentisObjectsSynchronizations();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getItemsSynchronizations <em>Items Synchronizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Items Synchronizations</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE#getItemsSynchronizations()
     * @see #getWSSynchronizationPlanE()
     * @generated
     */
    EReference getWSSynchronizationPlanE_ItemsSynchronizations();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE <em>WS Synchronization Plan Items Synchronizations E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Synchronization Plan Items Synchronizations E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE
     * @generated
     */
    EClass getWSSynchronizationPlanItemsSynchronizationsE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getConceptName <em>Concept Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concept Name</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getConceptName()
     * @see #getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanItemsSynchronizationsE_ConceptName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getIdsPattern <em>Ids Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ids Pattern</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getIdsPattern()
     * @see #getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanItemsSynchronizationsE_IdsPattern();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getLocalCluster <em>Local Cluster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Cluster</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getLocalCluster()
     * @see #getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanItemsSynchronizationsE_LocalCluster();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getLocalRevisionID <em>Local Revision ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Revision ID</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getLocalRevisionID()
     * @see #getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanItemsSynchronizationsE_LocalRevisionID();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getRemoteCluster <em>Remote Cluster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Cluster</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getRemoteCluster()
     * @see #getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanItemsSynchronizationsE_RemoteCluster();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getRemoteRevisionID <em>Remote Revision ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Revision ID</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getRemoteRevisionID()
     * @see #getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanItemsSynchronizationsE_RemoteRevisionID();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getAlgorithm <em>Algorithm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Algorithm</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE#getAlgorithm()
     * @see #getWSSynchronizationPlanItemsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanItemsSynchronizationsE_Algorithm();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE <em>WS Synchronization Plan Xtentis Objects Synchronizations E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Synchronization Plan Xtentis Objects Synchronizations E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE
     * @generated
     */
    EClass getWSSynchronizationPlanXtentisObjectsSynchronizationsE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE#getXtentisObjectName <em>Xtentis Object Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xtentis Object Name</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE#getXtentisObjectName()
     * @see #getWSSynchronizationPlanXtentisObjectsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanXtentisObjectsSynchronizationsE_XtentisObjectName();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE#getSynchronizations <em>Synchronizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Synchronizations</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE#getSynchronizations()
     * @see #getWSSynchronizationPlanXtentisObjectsSynchronizationsE()
     * @generated
     */
    EReference getWSSynchronizationPlanXtentisObjectsSynchronizationsE_Synchronizations();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE <em>WS Synchronization Plan Xtentis Objects Synchronizations Synchronizations E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Synchronization Plan Xtentis Objects Synchronizations Synchronizations E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE
     * @generated
     */
    EClass getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getInstancePattern <em>Instance Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instance Pattern</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getInstancePattern()
     * @see #getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_InstancePattern();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getLocalRevisionID <em>Local Revision ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Revision ID</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getLocalRevisionID()
     * @see #getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_LocalRevisionID();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getRemoteRevisionID <em>Remote Revision ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remote Revision ID</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getRemoteRevisionID()
     * @see #getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_RemoteRevisionID();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getAlgorithm <em>Algorithm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Algorithm</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE#getAlgorithm()
     * @see #getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE()
     * @generated
     */
    EAttribute getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_Algorithm();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSBooleanE <em>WS Boolean E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Boolean E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSBooleanE
     * @generated
     */
    EClass getWSBooleanE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSBooleanE#is_true <em>true</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>true</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSBooleanE#is_true()
     * @see #getWSBooleanE()
     * @generated
     */
    EAttribute getWSBooleanE__true();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmserverobject.WSWorkflowDeployE <em>WS Workflow Deploy E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Workflow Deploy E</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWorkflowDeployE
     * @generated
     */
    EClass getWSWorkflowDeployE();

    /**
     * Returns the meta object for the attribute '{@link org.talend.mdm.repository.model.mdmserverobject.WSWorkflowDeployE#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWorkflowDeployE#getFilename()
     * @see #getWSWorkflowDeployE()
     * @generated
     */
    EAttribute getWSWorkflowDeployE_Filename();

    /**
     * Returns the meta object for data type '<em>String Array</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>String Array</em>'.
     * @model instanceClass="java.lang.String[]"
     * @generated
     */
    EDataType getStringArray();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MdmserverobjectFactory getMdmserverobjectFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.MDMServerObjectImpl <em>MDM Server Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MDMServerObjectImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getMDMServerObject()
         * @generated
         */
        EClass MDM_SERVER_OBJECT = eINSTANCE.getMDMServerObject();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MDM_SERVER_OBJECT__NAME = eINSTANCE.getMDMServerObject_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MDM_SERVER_OBJECT__DESCRIPTION = eINSTANCE.getMDMServerObject_Description();

        /**
         * The meta object literal for the '<em><b>System</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MDM_SERVER_OBJECT__SYSTEM = eINSTANCE.getMDMServerObject_System();

        /**
         * The meta object literal for the '<em><b>Last Server Def</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MDM_SERVER_OBJECT__LAST_SERVER_DEF = eINSTANCE.getMDMServerObject_LastServerDef();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MDM_SERVER_OBJECT__TYPE = eINSTANCE.getMDMServerObject_Type();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEImpl <em>WS Menu E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSMenuE()
         * @generated
         */
        EClass WS_MENU_E = eINSTANCE.getWSMenuE();

        /**
         * The meta object literal for the '<em><b>Menu Entries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_MENU_E__MENU_ENTRIES = eINSTANCE.getWSMenuE_MenuEntries();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEntryEImpl <em>WS Menu Entry E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuEntryEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSMenuEntryE()
         * @generated
         */
        EClass WS_MENU_ENTRY_E = eINSTANCE.getWSMenuEntryE();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_MENU_ENTRY_E__ID = eINSTANCE.getWSMenuEntryE_Id();

        /**
         * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_MENU_ENTRY_E__APPLICATION = eINSTANCE.getWSMenuEntryE_Application();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_MENU_ENTRY_E__CONTEXT = eINSTANCE.getWSMenuEntryE_Context();

        /**
         * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_MENU_ENTRY_E__ICON = eINSTANCE.getWSMenuEntryE_Icon();

        /**
         * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_MENU_ENTRY_E__DESCRIPTIONS = eINSTANCE.getWSMenuEntryE_Descriptions();

        /**
         * The meta object literal for the '<em><b>Sub Menus</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_MENU_ENTRY_E__SUB_MENUS = eINSTANCE.getWSMenuEntryE_SubMenus();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuMenuEntriesDescriptionsEImpl <em>WS Menu Menu Entries Descriptions E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSMenuMenuEntriesDescriptionsEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSMenuMenuEntriesDescriptionsE()
         * @generated
         */
        EClass WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E = eINSTANCE.getWSMenuMenuEntriesDescriptionsE();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E__LANGUAGE = eINSTANCE.getWSMenuMenuEntriesDescriptionsE_Language();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_MENU_MENU_ENTRIES_DESCRIPTIONS_E__LABEL = eINSTANCE.getWSMenuMenuEntriesDescriptionsE_Label();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleEImpl <em>WS Role E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSRoleE()
         * @generated
         */
        EClass WS_ROLE_E = eINSTANCE.getWSRoleE();

        /**
         * The meta object literal for the '<em><b>Specification</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_ROLE_E__SPECIFICATION = eINSTANCE.getWSRoleE_Specification();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationEImpl <em>WS Role Specification E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSRoleSpecificationE()
         * @generated
         */
        EClass WS_ROLE_SPECIFICATION_E = eINSTANCE.getWSRoleSpecificationE();

        /**
         * The meta object literal for the '<em><b>Admin</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_ROLE_SPECIFICATION_E__ADMIN = eINSTANCE.getWSRoleSpecificationE_Admin();

        /**
         * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_ROLE_SPECIFICATION_E__OBJECT_TYPE = eINSTANCE.getWSRoleSpecificationE_ObjectType();

        /**
         * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_ROLE_SPECIFICATION_E__INSTANCE = eINSTANCE.getWSRoleSpecificationE_Instance();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationInstanceEImpl <em>WS Role Specification Instance E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSRoleSpecificationInstanceEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSRoleSpecificationInstanceE()
         * @generated
         */
        EClass WS_ROLE_SPECIFICATION_INSTANCE_E = eINSTANCE.getWSRoleSpecificationInstanceE();

        /**
         * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_ROLE_SPECIFICATION_INSTANCE_E__INSTANCE_NAME = eINSTANCE.getWSRoleSpecificationInstanceE_InstanceName();

        /**
         * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_ROLE_SPECIFICATION_INSTANCE_E__WRITABLE = eINSTANCE.getWSRoleSpecificationInstanceE_Writable();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_ROLE_SPECIFICATION_INSTANCE_E__PARAMETER = eINSTANCE.getWSRoleSpecificationInstanceE_Parameter();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSViewEImpl <em>WS View E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSViewEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSViewE()
         * @generated
         */
        EClass WS_VIEW_E = eINSTANCE.getWSViewE();

        /**
         * The meta object literal for the '<em><b>Searchable Business Elements</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_VIEW_E__SEARCHABLE_BUSINESS_ELEMENTS = eINSTANCE.getWSViewE_SearchableBusinessElements();

        /**
         * The meta object literal for the '<em><b>Viewable Business Elements</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_VIEW_E__VIEWABLE_BUSINESS_ELEMENTS = eINSTANCE.getWSViewE_ViewableBusinessElements();

        /**
         * The meta object literal for the '<em><b>Transformer Active</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_VIEW_E__TRANSFORMER_ACTIVE = eINSTANCE.getWSViewE_TransformerActive();

        /**
         * The meta object literal for the '<em><b>Where Conditions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_VIEW_E__WHERE_CONDITIONS = eINSTANCE.getWSViewE_WhereConditions();

        /**
         * The meta object literal for the '<em><b>Is Transformer Active</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_VIEW_E__IS_TRANSFORMER_ACTIVE = eINSTANCE.getWSViewE_IsTransformerActive();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereConditionEImpl <em>WS Where Condition E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereConditionEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSWhereConditionE()
         * @generated
         */
        EClass WS_WHERE_CONDITION_E = eINSTANCE.getWSWhereConditionE();

        /**
         * The meta object literal for the '<em><b>Left Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_WHERE_CONDITION_E__LEFT_PATH = eINSTANCE.getWSWhereConditionE_LeftPath();

        /**
         * The meta object literal for the '<em><b>Right Value Or Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_WHERE_CONDITION_E__RIGHT_VALUE_OR_PATH = eINSTANCE.getWSWhereConditionE_RightValueOrPath();

        /**
         * The meta object literal for the '<em><b>String Predicate</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_WHERE_CONDITION_E__STRING_PREDICATE = eINSTANCE.getWSWhereConditionE_StringPredicate();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_WHERE_CONDITION_E__OPERATOR = eINSTANCE.getWSWhereConditionE_Operator();

        /**
         * The meta object literal for the '<em><b>Spell Check</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_WHERE_CONDITION_E__SPELL_CHECK = eINSTANCE.getWSWhereConditionE_SpellCheck();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereOperatorEImpl <em>WS Where Operator E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSWhereOperatorEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSWhereOperatorE()
         * @generated
         */
        EClass WS_WHERE_OPERATOR_E = eINSTANCE.getWSWhereOperatorE();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_WHERE_OPERATOR_E__VALUE = eINSTANCE.getWSWhereOperatorE_Value();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSStringPredicateEImpl <em>WS String Predicate E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSStringPredicateEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSStringPredicateE()
         * @generated
         */
        EClass WS_STRING_PREDICATE_E = eINSTANCE.getWSStringPredicateE();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_STRING_PREDICATE_E__VALUE = eINSTANCE.getWSStringPredicateE_Value();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSDataModelEImpl <em>WS Data Model E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSDataModelEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSDataModelE()
         * @generated
         */
        EClass WS_DATA_MODEL_E = eINSTANCE.getWSDataModelE();

        /**
         * The meta object literal for the '<em><b>Xsd Schema</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_DATA_MODEL_E__XSD_SCHEMA = eINSTANCE.getWSDataModelE_XsdSchema();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSDataClusterEImpl <em>WS Data Cluster E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSDataClusterEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSDataClusterE()
         * @generated
         */
        EClass WS_DATA_CLUSTER_E = eINSTANCE.getWSDataClusterE();

        /**
         * The meta object literal for the '<em><b>Vocabulary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_DATA_CLUSTER_E__VOCABULARY = eINSTANCE.getWSDataClusterE_Vocabulary();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSStoredProcedureEImpl <em>WS Stored Procedure E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSStoredProcedureEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSStoredProcedureE()
         * @generated
         */
        EClass WS_STORED_PROCEDURE_E = eINSTANCE.getWSStoredProcedureE();

        /**
         * The meta object literal for the '<em><b>Procedure</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_STORED_PROCEDURE_E__PROCEDURE = eINSTANCE.getWSStoredProcedureE_Procedure();

        /**
         * The meta object literal for the '<em><b>Refresh Cache</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_STORED_PROCEDURE_E__REFRESH_CACHE = eINSTANCE.getWSStoredProcedureE_RefreshCache();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseEImpl <em>WS Universe E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSUniverseE()
         * @generated
         */
        EClass WS_UNIVERSE_E = eINSTANCE.getWSUniverseE();

        /**
         * The meta object literal for the '<em><b>Default Items Revision ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_UNIVERSE_E__DEFAULT_ITEMS_REVISION_ID = eINSTANCE.getWSUniverseE_DefaultItemsRevisionID();

        /**
         * The meta object literal for the '<em><b>Xtentis Objects Revision IDs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_UNIVERSE_E__XTENTIS_OBJECTS_REVISION_IDS = eINSTANCE.getWSUniverseE_XtentisObjectsRevisionIDs();

        /**
         * The meta object literal for the '<em><b>Items Revision IDs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_UNIVERSE_E__ITEMS_REVISION_IDS = eINSTANCE.getWSUniverseE_ItemsRevisionIDs();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseXtentisObjectsRevisionIDsEImpl <em>WS Universe Xtentis Objects Revision IDs E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseXtentisObjectsRevisionIDsEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSUniverseXtentisObjectsRevisionIDsE()
         * @generated
         */
        EClass WS_UNIVERSE_XTENTIS_OBJECTS_REVISION_IDS_E = eINSTANCE.getWSUniverseXtentisObjectsRevisionIDsE();

        /**
         * The meta object literal for the '<em><b>Xtentis Object Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_UNIVERSE_XTENTIS_OBJECTS_REVISION_IDS_E__XTENTIS_OBJECT_NAME = eINSTANCE.getWSUniverseXtentisObjectsRevisionIDsE_XtentisObjectName();

        /**
         * The meta object literal for the '<em><b>Revision ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_UNIVERSE_XTENTIS_OBJECTS_REVISION_IDS_E__REVISION_ID = eINSTANCE.getWSUniverseXtentisObjectsRevisionIDsE_RevisionID();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseItemsRevisionIDsEImpl <em>WS Universe Items Revision IDs E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSUniverseItemsRevisionIDsEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSUniverseItemsRevisionIDsE()
         * @generated
         */
        EClass WS_UNIVERSE_ITEMS_REVISION_IDS_E = eINSTANCE.getWSUniverseItemsRevisionIDsE();

        /**
         * The meta object literal for the '<em><b>Concept Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_UNIVERSE_ITEMS_REVISION_IDS_E__CONCEPT_PATTERN = eINSTANCE.getWSUniverseItemsRevisionIDsE_ConceptPattern();

        /**
         * The meta object literal for the '<em><b>Xtentis Object Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_UNIVERSE_ITEMS_REVISION_IDS_E__XTENTIS_OBJECT_NAME = eINSTANCE.getWSUniverseItemsRevisionIDsE_XtentisObjectName();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanEImpl <em>WS Synchronization Plan E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanE()
         * @generated
         */
        EClass WS_SYNCHRONIZATION_PLAN_E = eINSTANCE.getWSSynchronizationPlanE();

        /**
         * The meta object literal for the '<em><b>Remote System Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_NAME = eINSTANCE.getWSSynchronizationPlanE_RemoteSystemName();

        /**
         * The meta object literal for the '<em><b>Remote System URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_URL = eINSTANCE.getWSSynchronizationPlanE_RemoteSystemURL();

        /**
         * The meta object literal for the '<em><b>Remote System Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_USERNAME = eINSTANCE.getWSSynchronizationPlanE_RemoteSystemUsername();

        /**
         * The meta object literal for the '<em><b>Remote System Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_PASSWORD = eINSTANCE.getWSSynchronizationPlanE_RemoteSystemPassword();

        /**
         * The meta object literal for the '<em><b>Tis URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__TIS_URL = eINSTANCE.getWSSynchronizationPlanE_TisURL();

        /**
         * The meta object literal for the '<em><b>Tis Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__TIS_USERNAME = eINSTANCE.getWSSynchronizationPlanE_TisUsername();

        /**
         * The meta object literal for the '<em><b>Tis Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__TIS_PASSWORD = eINSTANCE.getWSSynchronizationPlanE_TisPassword();

        /**
         * The meta object literal for the '<em><b>Tis Parameters</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_E__TIS_PARAMETERS = eINSTANCE.getWSSynchronizationPlanE_TisParameters();

        /**
         * The meta object literal for the '<em><b>Xtentis Objects Synchronizations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS = eINSTANCE.getWSSynchronizationPlanE_XtentisObjectsSynchronizations();

        /**
         * The meta object literal for the '<em><b>Items Synchronizations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS = eINSTANCE.getWSSynchronizationPlanE_ItemsSynchronizations();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanItemsSynchronizationsEImpl <em>WS Synchronization Plan Items Synchronizations E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanItemsSynchronizationsEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanItemsSynchronizationsE()
         * @generated
         */
        EClass WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE();

        /**
         * The meta object literal for the '<em><b>Concept Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__CONCEPT_NAME = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE_ConceptName();

        /**
         * The meta object literal for the '<em><b>Ids Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__IDS_PATTERN = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE_IdsPattern();

        /**
         * The meta object literal for the '<em><b>Local Cluster</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__LOCAL_CLUSTER = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE_LocalCluster();

        /**
         * The meta object literal for the '<em><b>Local Revision ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__LOCAL_REVISION_ID = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE_LocalRevisionID();

        /**
         * The meta object literal for the '<em><b>Remote Cluster</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__REMOTE_CLUSTER = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE_RemoteCluster();

        /**
         * The meta object literal for the '<em><b>Remote Revision ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__REMOTE_REVISION_ID = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE_RemoteRevisionID();

        /**
         * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_ITEMS_SYNCHRONIZATIONS_E__ALGORITHM = eINSTANCE.getWSSynchronizationPlanItemsSynchronizationsE_Algorithm();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsEImpl <em>WS Synchronization Plan Xtentis Objects Synchronizations E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanXtentisObjectsSynchronizationsE()
         * @generated
         */
        EClass WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_E = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsE();

        /**
         * The meta object literal for the '<em><b>Xtentis Object Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_E__XTENTIS_OBJECT_NAME = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsE_XtentisObjectName();

        /**
         * The meta object literal for the '<em><b>Synchronizations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_E__SYNCHRONIZATIONS = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsE_Synchronizations();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsEImpl <em>WS Synchronization Plan Xtentis Objects Synchronizations Synchronizations E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE()
         * @generated
         */
        EClass WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE();

        /**
         * The meta object literal for the '<em><b>Instance Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__INSTANCE_PATTERN = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_InstancePattern();

        /**
         * The meta object literal for the '<em><b>Local Revision ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__LOCAL_REVISION_ID = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_LocalRevisionID();

        /**
         * The meta object literal for the '<em><b>Remote Revision ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__REMOTE_REVISION_ID = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_RemoteRevisionID();

        /**
         * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_SYNCHRONIZATION_PLAN_XTENTIS_OBJECTS_SYNCHRONIZATIONS_SYNCHRONIZATIONS_E__ALGORITHM = eINSTANCE.getWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE_Algorithm();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSBooleanEImpl <em>WS Boolean E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSBooleanEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSBooleanE()
         * @generated
         */
        EClass WS_BOOLEAN_E = eINSTANCE.getWSBooleanE();

        /**
         * The meta object literal for the '<em><b>true</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_BOOLEAN_E__TRUE = eINSTANCE.getWSBooleanE__true();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmserverobject.impl.WSWorkflowDeployEImpl <em>WS Workflow Deploy E</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.WSWorkflowDeployEImpl
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getWSWorkflowDeployE()
         * @generated
         */
        EClass WS_WORKFLOW_DEPLOY_E = eINSTANCE.getWSWorkflowDeployE();

        /**
         * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WS_WORKFLOW_DEPLOY_E__FILENAME = eINSTANCE.getWSWorkflowDeployE_Filename();

        /**
         * The meta object literal for the '<em>String Array</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmserverobject.impl.MdmserverobjectPackageImpl#getStringArray()
         * @generated
         */
        EDataType STRING_ARRAY = eINSTANCE.getStringArray();

    }

} //MdmserverobjectPackage
