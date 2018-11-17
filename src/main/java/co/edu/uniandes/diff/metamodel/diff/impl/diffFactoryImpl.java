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
			case diffPackage.RELOCATE_PARAMETER: return createRelocateParameter();
			case diffPackage.MULTIPLE_PARAMETERS_IN_ONE: return createMultipleParametersInOne();
			case diffPackage.SAME_PARAMETER: return createSameParameter();
			case diffPackage.SIMPLE: return createSimple();
			case diffPackage.ADD: return createAdd();
			case diffPackage.ADD_PARAMETER: return createAddParameter();
			case diffPackage.DELETE: return createDelete();
			case diffPackage.UNSUPPORT_REQUEST_METHOD: return createUnsupportRequestMethod();
			case diffPackage.DELETE_PATH: return createDeletePath();
			case diffPackage.REMOVE_PARAMETER: return createRemoveParameter();
			case diffPackage.DEFAULT_CLAUSE: return createDefaultClause();
			case diffPackage.MODIFY: return createModify();
			case diffPackage.MODIFY_PARAMETER_SCHEMA_TYPE: return createModifyParameterSchemaType();
			case diffPackage.UPPER_BONDARY: return createUpperBondary();
			case diffPackage.LOWER_BONDARY: return createLowerBondary();
			case diffPackage.DEFAULT_VALUE: return createDefaultValue();
			case diffPackage.RENAME_PARAMETER: return createRenameParameter();
			case diffPackage.CONSUME_TYPE: return createConsumeType();
			case diffPackage.PRODUCE_TYPE: return createProduceType();
			case diffPackage.ADD_STATUS_CODE: return createAddStatusCode();
			case diffPackage.REMOVE_STATUS_CODE: return createRemoveStatusCode();
			case diffPackage.EXPOSE_DATA: return createExposeData();
			case diffPackage.ELEMENT_REFERENCE: return createElementReference();
			case diffPackage.COMPLEX: return createComplex();
			case diffPackage.REMOVE_RESTRICTION: return createRemoveRestriction();
			case diffPackage.CHANGE_FORMAT_RETURN_VALUE: return createChangeFormatReturnValue();
			case diffPackage.RENAME_METHOD: return createRenameMethod();
			case diffPackage.COMBINE_METHODS: return createCombineMethods();
			case diffPackage.SPLIT_METHOD: return createSplitMethod();
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
	public RelocateParameter createRelocateParameter() {
		RelocateParameterImpl relocateParameter = new RelocateParameterImpl();
		return relocateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleParametersInOne createMultipleParametersInOne() {
		MultipleParametersInOneImpl multipleParametersInOne = new MultipleParametersInOneImpl();
		return multipleParametersInOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameParameter createSameParameter() {
		SameParameterImpl sameParameter = new SameParameterImpl();
		return sameParameter;
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
	public AddParameter createAddParameter() {
		AddParameterImpl addParameter = new AddParameterImpl();
		return addParameter;
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
	public UnsupportRequestMethod createUnsupportRequestMethod() {
		UnsupportRequestMethodImpl unsupportRequestMethod = new UnsupportRequestMethodImpl();
		return unsupportRequestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePath createDeletePath() {
		DeletePathImpl deletePath = new DeletePathImpl();
		return deletePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveParameter createRemoveParameter() {
		RemoveParameterImpl removeParameter = new RemoveParameterImpl();
		return removeParameter;
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
	public ModifyParameterSchemaType createModifyParameterSchemaType() {
		ModifyParameterSchemaTypeImpl modifyParameterSchemaType = new ModifyParameterSchemaTypeImpl();
		return modifyParameterSchemaType;
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
	public RenameParameter createRenameParameter() {
		RenameParameterImpl renameParameter = new RenameParameterImpl();
		return renameParameter;
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
	public ProduceType createProduceType() {
		ProduceTypeImpl produceType = new ProduceTypeImpl();
		return produceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStatusCode createAddStatusCode() {
		AddStatusCodeImpl addStatusCode = new AddStatusCodeImpl();
		return addStatusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStatusCode createRemoveStatusCode() {
		RemoveStatusCodeImpl removeStatusCode = new RemoveStatusCodeImpl();
		return removeStatusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposeData createExposeData() {
		ExposeDataImpl exposeData = new ExposeDataImpl();
		return exposeData;
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
	public ChangeFormatReturnValue createChangeFormatReturnValue() {
		ChangeFormatReturnValueImpl changeFormatReturnValue = new ChangeFormatReturnValueImpl();
		return changeFormatReturnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameMethod createRenameMethod() {
		RenameMethodImpl renameMethod = new RenameMethodImpl();
		return renameMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombineMethods createCombineMethods() {
		CombineMethodsImpl combineMethods = new CombineMethodsImpl();
		return combineMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitMethod createSplitMethod() {
		SplitMethodImpl splitMethod = new SplitMethodImpl();
		return splitMethod;
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
