/**
 */
package co.edu.uniandes.diff.metamodel.diff;

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
 * @see co.edu.uniandes.diff.metamodel.diff.diffFactory
 * @model kind="package"
 * @generated
 */
public interface diffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Diff";

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
	String eNS_PREFIX = "Diff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	diffPackage eINSTANCE = co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DiffImpl <em>Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.DiffImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDiff()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.RefactoringTypeImpl <em>Refactoring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.RefactoringTypeImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getRefactoringType()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ChangeImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getChange()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ComplexImpl <em>Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ComplexImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getComplex()
	 * @generated
	 */
	int COMPLEX = 25;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.MoveDownInHierarchyImpl <em>Move Down In Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.MoveDownInHierarchyImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getMoveDownInHierarchy()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.RelocateParameterImpl <em>Relocate Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.RelocateParameterImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getRelocateParameter()
	 * @generated
	 */
	int RELOCATE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_PARAMETER__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_PARAMETER__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The feature id for the '<em><b>New Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_PARAMETER__NEW_LOCATION = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_PARAMETER__OLD_LOCATION = COMPLEX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relocate Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_PARAMETER_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relocate Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_PARAMETER_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ReorderTypeParametersImpl <em>Reorder Type Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ReorderTypeParametersImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getReorderTypeParameters()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ContractSuperSetImpl <em>Contract Super Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ContractSuperSetImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getContractSuperSet()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.MoveUpInHierarchyImpl <em>Move Up In Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.MoveUpInHierarchyImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getMoveUpInHierarchy()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.SimpleImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getSimple()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.AddImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getAdd()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.DeleteImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDelete()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.DefaultClauseImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDefaultClause()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ModifyImpl <em>Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ModifyImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getModify()
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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.UpperBondaryImpl <em>Upper Bondary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.UpperBondaryImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getUpperBondary()
	 * @generated
	 */
	int UPPER_BONDARY = 13;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BONDARY__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BONDARY__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BONDARY__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Upper Bondary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BONDARY_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upper Bondary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BONDARY_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.LowerBondaryImpl <em>Lower Bondary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.LowerBondaryImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getLowerBondary()
	 * @generated
	 */
	int LOWER_BONDARY = 14;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BONDARY__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BONDARY__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BONDARY__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Lower Bondary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BONDARY_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Bondary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BONDARY_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DefaultValueImpl <em>Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.DefaultValueImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDefaultValue()
	 * @generated
	 */
	int DEFAULT_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.RenameImpl <em>Rename</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.RenameImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getRename()
	 * @generated
	 */
	int RENAME = 16;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.AccessModifierImpl <em>Access Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.AccessModifierImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 17;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.TypeBoundImpl <em>Type Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.TypeBoundImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getTypeBound()
	 * @generated
	 */
	int TYPE_BOUND = 18;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ResultTypeImpl <em>Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ResultTypeImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 19;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ConsumeTypeImpl <em>Consume Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ConsumeTypeImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getConsumeType()
	 * @generated
	 */
	int CONSUME_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_TYPE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_TYPE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_TYPE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Consume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.FieldValueImpl <em>Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.FieldValueImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getFieldValue()
	 * @generated
	 */
	int FIELD_VALUE = 21;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.TypeAPIImpl <em>Type API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.TypeAPIImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getTypeAPI()
	 * @generated
	 */
	int TYPE_API = 22;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.OtherModifierImpl <em>Other Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.OtherModifierImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getOtherModifier()
	 * @generated
	 */
	int OTHER_MODIFIER = 23;

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
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ElementReferenceImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getElementReference()
	 * @generated
	 */
	int ELEMENT_REFERENCE = 24;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__EOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__LINE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__PATH = 3;

	/**
	 * The number of structural features of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ParameterTypeImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__OLD = MODIFY__OLD;

	/**
	 * The feature id for the '<em><b>Old Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__OLD_DEFINITION = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NEW_DEFINITION = MODIFY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ElementDefinitionImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getElementDefinition()
	 * @generated
	 */
	int ELEMENT_DEFINITION = 27;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SCHEMA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.ReturnTypeImpl
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__OLD = MODIFY__OLD;

	/**
	 * The feature id for the '<em><b>Old Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__OLD_DEFINITION = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__NEW_DEFINITION = MODIFY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.APIElementType <em>API Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.APIElementType
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getAPIElementType()
	 * @generated
	 */
	int API_ELEMENT_TYPE = 29;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.ParameterLocation
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 30;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.diff.metamodel.diff.ElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.diff.metamodel.diff.ElementType
	 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 31;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Diff
	 * @generated
	 */
	EClass getDiff();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.Diff#getNewVersion <em>New Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Version</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Diff#getNewVersion()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_NewVersion();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.Diff#getOldVersion <em>Old Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Version</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Diff#getOldVersion()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_OldVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.diff.metamodel.diff.Diff#getRefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refactoring Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Diff#getRefactoringType()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_RefactoringType();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.diff.metamodel.diff.Diff#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Diff#getChange()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_Change();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.RefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.RefactoringType
	 * @generated
	 */
	EClass getRefactoringType();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.diff.metamodel.diff.RefactoringType#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changes</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.RefactoringType#getChanges()
	 * @see #getRefactoringType()
	 * @generated
	 */
	EReference getRefactoringType_Changes();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.Change#getChangeElement <em>Change Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Element</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Change#getChangeElement()
	 * @see #getChange()
	 * @generated
	 */
	EAttribute getChange_ChangeElement();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.MoveDownInHierarchy <em>Move Down In Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Down In Hierarchy</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.MoveDownInHierarchy
	 * @generated
	 */
	EClass getMoveDownInHierarchy();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter <em>Relocate Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relocate Parameter</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.RelocateParameter
	 * @generated
	 */
	EClass getRelocateParameter();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getNewLocation <em>New Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Location</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getNewLocation()
	 * @see #getRelocateParameter()
	 * @generated
	 */
	EAttribute getRelocateParameter_NewLocation();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getOldLocation <em>Old Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Location</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getOldLocation()
	 * @see #getRelocateParameter()
	 * @generated
	 */
	EAttribute getRelocateParameter_OldLocation();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.ReorderTypeParameters <em>Reorder Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reorder Type Parameters</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ReorderTypeParameters
	 * @generated
	 */
	EClass getReorderTypeParameters();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.ContractSuperSet <em>Contract Super Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Super Set</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ContractSuperSet
	 * @generated
	 */
	EClass getContractSuperSet();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.MoveUpInHierarchy <em>Move Up In Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Up In Hierarchy</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.MoveUpInHierarchy
	 * @generated
	 */
	EClass getMoveUpInHierarchy();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.diff.metamodel.diff.Simple#getNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Simple#getNew()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_New();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.diff.metamodel.diff.Simple#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Simple#getOld()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Old();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.DefaultClause <em>Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Clause</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.DefaultClause
	 * @generated
	 */
	EClass getDefaultClause();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Modify
	 * @generated
	 */
	EClass getModify();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.UpperBondary <em>Upper Bondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Bondary</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.UpperBondary
	 * @generated
	 */
	EClass getUpperBondary();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.LowerBondary <em>Lower Bondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Bondary</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.LowerBondary
	 * @generated
	 */
	EClass getLowerBondary();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.DefaultValue
	 * @generated
	 */
	EClass getDefaultValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Rename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Rename
	 * @generated
	 */
	EClass getRename();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Modifier</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.AccessModifier
	 * @generated
	 */
	EClass getAccessModifier();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.TypeBound <em>Type Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Bound</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.TypeBound
	 * @generated
	 */
	EClass getTypeBound();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ResultType
	 * @generated
	 */
	EClass getResultType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.ConsumeType <em>Consume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consume Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ConsumeType
	 * @generated
	 */
	EClass getConsumeType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Value</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.FieldValue
	 * @generated
	 */
	EClass getFieldValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.TypeAPI <em>Type API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type API</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.TypeAPI
	 * @generated
	 */
	EClass getTypeAPI();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.OtherModifier <em>Other Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Modifier</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.OtherModifier
	 * @generated
	 */
	EClass getOtherModifier();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ElementReference
	 * @generated
	 */
	EClass getElementReference();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EObject</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ElementReference#getEObject()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_EObject();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ElementReference#getLineNumber()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ElementReference#getValue()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_Value();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.diff.metamodel.diff.ElementReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ElementReference#getPath()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_Path();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.diff.metamodel.diff.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Complex
	 * @generated
	 */
	EClass getComplex();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.diff.metamodel.diff.Complex#getSimpleDiffs <em>Simple Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Diffs</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.Complex#getSimpleDiffs()
	 * @see #getComplex()
	 * @generated
	 */
	EReference getComplex_SimpleDiffs();

	/**
	 * Returns the meta object for class '{@link ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see ParameterType
	 * @model instanceClass="ParameterType"
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the containment reference '{@link ParameterType#getOldDefinition <em>Old Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old Definition</em>'.
	 * @see ParameterType#getOldDefinition()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_OldDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link ParameterType#getNewDefinition <em>New Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Definition</em>'.
	 * @see ParameterType#getNewDefinition()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_NewDefinition();

	/**
	 * Returns the meta object for class '{@link ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition</em>'.
	 * @see ElementDefinition
	 * @model instanceClass="ElementDefinition"
	 * @generated
	 */
	EClass getElementDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ElementDefinition#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see ElementDefinition#getSchemaName()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link ElementDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ElementDefinition#getType()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_Type();

	/**
	 * Returns the meta object for class '{@link ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see ReturnType
	 * @model instanceClass="ReturnType"
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link ReturnType#getOldDefinition <em>Old Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old Definition</em>'.
	 * @see ReturnType#getOldDefinition()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_OldDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link ReturnType#getNewDefinition <em>New Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Definition</em>'.
	 * @see ReturnType#getNewDefinition()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_NewDefinition();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.diff.metamodel.diff.APIElementType <em>API Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Element Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.APIElementType
	 * @generated
	 */
	EEnum getAPIElementType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.diff.metamodel.diff.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.diff.metamodel.diff.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see co.edu.uniandes.diff.metamodel.diff.ElementType
	 * @generated
	 */
	EEnum getElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	diffFactory getdiffFactory();

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
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DiffImpl <em>Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.DiffImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDiff()
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
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.RefactoringTypeImpl <em>Refactoring Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.RefactoringTypeImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getRefactoringType()
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
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ChangeImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getChange()
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
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.MoveDownInHierarchyImpl <em>Move Down In Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.MoveDownInHierarchyImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getMoveDownInHierarchy()
		 * @generated
		 */
		EClass MOVE_DOWN_IN_HIERARCHY = eINSTANCE.getMoveDownInHierarchy();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.RelocateParameterImpl <em>Relocate Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.RelocateParameterImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getRelocateParameter()
		 * @generated
		 */
		EClass RELOCATE_PARAMETER = eINSTANCE.getRelocateParameter();

		/**
		 * The meta object literal for the '<em><b>New Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELOCATE_PARAMETER__NEW_LOCATION = eINSTANCE.getRelocateParameter_NewLocation();

		/**
		 * The meta object literal for the '<em><b>Old Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELOCATE_PARAMETER__OLD_LOCATION = eINSTANCE.getRelocateParameter_OldLocation();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ReorderTypeParametersImpl <em>Reorder Type Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ReorderTypeParametersImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getReorderTypeParameters()
		 * @generated
		 */
		EClass REORDER_TYPE_PARAMETERS = eINSTANCE.getReorderTypeParameters();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ContractSuperSetImpl <em>Contract Super Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ContractSuperSetImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getContractSuperSet()
		 * @generated
		 */
		EClass CONTRACT_SUPER_SET = eINSTANCE.getContractSuperSet();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.MoveUpInHierarchyImpl <em>Move Up In Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.MoveUpInHierarchyImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getMoveUpInHierarchy()
		 * @generated
		 */
		EClass MOVE_UP_IN_HIERARCHY = eINSTANCE.getMoveUpInHierarchy();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.SimpleImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getSimple()
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
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.AddImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.DeleteImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.DefaultClauseImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDefaultClause()
		 * @generated
		 */
		EClass DEFAULT_CLAUSE = eINSTANCE.getDefaultClause();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ModifyImpl <em>Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ModifyImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getModify()
		 * @generated
		 */
		EClass MODIFY = eINSTANCE.getModify();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.UpperBondaryImpl <em>Upper Bondary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.UpperBondaryImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getUpperBondary()
		 * @generated
		 */
		EClass UPPER_BONDARY = eINSTANCE.getUpperBondary();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.LowerBondaryImpl <em>Lower Bondary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.LowerBondaryImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getLowerBondary()
		 * @generated
		 */
		EClass LOWER_BONDARY = eINSTANCE.getLowerBondary();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.DefaultValueImpl <em>Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.DefaultValueImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getDefaultValue()
		 * @generated
		 */
		EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.RenameImpl <em>Rename</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.RenameImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getRename()
		 * @generated
		 */
		EClass RENAME = eINSTANCE.getRename();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.AccessModifierImpl <em>Access Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.AccessModifierImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getAccessModifier()
		 * @generated
		 */
		EClass ACCESS_MODIFIER = eINSTANCE.getAccessModifier();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.TypeBoundImpl <em>Type Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.TypeBoundImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getTypeBound()
		 * @generated
		 */
		EClass TYPE_BOUND = eINSTANCE.getTypeBound();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ResultTypeImpl <em>Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ResultTypeImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getResultType()
		 * @generated
		 */
		EClass RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ConsumeTypeImpl <em>Consume Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ConsumeTypeImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getConsumeType()
		 * @generated
		 */
		EClass CONSUME_TYPE = eINSTANCE.getConsumeType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.FieldValueImpl <em>Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.FieldValueImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getFieldValue()
		 * @generated
		 */
		EClass FIELD_VALUE = eINSTANCE.getFieldValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.TypeAPIImpl <em>Type API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.TypeAPIImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getTypeAPI()
		 * @generated
		 */
		EClass TYPE_API = eINSTANCE.getTypeAPI();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.OtherModifierImpl <em>Other Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.OtherModifierImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getOtherModifier()
		 * @generated
		 */
		EClass OTHER_MODIFIER = eINSTANCE.getOtherModifier();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ElementReferenceImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getElementReference()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

		/**
		 * The meta object literal for the '<em><b>EObject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE__EOBJECT = eINSTANCE.getElementReference_EObject();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE__LINE_NUMBER = eINSTANCE.getElementReference_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE__VALUE = eINSTANCE.getElementReference_Value();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE__PATH = eINSTANCE.getElementReference_Path();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ComplexImpl <em>Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ComplexImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getComplex()
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
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ParameterTypeImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Old Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE__OLD_DEFINITION = eINSTANCE.getParameterType_OldDefinition();

		/**
		 * The meta object literal for the '<em><b>New Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE__NEW_DEFINITION = eINSTANCE.getParameterType_NewDefinition();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ElementDefinitionImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getElementDefinition()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__SCHEMA_NAME = eINSTANCE.getElementDefinition_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__TYPE = eINSTANCE.getElementDefinition_Type();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.ReturnTypeImpl
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Old Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_TYPE__OLD_DEFINITION = eINSTANCE.getReturnType_OldDefinition();

		/**
		 * The meta object literal for the '<em><b>New Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_TYPE__NEW_DEFINITION = eINSTANCE.getReturnType_NewDefinition();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.APIElementType <em>API Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.APIElementType
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getAPIElementType()
		 * @generated
		 */
		EEnum API_ELEMENT_TYPE = eINSTANCE.getAPIElementType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.ParameterLocation
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.diff.metamodel.diff.ElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.diff.metamodel.diff.ElementType
		 * @see co.edu.uniandes.diff.metamodel.diff.impl.diffPackageImpl#getElementType()
		 * @generated
		 */
		EEnum ELEMENT_TYPE = eINSTANCE.getElementType();

	}

} //diffPackage
