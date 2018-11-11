/**
 */
package co.edu.uniandes.diff.metamodel.diff.impl;

import co.edu.uniandes.diff.metamodel.diff.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class diffFactoryImpl extends EFactoryImpl implements diffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static diffFactory init() {
		try {
			diffFactory thediffFactory = (diffFactory)EPackage.Registry.INSTANCE.getEFactory(diffPackage.eNS_URI);
			if (thediffFactory != null) {
				return thediffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new diffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public diffFactoryImpl() {
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
			case diffPackage.DIFF: return createDiff();
			case diffPackage.REFACTORING_TYPE: return createRefactoringType();
			case diffPackage.CHANGE: return createChange();
			case diffPackage.MOVE_DOWN_IN_HIERARCHY: return createMoveDownInHierarchy();
			case diffPackage.RELOCATE_PARAMETER: return createRelocateParameter();
			case diffPackage.REORDER_TYPE_PARAMETERS: return createReorderTypeParameters();
			case diffPackage.CONTRACT_SUPER_SET: return createContractSuperSet();
			case diffPackage.MOVE_UP_IN_HIERARCHY: return createMoveUpInHierarchy();
			case diffPackage.SIMPLE: return createSimple();
			case diffPackage.ADD: return createAdd();
			case diffPackage.DELETE: return createDelete();
			case diffPackage.DEFAULT_CLAUSE: return createDefaultClause();
			case diffPackage.MODIFY: return createModify();
			case diffPackage.UPPER_BONDARY: return createUpperBondary();
			case diffPackage.LOWER_BONDARY: return createLowerBondary();
			case diffPackage.DEFAULT_VALUE: return createDefaultValue();
			case diffPackage.RENAME: return createRename();
			case diffPackage.ACCESS_MODIFIER: return createAccessModifier();
			case diffPackage.TYPE_BOUND: return createTypeBound();
			case diffPackage.RESULT_TYPE: return createResultType();
			case diffPackage.CONSUME_TYPE: return createConsumeType();
			case diffPackage.FIELD_VALUE: return createFieldValue();
			case diffPackage.TYPE_API: return createTypeAPI();
			case diffPackage.OTHER_MODIFIER: return createOtherModifier();
			case diffPackage.ELEMENT_REFERENCE: return createElementReference();
			case diffPackage.COMPLEX: return createComplex();
			case diffPackage.REMOVE_RESTRICTION: return createRemoveRestriction();
			case diffPackage.ADD_RESTRICTION: return createAddRestriction();
			case diffPackage.PARAMETER_TYPE: return (EObject)createParameterType();
			case diffPackage.ELEMENT_DEFINITION: return (EObject)createElementDefinition();
			case diffPackage.RETURN_TYPE: return (EObject)createReturnType();
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
			case diffPackage.API_ELEMENT_TYPE:
				return createAPIElementTypeFromString(eDataType, initialValue);
			case diffPackage.PARAMETER_LOCATION:
				return createParameterLocationFromString(eDataType, initialValue);
			case diffPackage.ELEMENT_TYPE:
				return createElementTypeFromString(eDataType, initialValue);
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
			case diffPackage.API_ELEMENT_TYPE:
				return convertAPIElementTypeToString(eDataType, instanceValue);
			case diffPackage.PARAMETER_LOCATION:
				return convertParameterLocationToString(eDataType, instanceValue);
			case diffPackage.ELEMENT_TYPE:
				return convertElementTypeToString(eDataType, instanceValue);
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
	public RelocateParameter createRelocateParameter() {
		RelocateParameterImpl relocateParameter = new RelocateParameterImpl();
		return relocateParameter;
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
	public UpperBondary createUpperBondary() {
		UpperBondaryImpl upperBondary = new UpperBondaryImpl();
		return upperBondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBondary createLowerBondary() {
		LowerBondaryImpl lowerBondary = new LowerBondaryImpl();
		return lowerBondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValue createDefaultValue() {
		DefaultValueImpl defaultValue = new DefaultValueImpl();
		return defaultValue;
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
	public ConsumeType createConsumeType() {
		ConsumeTypeImpl consumeType = new ConsumeTypeImpl();
		return consumeType;
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
	public Complex createComplex() {
		ComplexImpl complex = new ComplexImpl();
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRestriction createRemoveRestriction() {
		RemoveRestrictionImpl removeRestriction = new RemoveRestrictionImpl();
		return removeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddRestriction createAddRestriction() {
		AddRestrictionImpl addRestriction = new AddRestrictionImpl();
		return addRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
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
	public ElementType createElementTypeFromString(EDataType eDataType, String initialValue) {
		ElementType result = ElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public diffPackage getdiffPackage() {
		return (diffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static diffPackage getPackage() {
		return diffPackage.eINSTANCE;
	}

} //diffFactoryImpl
