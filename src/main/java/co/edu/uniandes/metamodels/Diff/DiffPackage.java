/**
 */
package co.edu.uniandes.metamodels.Diff;

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
 * @see co.edu.uniandes.metamodels.Diff.DiffFactory
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
	DiffPackage eINSTANCE = co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.DiffImpl <em>Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDiff()
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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.RefactoringTypeImpl <em>Refactoring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.RefactoringTypeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRefactoringType()
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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ChangeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getChange()
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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ComplexImpl <em>Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ComplexImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getComplex()
	 * @generated
	 */
	int COMPLEX = 26;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.RelocateParameterImpl <em>Relocate Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.RelocateParameterImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRelocateParameter()
	 * @generated
	 */
	int RELOCATE_PARAMETER = 3;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.MultipleParametersInOneImpl <em>Multiple Parameters In One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.MultipleParametersInOneImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getMultipleParametersInOne()
	 * @generated
	 */
	int MULTIPLE_PARAMETERS_IN_ONE = 4;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_PARAMETERS_IN_ONE__CHANGE_ELEMENT = RELOCATE_PARAMETER__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_PARAMETERS_IN_ONE__SIMPLE_DIFFS = RELOCATE_PARAMETER__SIMPLE_DIFFS;

	/**
	 * The feature id for the '<em><b>New Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_PARAMETERS_IN_ONE__NEW_LOCATION = RELOCATE_PARAMETER__NEW_LOCATION;

	/**
	 * The feature id for the '<em><b>Old Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_PARAMETERS_IN_ONE__OLD_LOCATION = RELOCATE_PARAMETER__OLD_LOCATION;

	/**
	 * The number of structural features of the '<em>Multiple Parameters In One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_PARAMETERS_IN_ONE_FEATURE_COUNT = RELOCATE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiple Parameters In One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_PARAMETERS_IN_ONE_OPERATION_COUNT = RELOCATE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.SameParameterImpl <em>Same Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.SameParameterImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getSameParameter()
	 * @generated
	 */
	int SAME_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PARAMETER__CHANGE_ELEMENT = RELOCATE_PARAMETER__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PARAMETER__SIMPLE_DIFFS = RELOCATE_PARAMETER__SIMPLE_DIFFS;

	/**
	 * The feature id for the '<em><b>New Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PARAMETER__NEW_LOCATION = RELOCATE_PARAMETER__NEW_LOCATION;

	/**
	 * The feature id for the '<em><b>Old Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PARAMETER__OLD_LOCATION = RELOCATE_PARAMETER__OLD_LOCATION;

	/**
	 * The number of structural features of the '<em>Same Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PARAMETER_FEATURE_COUNT = RELOCATE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Same Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PARAMETER_OPERATION_COUNT = RELOCATE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.SimpleImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 6;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.AddImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 7;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddParameterImpl <em>Add Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.AddParameterImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAddParameter()
	 * @generated
	 */
	int ADD_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARAMETER__CHANGE_ELEMENT = ADD__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARAMETER__NEW = ADD__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARAMETER__OLD = ADD__OLD;

	/**
	 * The number of structural features of the '<em>Add Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARAMETER_FEATURE_COUNT = ADD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARAMETER_OPERATION_COUNT = ADD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.DeleteImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 9;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.UnsupportRequestMethodImpl <em>Unsupport Request Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.UnsupportRequestMethodImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getUnsupportRequestMethod()
	 * @generated
	 */
	int UNSUPPORT_REQUEST_METHOD = 10;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORT_REQUEST_METHOD__CHANGE_ELEMENT = DELETE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORT_REQUEST_METHOD__NEW = DELETE__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORT_REQUEST_METHOD__OLD = DELETE__OLD;

	/**
	 * The number of structural features of the '<em>Unsupport Request Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORT_REQUEST_METHOD_FEATURE_COUNT = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsupport Request Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORT_REQUEST_METHOD_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.DeletePathImpl <em>Delete Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.DeletePathImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDeletePath()
	 * @generated
	 */
	int DELETE_PATH = 11;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PATH__CHANGE_ELEMENT = DELETE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PATH__NEW = DELETE__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PATH__OLD = DELETE__OLD;

	/**
	 * The number of structural features of the '<em>Delete Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PATH_FEATURE_COUNT = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PATH_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.RemoveParameterImpl <em>Remove Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.RemoveParameterImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRemoveParameter()
	 * @generated
	 */
	int REMOVE_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARAMETER__CHANGE_ELEMENT = DELETE__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARAMETER__NEW = DELETE__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARAMETER__OLD = DELETE__OLD;

	/**
	 * The number of structural features of the '<em>Remove Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARAMETER_FEATURE_COUNT = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARAMETER_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.DefaultClauseImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDefaultClause()
	 * @generated
	 */
	int DEFAULT_CLAUSE = 13;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ModifyImpl <em>Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ModifyImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getModify()
	 * @generated
	 */
	int MODIFY = 14;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ModifyParameterSchemaTypeImpl <em>Modify Parameter Schema Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ModifyParameterSchemaTypeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getModifyParameterSchemaType()
	 * @generated
	 */
	int MODIFY_PARAMETER_SCHEMA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PARAMETER_SCHEMA_TYPE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PARAMETER_SCHEMA_TYPE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PARAMETER_SCHEMA_TYPE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Modify Parameter Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PARAMETER_SCHEMA_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Parameter Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PARAMETER_SCHEMA_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.UpperBondaryImpl <em>Upper Bondary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.UpperBondaryImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getUpperBondary()
	 * @generated
	 */
	int UPPER_BONDARY = 16;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.LowerBondaryImpl <em>Lower Bondary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.LowerBondaryImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getLowerBondary()
	 * @generated
	 */
	int LOWER_BONDARY = 17;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.DefaultValueImpl <em>Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.DefaultValueImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDefaultValue()
	 * @generated
	 */
	int DEFAULT_VALUE = 18;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.RenameParameterImpl <em>Rename Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.RenameParameterImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRenameParameter()
	 * @generated
	 */
	int RENAME_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PARAMETER__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PARAMETER__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PARAMETER__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Rename Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PARAMETER_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rename Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PARAMETER_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ConsumeTypeImpl <em>Consume Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ConsumeTypeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getConsumeType()
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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ProduceTypeImpl <em>Produce Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ProduceTypeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getProduceType()
	 * @generated
	 */
	int PRODUCE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCE_TYPE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCE_TYPE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCE_TYPE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Produce Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCE_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Produce Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCE_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddStatusCodeImpl <em>Add Status Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.AddStatusCodeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAddStatusCode()
	 * @generated
	 */
	int ADD_STATUS_CODE = 22;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STATUS_CODE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STATUS_CODE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STATUS_CODE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Add Status Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STATUS_CODE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Status Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STATUS_CODE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.RemoveStatusCodeImpl <em>Remove Status Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.RemoveStatusCodeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRemoveStatusCode()
	 * @generated
	 */
	int REMOVE_STATUS_CODE = 23;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STATUS_CODE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STATUS_CODE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STATUS_CODE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Remove Status Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STATUS_CODE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Status Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STATUS_CODE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ExposeDataImpl <em>Expose Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ExposeDataImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getExposeData()
	 * @generated
	 */
	int EXPOSE_DATA = 24;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_DATA__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_DATA__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Expose Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_DATA_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expose Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_DATA_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ElementReferenceImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getElementReference()
	 * @generated
	 */
	int ELEMENT_REFERENCE = 25;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__EOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__METHOD = 1;

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
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.RemoveRestrictionImpl <em>Remove Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.RemoveRestrictionImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRemoveRestriction()
	 * @generated
	 */
	int REMOVE_RESTRICTION = 27;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RESTRICTION__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RESTRICTION__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Remove Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RESTRICTION_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RESTRICTION_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ChangeFormatReturnValueImpl <em>Change Format Return Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ChangeFormatReturnValueImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getChangeFormatReturnValue()
	 * @generated
	 */
	int CHANGE_FORMAT_RETURN_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FORMAT_RETURN_VALUE__CHANGE_ELEMENT = MODIFY__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FORMAT_RETURN_VALUE__NEW = MODIFY__NEW;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FORMAT_RETURN_VALUE__OLD = MODIFY__OLD;

	/**
	 * The number of structural features of the '<em>Change Format Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FORMAT_RETURN_VALUE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Change Format Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FORMAT_RETURN_VALUE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.RenameMethodImpl <em>Rename Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.RenameMethodImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRenameMethod()
	 * @generated
	 */
	int RENAME_METHOD = 29;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Rename Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rename Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.CombineMethodsImpl <em>Combine Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.CombineMethodsImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getCombineMethods()
	 * @generated
	 */
	int COMBINE_METHODS = 30;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_METHODS__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_METHODS__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Combine Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_METHODS_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Combine Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_METHODS_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.SplitMethodImpl <em>Split Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.SplitMethodImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getSplitMethod()
	 * @generated
	 */
	int SPLIT_METHOD = 31;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_METHOD__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_METHOD__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Split Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_METHOD_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Split Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_METHOD_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddRestrictionImpl <em>Add Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.AddRestrictionImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAddRestriction()
	 * @generated
	 */
	int ADD_RESTRICTION = 32;

	/**
	 * The feature id for the '<em><b>Change Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RESTRICTION__CHANGE_ELEMENT = COMPLEX__CHANGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Simple Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RESTRICTION__SIMPLE_DIFFS = COMPLEX__SIMPLE_DIFFS;

	/**
	 * The number of structural features of the '<em>Add Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RESTRICTION_FEATURE_COUNT = COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RESTRICTION_OPERATION_COUNT = COMPLEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ParameterTypeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 33;

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
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.impl.ReturnTypeImpl
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 34;

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
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = MODIFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = MODIFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.APIElementType <em>API Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.APIElementType
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAPIElementType()
	 * @generated
	 */
	int API_ELEMENT_TYPE = 35;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.ParameterLocation
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 36;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Diff.ElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Diff.ElementType
	 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 37;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Diff
	 * @generated
	 */
	EClass getDiff();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.Diff#getNewVersion <em>New Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Version</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Diff#getNewVersion()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_NewVersion();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.Diff#getOldVersion <em>Old Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Version</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Diff#getOldVersion()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_OldVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.metamodels.Diff.Diff#getRefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refactoring Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Diff#getRefactoringType()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_RefactoringType();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.metamodels.Diff.Diff#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Diff#getChange()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_Change();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.RefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RefactoringType
	 * @generated
	 */
	EClass getRefactoringType();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.metamodels.Diff.RefactoringType#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changes</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RefactoringType#getChanges()
	 * @see #getRefactoringType()
	 * @generated
	 */
	EReference getRefactoringType_Changes();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.Change#getChangeElement <em>Change Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Element</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Change#getChangeElement()
	 * @see #getChange()
	 * @generated
	 */
	EAttribute getChange_ChangeElement();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.RelocateParameter <em>Relocate Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relocate Parameter</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RelocateParameter
	 * @generated
	 */
	EClass getRelocateParameter();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.RelocateParameter#getNewLocation <em>New Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Location</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RelocateParameter#getNewLocation()
	 * @see #getRelocateParameter()
	 * @generated
	 */
	EAttribute getRelocateParameter_NewLocation();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.RelocateParameter#getOldLocation <em>Old Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Location</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RelocateParameter#getOldLocation()
	 * @see #getRelocateParameter()
	 * @generated
	 */
	EAttribute getRelocateParameter_OldLocation();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.MultipleParametersInOne <em>Multiple Parameters In One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Parameters In One</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.MultipleParametersInOne
	 * @generated
	 */
	EClass getMultipleParametersInOne();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.SameParameter <em>Same Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same Parameter</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.SameParameter
	 * @generated
	 */
	EClass getSameParameter();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.metamodels.Diff.Simple#getNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Simple#getNew()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_New();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.metamodels.Diff.Simple#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Simple#getOld()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Old();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.AddParameter <em>Add Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Parameter</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.AddParameter
	 * @generated
	 */
	EClass getAddParameter();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.UnsupportRequestMethod <em>Unsupport Request Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsupport Request Method</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.UnsupportRequestMethod
	 * @generated
	 */
	EClass getUnsupportRequestMethod();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.DeletePath <em>Delete Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Path</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.DeletePath
	 * @generated
	 */
	EClass getDeletePath();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.RemoveParameter <em>Remove Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Parameter</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RemoveParameter
	 * @generated
	 */
	EClass getRemoveParameter();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.DefaultClause <em>Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Clause</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.DefaultClause
	 * @generated
	 */
	EClass getDefaultClause();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Modify
	 * @generated
	 */
	EClass getModify();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ModifyParameterSchemaType <em>Modify Parameter Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Parameter Schema Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ModifyParameterSchemaType
	 * @generated
	 */
	EClass getModifyParameterSchemaType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.UpperBondary <em>Upper Bondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Bondary</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.UpperBondary
	 * @generated
	 */
	EClass getUpperBondary();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.LowerBondary <em>Lower Bondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Bondary</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.LowerBondary
	 * @generated
	 */
	EClass getLowerBondary();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.DefaultValue
	 * @generated
	 */
	EClass getDefaultValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.RenameParameter <em>Rename Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Parameter</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RenameParameter
	 * @generated
	 */
	EClass getRenameParameter();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ConsumeType <em>Consume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consume Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ConsumeType
	 * @generated
	 */
	EClass getConsumeType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ProduceType <em>Produce Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produce Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ProduceType
	 * @generated
	 */
	EClass getProduceType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.AddStatusCode <em>Add Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Status Code</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.AddStatusCode
	 * @generated
	 */
	EClass getAddStatusCode();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.RemoveStatusCode <em>Remove Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Status Code</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RemoveStatusCode
	 * @generated
	 */
	EClass getRemoveStatusCode();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ExposeData <em>Expose Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expose Data</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ExposeData
	 * @generated
	 */
	EClass getExposeData();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ElementReference
	 * @generated
	 */
	EClass getElementReference();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.ElementReference#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EObject</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ElementReference#getEObject()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_EObject();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.ElementReference#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ElementReference#getMethod()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_Method();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.ElementReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ElementReference#getValue()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_Value();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Diff.ElementReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ElementReference#getPath()
	 * @see #getElementReference()
	 * @generated
	 */
	EAttribute getElementReference_Path();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Complex
	 * @generated
	 */
	EClass getComplex();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.metamodels.Diff.Complex#getSimpleDiffs <em>Simple Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Diffs</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.Complex#getSimpleDiffs()
	 * @see #getComplex()
	 * @generated
	 */
	EReference getComplex_SimpleDiffs();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.RemoveRestriction <em>Remove Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Restriction</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RemoveRestriction
	 * @generated
	 */
	EClass getRemoveRestriction();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ChangeFormatReturnValue <em>Change Format Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Format Return Value</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ChangeFormatReturnValue
	 * @generated
	 */
	EClass getChangeFormatReturnValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.RenameMethod <em>Rename Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Method</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.RenameMethod
	 * @generated
	 */
	EClass getRenameMethod();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.CombineMethods <em>Combine Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combine Methods</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.CombineMethods
	 * @generated
	 */
	EClass getCombineMethods();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.SplitMethod <em>Split Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Method</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.SplitMethod
	 * @generated
	 */
	EClass getSplitMethod();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.AddRestriction <em>Add Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Restriction</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.AddRestriction
	 * @generated
	 */
	EClass getAddRestriction();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Diff.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.metamodels.Diff.APIElementType <em>API Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Element Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.APIElementType
	 * @generated
	 */
	EEnum getAPIElementType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.metamodels.Diff.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.metamodels.Diff.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see co.edu.uniandes.metamodels.Diff.ElementType
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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.DiffImpl <em>Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDiff()
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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.RefactoringTypeImpl <em>Refactoring Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.RefactoringTypeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRefactoringType()
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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ChangeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getChange()
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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.RelocateParameterImpl <em>Relocate Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.RelocateParameterImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRelocateParameter()
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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.MultipleParametersInOneImpl <em>Multiple Parameters In One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.MultipleParametersInOneImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getMultipleParametersInOne()
		 * @generated
		 */
		EClass MULTIPLE_PARAMETERS_IN_ONE = eINSTANCE.getMultipleParametersInOne();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.SameParameterImpl <em>Same Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.SameParameterImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getSameParameter()
		 * @generated
		 */
		EClass SAME_PARAMETER = eINSTANCE.getSameParameter();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.SimpleImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getSimple()
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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.AddImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddParameterImpl <em>Add Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.AddParameterImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAddParameter()
		 * @generated
		 */
		EClass ADD_PARAMETER = eINSTANCE.getAddParameter();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.DeleteImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.UnsupportRequestMethodImpl <em>Unsupport Request Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.UnsupportRequestMethodImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getUnsupportRequestMethod()
		 * @generated
		 */
		EClass UNSUPPORT_REQUEST_METHOD = eINSTANCE.getUnsupportRequestMethod();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.DeletePathImpl <em>Delete Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.DeletePathImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDeletePath()
		 * @generated
		 */
		EClass DELETE_PATH = eINSTANCE.getDeletePath();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.RemoveParameterImpl <em>Remove Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.RemoveParameterImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRemoveParameter()
		 * @generated
		 */
		EClass REMOVE_PARAMETER = eINSTANCE.getRemoveParameter();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.DefaultClauseImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDefaultClause()
		 * @generated
		 */
		EClass DEFAULT_CLAUSE = eINSTANCE.getDefaultClause();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ModifyImpl <em>Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ModifyImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getModify()
		 * @generated
		 */
		EClass MODIFY = eINSTANCE.getModify();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ModifyParameterSchemaTypeImpl <em>Modify Parameter Schema Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ModifyParameterSchemaTypeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getModifyParameterSchemaType()
		 * @generated
		 */
		EClass MODIFY_PARAMETER_SCHEMA_TYPE = eINSTANCE.getModifyParameterSchemaType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.UpperBondaryImpl <em>Upper Bondary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.UpperBondaryImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getUpperBondary()
		 * @generated
		 */
		EClass UPPER_BONDARY = eINSTANCE.getUpperBondary();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.LowerBondaryImpl <em>Lower Bondary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.LowerBondaryImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getLowerBondary()
		 * @generated
		 */
		EClass LOWER_BONDARY = eINSTANCE.getLowerBondary();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.DefaultValueImpl <em>Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.DefaultValueImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getDefaultValue()
		 * @generated
		 */
		EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.RenameParameterImpl <em>Rename Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.RenameParameterImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRenameParameter()
		 * @generated
		 */
		EClass RENAME_PARAMETER = eINSTANCE.getRenameParameter();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ConsumeTypeImpl <em>Consume Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ConsumeTypeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getConsumeType()
		 * @generated
		 */
		EClass CONSUME_TYPE = eINSTANCE.getConsumeType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ProduceTypeImpl <em>Produce Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ProduceTypeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getProduceType()
		 * @generated
		 */
		EClass PRODUCE_TYPE = eINSTANCE.getProduceType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddStatusCodeImpl <em>Add Status Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.AddStatusCodeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAddStatusCode()
		 * @generated
		 */
		EClass ADD_STATUS_CODE = eINSTANCE.getAddStatusCode();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.RemoveStatusCodeImpl <em>Remove Status Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.RemoveStatusCodeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRemoveStatusCode()
		 * @generated
		 */
		EClass REMOVE_STATUS_CODE = eINSTANCE.getRemoveStatusCode();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ExposeDataImpl <em>Expose Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ExposeDataImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getExposeData()
		 * @generated
		 */
		EClass EXPOSE_DATA = eINSTANCE.getExposeData();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ElementReferenceImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getElementReference()
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
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE__METHOD = eINSTANCE.getElementReference_Method();

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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ComplexImpl <em>Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ComplexImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getComplex()
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
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.RemoveRestrictionImpl <em>Remove Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.RemoveRestrictionImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRemoveRestriction()
		 * @generated
		 */
		EClass REMOVE_RESTRICTION = eINSTANCE.getRemoveRestriction();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ChangeFormatReturnValueImpl <em>Change Format Return Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ChangeFormatReturnValueImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getChangeFormatReturnValue()
		 * @generated
		 */
		EClass CHANGE_FORMAT_RETURN_VALUE = eINSTANCE.getChangeFormatReturnValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.RenameMethodImpl <em>Rename Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.RenameMethodImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getRenameMethod()
		 * @generated
		 */
		EClass RENAME_METHOD = eINSTANCE.getRenameMethod();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.CombineMethodsImpl <em>Combine Methods</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.CombineMethodsImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getCombineMethods()
		 * @generated
		 */
		EClass COMBINE_METHODS = eINSTANCE.getCombineMethods();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.SplitMethodImpl <em>Split Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.SplitMethodImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getSplitMethod()
		 * @generated
		 */
		EClass SPLIT_METHOD = eINSTANCE.getSplitMethod();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.AddRestrictionImpl <em>Add Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.AddRestrictionImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAddRestriction()
		 * @generated
		 */
		EClass ADD_RESTRICTION = eINSTANCE.getAddRestriction();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ParameterTypeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.impl.ReturnTypeImpl
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.APIElementType <em>API Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.APIElementType
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getAPIElementType()
		 * @generated
		 */
		EEnum API_ELEMENT_TYPE = eINSTANCE.getAPIElementType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.ParameterLocation
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Diff.ElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Diff.ElementType
		 * @see co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl#getElementType()
		 * @generated
		 */
		EEnum ELEMENT_TYPE = eINSTANCE.getElementType();

	}

} //DiffPackage
