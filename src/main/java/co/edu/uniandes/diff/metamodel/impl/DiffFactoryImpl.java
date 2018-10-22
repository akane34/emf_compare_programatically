/**
 */
package co.edu.uniandes.diff.metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import co.edu.uniandes.diff.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffFactoryImpl extends EFactoryImpl implements DiffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiffFactory init() {
		try {
			DiffFactory theDiffFactory = (DiffFactory)EPackage.Registry.INSTANCE.getEFactory(DiffPackage.eNS_URI);
			if (theDiffFactory != null) {
				return theDiffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffFactoryImpl() {
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
			case DiffPackage.DIFF: return createDiff();
			case DiffPackage.REFACTORING_TYPE: return createRefactoringType();
			case DiffPackage.CHANGE: return createChange();
			case DiffPackage.MOVE_DOWN_IN_HIERARCHY: return createMoveDownInHierarchy();
			case DiffPackage.CHANGE_PARAMETER_LOCATION: return createChangeParameterLocation();
			case DiffPackage.REORDER_TYPE_PARAMETERS: return createReorderTypeParameters();
			case DiffPackage.CONTRACT_SUPER_SET: return createContractSuperSet();
			case DiffPackage.MOVE_UP_IN_HIERARCHY: return createMoveUpInHierarchy();
			case DiffPackage.SIMPLE: return createSimple();
			case DiffPackage.ADD: return createAdd();
			case DiffPackage.DELETE: return createDelete();
			case DiffPackage.DEFAULT_CLAUSE: return createDefaultClause();
			case DiffPackage.MODIFY: return createModify();
			case DiffPackage.RENAME: return createRename();
			case DiffPackage.ACCESS_MODIFIER: return createAccessModifier();
			case DiffPackage.TYPE_BOUND: return createTypeBound();
			case DiffPackage.RESULT_TYPE: return createResultType();
			case DiffPackage.FIELD_VALUE: return createFieldValue();
			case DiffPackage.TYPE_API: return createTypeAPI();
			case DiffPackage.OTHER_MODIFIER: return createOtherModifier();
			case DiffPackage.ELEMENT_REFERENCE: return createElementReference();
			case DiffPackage.API_ELEMENT: return createAPIElement();
			case DiffPackage.COMPLEX: return createComplex();
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
			case DiffPackage.API_ELEMENT_TYPE:
				return createAPIElementTypeFromString(eDataType, initialValue);
			case DiffPackage.PARAMETER_LOCATION:
				return createParameterLocationFromString(eDataType, initialValue);
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
			case DiffPackage.API_ELEMENT_TYPE:
				return convertAPIElementTypeToString(eDataType, instanceValue);
			case DiffPackage.PARAMETER_LOCATION:
				return convertParameterLocationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diff createDiff() {
		DiffImpl diff = new DiffImpl();
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringType createRefactoringType() {
		RefactoringTypeImpl refactoringType = new RefactoringTypeImpl();
		return refactoringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Change createChange() {
		ChangeImpl change = new ChangeImpl();
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveDownInHierarchy createMoveDownInHierarchy() {
		MoveDownInHierarchyImpl moveDownInHierarchy = new MoveDownInHierarchyImpl();
		return moveDownInHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeParameterLocation createChangeParameterLocation() {
		ChangeParameterLocationImpl changeParameterLocation = new ChangeParameterLocationImpl();
		return changeParameterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReorderTypeParameters createReorderTypeParameters() {
		ReorderTypeParametersImpl reorderTypeParameters = new ReorderTypeParametersImpl();
		return reorderTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSuperSet createContractSuperSet() {
		ContractSuperSetImpl contractSuperSet = new ContractSuperSetImpl();
		return contractSuperSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveUpInHierarchy createMoveUpInHierarchy() {
		MoveUpInHierarchyImpl moveUpInHierarchy = new MoveUpInHierarchyImpl();
		return moveUpInHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultClause createDefaultClause() {
		DefaultClauseImpl defaultClause = new DefaultClauseImpl();
		return defaultClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modify createModify() {
		ModifyImpl modify = new ModifyImpl();
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rename createRename() {
		RenameImpl rename = new RenameImpl();
		return rename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier createAccessModifier() {
		AccessModifierImpl accessModifier = new AccessModifierImpl();
		return accessModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBound createTypeBound() {
		TypeBoundImpl typeBound = new TypeBoundImpl();
		return typeBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldValue createFieldValue() {
		FieldValueImpl fieldValue = new FieldValueImpl();
		return fieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAPI createTypeAPI() {
		TypeAPIImpl typeAPI = new TypeAPIImpl();
		return typeAPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherModifier createOtherModifier() {
		OtherModifierImpl otherModifier = new OtherModifierImpl();
		return otherModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReference createElementReference() {
		ElementReferenceImpl elementReference = new ElementReferenceImpl();
		return elementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIElement createAPIElement() {
		APIElementImpl apiElement = new APIElementImpl();
		return apiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex createComplex() {
		ComplexImpl complex = new ComplexImpl();
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIElementType createAPIElementTypeFromString(EDataType eDataType, String initialValue) {
		APIElementType result = APIElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAPIElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation createParameterLocationFromString(EDataType eDataType, String initialValue) {
		ParameterLocation result = ParameterLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPackage getDiffPackage() {
		return (DiffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiffPackage getPackage() {
		return DiffPackage.eINSTANCE;
	}

} //DiffFactoryImpl
