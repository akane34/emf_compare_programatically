/**
 */
package co.edu.uniandes.diff.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.diff.metamodel.DiffFactory
 * @model kind="package"
 * @generated
 */
public interface DiffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uniandes.edu.co/diff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffPackage eINSTANCE = co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.DiffImpl <em>Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getDiff()
	 * @generated
	 */
	int DIFF = 0;

	/**
	 * The feature id for the '<em><b>New Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__NEW_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Old Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__OLD_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Refactoring Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__REFACTORING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__CHANGE = 3;

	/**
	 * The number of structural features of the '<em>Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.RefactoringTypeImpl <em>Refactoring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.RefactoringTypeImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getRefactoringType()
	 * @generated
	 */
	int REFACTORING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_TYPE__CHANGES = 0;

	/**
	 * The number of structural features of the '<em>Refactoring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Refactoring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ChangeImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getChange()
	 * @generated
	 */
	int CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CHANGE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ComplexImpl <em>Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ComplexImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getComplex()
	 * @generated
	 */
	int COMPLEX = 22;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__CHANGE_ELEMENT = CHANGE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__SIMPLE_DIFFS = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATION_COUNT = CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.MoveDownInHierarchyImpl <em>Move Down In Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.MoveDownInHierarchyImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getMoveDownInHierarchy()
	 * @generated
	 */
	int MOVE_DOWN_IN_HIERARCHY = 3;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_IN_HIERARCHY__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_IN_HIERARCHY__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Move Down In Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_IN_HIERARCHY_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Down In Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_IN_HIERARCHY_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ChangeParameterLocationImpl <em>Change Parameter Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ChangeParameterLocationImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getChangeParameterLocation()
	 * @generated
	 */
	int CHANGE_PARAMETER_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_LOCATION__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_LOCATION__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Change Parameter Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_LOCATION_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Change Parameter Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PARAMETER_LOCATION_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ReorderTypeParametersImpl <em>Reorder Type Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ReorderTypeParametersImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getReorderTypeParameters()
	 * @generated
	 */
	int REORDER_TYPE_PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_TYPE_PARAMETERS__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_TYPE_PARAMETERS__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Reorder Type Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_TYPE_PARAMETERS_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reorder Type Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_TYPE_PARAMETERS_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ContractSuperSetImpl <em>Contract Super Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ContractSuperSetImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getContractSuperSet()
	 * @generated
	 */
	int CONTRACT_SUPER_SET = 6;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_SUPER_SET__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_SUPER_SET__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Contract Super Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_SUPER_SET_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contract Super Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_SUPER_SET_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.MoveUpInHierarchyImpl <em>Move Up In Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.MoveUpInHierarchyImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getMoveUpInHierarchy()
	 * @generated
	 */
	int MOVE_UP_IN_HIERARCHY = 7;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_IN_HIERARCHY__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_IN_HIERARCHY__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Move Up In Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_IN_HIERARCHY_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Up In Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_IN_HIERARCHY_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.SimpleImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 8;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__CHANGE_ELEMENT = CHANGE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NEW = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__OLD = CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.AddImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 9;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__CHANGE_ELEMENT = SIMPLE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__NEW = SIMPLE__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__OLD = SIMPLE__OLD;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.DeleteImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 10;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CHANGE_ELEMENT = SIMPLE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NEW = SIMPLE__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OLD = SIMPLE__OLD;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.DefaultClauseImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getDefaultClause()
	 * @generated
	 */
	int DEFAULT_CLAUSE = 11;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CLAUSE__CHANGE_ELEMENT = DELETE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CLAUSE__NEW = DELETE__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CLAUSE__OLD = DELETE__OLD;

	/**
	 * The number of structural features of the '<em>Default Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CLAUSE_FEATURE_COUNT = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CLAUSE_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ModifyImpl <em>Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ModifyImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getModify()
	 * @generated
	 */
	int MODIFY = 12;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__CHANGE_ELEMENT = SIMPLE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__NEW = SIMPLE__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__OLD = SIMPLE__OLD;

	/**
	 * The number of structural features of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.RenameImpl <em>Rename</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.RenameImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getRename()
	 * @generated
	 */
	int RENAME = 13;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Rename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.AccessModifierImpl <em>Access Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.AccessModifierImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 14;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Access Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Access Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.TypeBoundImpl <em>Type Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.TypeBoundImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getTypeBound()
	 * @generated
	 */
	int TYPE_BOUND = 15;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BOUND__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BOUND__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BOUND__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Type Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BOUND_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BOUND_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ResultTypeImpl <em>Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ResultTypeImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.FieldValueImpl <em>Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.FieldValueImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getFieldValue()
	 * @generated
	 */
	int FIELD_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.TypeAPIImpl <em>Type API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.TypeAPIImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getTypeAPI()
	 * @generated
	 */
	int TYPE_API = 18;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Type API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.OtherModifierImpl <em>Other Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.OtherModifierImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getOtherModifier()
	 * @generated
	 */
	int OTHER_MODIFIER = 19;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODIFIER__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODIFIER__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODIFIER__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Other Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODIFIER_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Other Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MODIFIER_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.ElementReferenceImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getElementReference()
	 * @generated
	 */
	int ELEMENT_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Api Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__API_ELEMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__LINE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Api Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__API_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.impl.APIElementImpl <em>API Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.impl.APIElementImpl
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAPIElement()
	 * @generated
	 */
	int API_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ELEMENT__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>API Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>API Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.APIElementType <em>API Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.APIElementType
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAPIElementType()
	 * @generated
	 */
	int API_ELEMENT_TYPE = 23;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.ParameterLocation
	 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 24;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Diff
	 * @generated
	 */
	EClass getDiff();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.Diff#getNewVersion <em>New Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Version</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Diff#getNewVersion()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_NewVersion();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.Diff#getOldVersion <em>Old Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Version</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Diff#getOldVersion()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_OldVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.diff.metamodel.Diff#getRefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refactoring Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Diff#getRefactoringType()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_RefactoringType();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.diff.metamodel.Diff#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Diff#getChange()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_Change();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.RefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.RefactoringType
	 * @generated
	 */
	EClass getRefactoringType();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.diff.metamodel.RefactoringType#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changes</em>'.
	 * @see co.edu.uniandes.diff.metamodel.RefactoringType#getChanges()
	 * @see #getRefactoringType()
	 * @generated
	 */
	EReference getRefactoringType_Changes();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.Change#getChangeElement <em>Change Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Element</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Change#getChangeElement()
	 * @see #getChange()
	 * @generated
	 */
	EAttribute getChange_ChangeElement();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.MoveDownInHierarchy <em>Move Down In Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Down In Hierarchy</em>'.
	 * @see co.edu.uniandes.diff.metamodel.MoveDownInHierarchy
	 * @generated
	 */
	EClass getMoveDownInHierarchy();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.ChangeParameterLocation <em>Change Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Parameter Location</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ChangeParameterLocation
	 * @generated
	 */
	EClass getChangeParameterLocation();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.ReorderTypeParameters <em>Reorder Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reorder Type Parameters</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ReorderTypeParameters
	 * @generated
	 */
	EClass getReorderTypeParameters();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.ContractSuperSet <em>Contract Super Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Super Set</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ContractSuperSet
	 * @generated
	 */
	EClass getContractSuperSet();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.MoveUpInHierarchy <em>Move Up In Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Up In Hierarchy</em>'.
	 * @see co.edu.uniandes.diff.metamodel.MoveUpInHierarchy
	 * @generated
	 */
	EClass getMoveUpInHierarchy();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.diff.metamodel.Simple#getNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Simple#getNew()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_New();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.diff.metamodel.Simple#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Simple#getOld()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Old();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.DefaultClause <em>Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Clause</em>'.
	 * @see co.edu.uniandes.diff.metamodel.DefaultClause
	 * @generated
	 */
	EClass getDefaultClause();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Modify
	 * @generated
	 */
	EClass getModify();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Rename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Rename
	 * @generated
	 */
	EClass getRename();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Modifier</em>'.
	 * @see co.edu.uniandes.diff.metamodel.AccessModifier
	 * @generated
	 */
	EClass getAccessModifier();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.TypeBound <em>Type Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Bound</em>'.
	 * @see co.edu.uniandes.diff.metamodel.TypeBound
	 * @generated
	 */
	EClass getTypeBound();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ResultType
	 * @generated
	 */
	EClass getResultType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Value</em>'.
	 * @see co.edu.uniandes.diff.metamodel.FieldValue
	 * @generated
	 */
	EClass getFieldValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.TypeAPI <em>Type API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type API</em>'.
	 * @see co.edu.uniandes.diff.metamodel.TypeAPI
	 * @generated
	 */
	EClass getTypeAPI();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.OtherModifier <em>Other Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Modifier</em>'.
	 * @see co.edu.uniandes.diff.metamodel.OtherModifier
	 * @generated
	 */
	EClass getOtherModifier();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ElementReference
	 * @generated
	 */
	EClass getElementReference();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.ElementReference#getApiElementName <em>Api Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Element Name</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ElementReference#getApiElementName()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_ApiElementName();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.ElementReference#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ElementReference#getLineNumber()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_LineNumber();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.diff.metamodel.ElementReference#getApiElement <em>Api Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Api Element</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ElementReference#getApiElement()
	 * @see #getElementReference()
	 * @generated
	 */
	EReference getElementReference_ApiElement();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.APIElement <em>API Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Element</em>'.
	 * @see co.edu.uniandes.diff.metamodel.APIElement
	 * @generated
	 */
	EClass getAPIElement();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.APIElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see co.edu.uniandes.diff.metamodel.APIElement#getLocation()
	 * @see #getAPIElement()
	 * @generated
	 */
	EAttribute getAPIElement_Location();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Complex
	 * @generated
	 */
	EClass getComplex();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.diff.metamodel.Complex#getSimpleDiffs <em>Simple Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Diffs</em>'.
	 * @see co.edu.uniandes.diff.metamodel.Complex#getSimpleDiffs()
	 * @see #getComplex()
	 * @generated
	 */
	EReference getComplex_SimpleDiffs();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.diff.metamodel.APIElementType <em>API Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Element Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.APIElementType
	 * @generated
	 */
	EEnum getAPIElementType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.diff.metamodel.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see co.edu.uniandes.diff.metamodel.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiffFactory getDiffFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.DiffImpl <em>Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getDiff()
		 * @generated
		 */
		EClass DIFF = eINSTANCE.getDiff();

		/**
		 * The meta object literal for the '<em><b>New Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__NEW_VERSION = eINSTANCE.getDiff_NewVersion();

		/**
		 * The meta object literal for the '<em><b>Old Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__OLD_VERSION = eINSTANCE.getDiff_OldVersion();

		/**
		 * The meta object literal for the '<em><b>Refactoring Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF__REFACTORING_TYPE = eINSTANCE.getDiff_RefactoringType();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF__CHANGE = eINSTANCE.getDiff_Change();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.RefactoringTypeImpl <em>Refactoring Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.RefactoringTypeImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getRefactoringType()
		 * @generated
		 */
		EClass REFACTORING_TYPE = eINSTANCE.getRefactoringType();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFACTORING_TYPE__CHANGES = eINSTANCE.getRefactoringType_Changes();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ChangeImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getChange()
		 * @generated
		 */
		EClass CHANGE = eINSTANCE.getChange();

		/**
		 * The meta object literal for the '<em><b>Change Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE__CHANGE_ELEMENT = eINSTANCE.getChange_ChangeElement();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.MoveDownInHierarchyImpl <em>Move Down In Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.MoveDownInHierarchyImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getMoveDownInHierarchy()
		 * @generated
		 */
		EClass MOVE_DOWN_IN_HIERARCHY = eINSTANCE.getMoveDownInHierarchy();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ChangeParameterLocationImpl <em>Change Parameter Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ChangeParameterLocationImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getChangeParameterLocation()
		 * @generated
		 */
		EClass CHANGE_PARAMETER_LOCATION = eINSTANCE.getChangeParameterLocation();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ReorderTypeParametersImpl <em>Reorder Type Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ReorderTypeParametersImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getReorderTypeParameters()
		 * @generated
		 */
		EClass REORDER_TYPE_PARAMETERS = eINSTANCE.getReorderTypeParameters();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ContractSuperSetImpl <em>Contract Super Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ContractSuperSetImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getContractSuperSet()
		 * @generated
		 */
		EClass CONTRACT_SUPER_SET = eINSTANCE.getContractSuperSet();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.MoveUpInHierarchyImpl <em>Move Up In Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.MoveUpInHierarchyImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getMoveUpInHierarchy()
		 * @generated
		 */
		EClass MOVE_UP_IN_HIERARCHY = eINSTANCE.getMoveUpInHierarchy();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.SimpleImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__NEW = eINSTANCE.getSimple_New();

		/**
		 * The meta object literal for the '<em><b>Old</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__OLD = eINSTANCE.getSimple_Old();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.AddImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.DeleteImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.DefaultClauseImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getDefaultClause()
		 * @generated
		 */
		EClass DEFAULT_CLAUSE = eINSTANCE.getDefaultClause();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ModifyImpl <em>Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ModifyImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getModify()
		 * @generated
		 */
		EClass MODIFY = eINSTANCE.getModify();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.RenameImpl <em>Rename</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.RenameImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getRename()
		 * @generated
		 */
		EClass RENAME = eINSTANCE.getRename();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.AccessModifierImpl <em>Access Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.AccessModifierImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAccessModifier()
		 * @generated
		 */
		EClass ACCESS_MODIFIER = eINSTANCE.getAccessModifier();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.TypeBoundImpl <em>Type Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.TypeBoundImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getTypeBound()
		 * @generated
		 */
		EClass TYPE_BOUND = eINSTANCE.getTypeBound();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ResultTypeImpl <em>Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ResultTypeImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getResultType()
		 * @generated
		 */
		EClass RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.FieldValueImpl <em>Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.FieldValueImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getFieldValue()
		 * @generated
		 */
		EClass FIELD_VALUE = eINSTANCE.getFieldValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.TypeAPIImpl <em>Type API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.TypeAPIImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getTypeAPI()
		 * @generated
		 */
		EClass TYPE_API = eINSTANCE.getTypeAPI();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.OtherModifierImpl <em>Other Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.OtherModifierImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getOtherModifier()
		 * @generated
		 */
		EClass OTHER_MODIFIER = eINSTANCE.getOtherModifier();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ElementReferenceImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getElementReference()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

		/**
		 * The meta object literal for the '<em><b>Api Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE__API_ELEMENT_NAME = eINSTANCE.getElementReference_ApiElementName();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE__LINE_NUMBER = eINSTANCE.getElementReference_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Api Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFERENCE__API_ELEMENT = eINSTANCE.getElementReference_ApiElement();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.APIElementImpl <em>API Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.APIElementImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAPIElement()
		 * @generated
		 */
		EClass API_ELEMENT = eINSTANCE.getAPIElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_ELEMENT__LOCATION = eINSTANCE.getAPIElement_Location();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.impl.ComplexImpl <em>Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.impl.ComplexImpl
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getComplex()
		 * @generated
		 */
		EClass COMPLEX = eINSTANCE.getComplex();

		/**
		 * The meta object literal for the '<em><b>Simple Diffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX__SIMPLE_DIFFS = eINSTANCE.getComplex_SimpleDiffs();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.APIElementType <em>API Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.APIElementType
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getAPIElementType()
		 * @generated
		 */
		EEnum API_ELEMENT_TYPE = eINSTANCE.getAPIElementType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.ParameterLocation
		 * @see co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

	}

} //DiffPackage
