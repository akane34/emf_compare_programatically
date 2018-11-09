/**
 */
package co.edu.uniandes.diff.metamodel.diff.impl;

import co.edu.uniandes.diff.metamodel.diff.APIElementType;
import co.edu.uniandes.diff.metamodel.diff.AccessModifier;
import co.edu.uniandes.diff.metamodel.diff.Add;
import co.edu.uniandes.diff.metamodel.diff.Change;
import co.edu.uniandes.diff.metamodel.diff.Complex;
import co.edu.uniandes.diff.metamodel.diff.ConsumeType;
import co.edu.uniandes.diff.metamodel.diff.ContractSuperSet;
import co.edu.uniandes.diff.metamodel.diff.DefaultClause;
import co.edu.uniandes.diff.metamodel.diff.DefaultValue;
import co.edu.uniandes.diff.metamodel.diff.Delete;
import co.edu.uniandes.diff.metamodel.diff.Diff;
import co.edu.uniandes.diff.metamodel.diff.ElementDefinition;
import co.edu.uniandes.diff.metamodel.diff.ElementReference;
import co.edu.uniandes.diff.metamodel.diff.ElementType;
import co.edu.uniandes.diff.metamodel.diff.FieldValue;
import co.edu.uniandes.diff.metamodel.diff.LowerBondary;
import co.edu.uniandes.diff.metamodel.diff.Modify;
import co.edu.uniandes.diff.metamodel.diff.MoveDownInHierarchy;
import co.edu.uniandes.diff.metamodel.diff.MoveUpInHierarchy;
import co.edu.uniandes.diff.metamodel.diff.OtherModifier;
import co.edu.uniandes.diff.metamodel.diff.ParameterLocation;
import co.edu.uniandes.diff.metamodel.diff.ParameterType;
import co.edu.uniandes.diff.metamodel.diff.RefactoringType;
import co.edu.uniandes.diff.metamodel.diff.RelocateParameter;
import co.edu.uniandes.diff.metamodel.diff.Rename;
import co.edu.uniandes.diff.metamodel.diff.ReorderTypeParameters;
import co.edu.uniandes.diff.metamodel.diff.ResultType;
import co.edu.uniandes.diff.metamodel.diff.ReturnType;
import co.edu.uniandes.diff.metamodel.diff.Simple;
import co.edu.uniandes.diff.metamodel.diff.TypeAPI;
import co.edu.uniandes.diff.metamodel.diff.TypeBound;
import co.edu.uniandes.diff.metamodel.diff.UpperBondary;
import co.edu.uniandes.diff.metamodel.diff.diffFactory;
import co.edu.uniandes.diff.metamodel.diff.diffPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class diffPackageImpl extends EPackageImpl implements diffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveDownInHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relocateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reorderTypeParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractSuperSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveUpInHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperBondaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerBondaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAPIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private diffPackageImpl() {
		super(eNS_URI, diffFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link diffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static diffPackage init() {
		if (isInited) return (diffPackage)EPackage.Registry.INSTANCE.getEPackage(diffPackage.eNS_URI);

		// Obtain or create and register package
		diffPackageImpl thediffPackage = (diffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof diffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new diffPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thediffPackage.createPackageContents();

		// Initialize created meta-data
		thediffPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thediffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(diffPackage.eNS_URI, thediffPackage);
		return thediffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiff() {
		return diffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiff_NewVersion() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiff_OldVersion() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiff_RefactoringType() {
		return (EReference)diffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiff_Change() {
		return (EReference)diffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefactoringType() {
		return refactoringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefactoringType_Changes() {
		return (EReference)refactoringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChange() {
		return changeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChange_ChangeElement() {
		return (EAttribute)changeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveDownInHierarchy() {
		return moveDownInHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelocateParameter() {
		return relocateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelocateParameter_NewLocation() {
		return (EAttribute)relocateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelocateParameter_OldLocation() {
		return (EAttribute)relocateParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReorderTypeParameters() {
		return reorderTypeParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractSuperSet() {
		return contractSuperSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveUpInHierarchy() {
		return moveUpInHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_New() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Old() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultClause() {
		return defaultClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModify() {
		return modifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpperBondary() {
		return upperBondaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerBondary() {
		return lowerBondaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValue() {
		return defaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRename() {
		return renameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessModifier() {
		return accessModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeBound() {
		return typeBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumeType() {
		return consumeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldValue() {
		return fieldValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAPI() {
		return typeAPIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherModifier() {
		return otherModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementReference() {
		return elementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementReference_EObject() {
		return (EAttribute)elementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementReference_LineNumber() {
		return (EAttribute)elementReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementReference_Xpath() {
		return (EAttribute)elementReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplex() {
		return complexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplex_SimpleDiffs() {
		return (EReference)complexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_OldDefinition() {
		return (EReference)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_NewDefinition() {
		return (EReference)parameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinition() {
		return elementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_SchemaName() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_Type() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnType() {
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnType_OldDefinition() {
		return (EReference)returnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnType_NewDefinition() {
		return (EReference)returnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAPIElementType() {
		return apiElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterLocation() {
		return parameterLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementType() {
		return elementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public diffFactory getdiffFactory() {
		return (diffFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diffEClass = createEClass(DIFF);
		createEAttribute(diffEClass, DIFF__NEW_VERSION);
		createEAttribute(diffEClass, DIFF__OLD_VERSION);
		createEReference(diffEClass, DIFF__REFACTORING_TYPE);
		createEReference(diffEClass, DIFF__CHANGE);

		refactoringTypeEClass = createEClass(REFACTORING_TYPE);
		createEReference(refactoringTypeEClass, REFACTORING_TYPE__CHANGES);

		changeEClass = createEClass(CHANGE);
		createEAttribute(changeEClass, CHANGE__CHANGE_ELEMENT);

		moveDownInHierarchyEClass = createEClass(MOVE_DOWN_IN_HIERARCHY);

		relocateParameterEClass = createEClass(RELOCATE_PARAMETER);
		createEAttribute(relocateParameterEClass, RELOCATE_PARAMETER__NEW_LOCATION);
		createEAttribute(relocateParameterEClass, RELOCATE_PARAMETER__OLD_LOCATION);

		reorderTypeParametersEClass = createEClass(REORDER_TYPE_PARAMETERS);

		contractSuperSetEClass = createEClass(CONTRACT_SUPER_SET);

		moveUpInHierarchyEClass = createEClass(MOVE_UP_IN_HIERARCHY);

		simpleEClass = createEClass(SIMPLE);
		createEReference(simpleEClass, SIMPLE__NEW);
		createEReference(simpleEClass, SIMPLE__OLD);

		addEClass = createEClass(ADD);

		deleteEClass = createEClass(DELETE);

		defaultClauseEClass = createEClass(DEFAULT_CLAUSE);

		modifyEClass = createEClass(MODIFY);

		upperBondaryEClass = createEClass(UPPER_BONDARY);

		lowerBondaryEClass = createEClass(LOWER_BONDARY);

		defaultValueEClass = createEClass(DEFAULT_VALUE);

		renameEClass = createEClass(RENAME);

		accessModifierEClass = createEClass(ACCESS_MODIFIER);

		typeBoundEClass = createEClass(TYPE_BOUND);

		resultTypeEClass = createEClass(RESULT_TYPE);

		consumeTypeEClass = createEClass(CONSUME_TYPE);

		fieldValueEClass = createEClass(FIELD_VALUE);

		typeAPIEClass = createEClass(TYPE_API);

		otherModifierEClass = createEClass(OTHER_MODIFIER);

		elementReferenceEClass = createEClass(ELEMENT_REFERENCE);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__EOBJECT);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__LINE_NUMBER);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__VALUE);

		complexEClass = createEClass(COMPLEX);
		createEReference(complexEClass, COMPLEX__SIMPLE_DIFFS);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__OLD_DEFINITION);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__NEW_DEFINITION);

		elementDefinitionEClass = createEClass(ELEMENT_DEFINITION);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__SCHEMA_NAME);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__TYPE);

		returnTypeEClass = createEClass(RETURN_TYPE);
		createEReference(returnTypeEClass, RETURN_TYPE__OLD_DEFINITION);
		createEReference(returnTypeEClass, RETURN_TYPE__NEW_DEFINITION);

		// Create enums
		apiElementTypeEEnum = createEEnum(API_ELEMENT_TYPE);
		parameterLocationEEnum = createEEnum(PARAMETER_LOCATION);
		elementTypeEEnum = createEEnum(ELEMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moveDownInHierarchyEClass.getESuperTypes().add(this.getComplex());
		relocateParameterEClass.getESuperTypes().add(this.getComplex());
		reorderTypeParametersEClass.getESuperTypes().add(this.getComplex());
		contractSuperSetEClass.getESuperTypes().add(this.getComplex());
		moveUpInHierarchyEClass.getESuperTypes().add(this.getComplex());
		simpleEClass.getESuperTypes().add(this.getChange());
		addEClass.getESuperTypes().add(this.getSimple());
		deleteEClass.getESuperTypes().add(this.getSimple());
		defaultClauseEClass.getESuperTypes().add(this.getDelete());
		modifyEClass.getESuperTypes().add(this.getSimple());
		upperBondaryEClass.getESuperTypes().add(this.getModify());
		lowerBondaryEClass.getESuperTypes().add(this.getModify());
		defaultValueEClass.getESuperTypes().add(this.getModify());
		renameEClass.getESuperTypes().add(this.getModify());
		accessModifierEClass.getESuperTypes().add(this.getModify());
		typeBoundEClass.getESuperTypes().add(this.getModify());
		resultTypeEClass.getESuperTypes().add(this.getModify());
		consumeTypeEClass.getESuperTypes().add(this.getModify());
		fieldValueEClass.getESuperTypes().add(this.getModify());
		typeAPIEClass.getESuperTypes().add(this.getModify());
		otherModifierEClass.getESuperTypes().add(this.getModify());
		complexEClass.getESuperTypes().add(this.getChange());
		parameterTypeEClass.getESuperTypes().add(this.getModify());
		returnTypeEClass.getESuperTypes().add(this.getModify());

		// Initialize classes, features, and operations; add parameters
		initEClass(diffEClass, Diff.class, "Diff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiff_NewVersion(), ecorePackage.getEString(), "newVersion", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_OldVersion(), ecorePackage.getEString(), "oldVersion", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiff_RefactoringType(), this.getRefactoringType(), null, "refactoringType", null, 0, -1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiff_Change(), this.getChange(), null, "change", null, 0, -1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactoringTypeEClass, RefactoringType.class, "RefactoringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefactoringType_Changes(), this.getChange(), null, "changes", null, 0, -1, RefactoringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeEClass, Change.class, "Change", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChange_ChangeElement(), this.getAPIElementType(), "changeElement", null, 0, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveDownInHierarchyEClass, MoveDownInHierarchy.class, "MoveDownInHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relocateParameterEClass, RelocateParameter.class, "RelocateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelocateParameter_NewLocation(), this.getParameterLocation(), "newLocation", null, 0, 1, RelocateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelocateParameter_OldLocation(), this.getParameterLocation(), "oldLocation", null, 0, 1, RelocateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reorderTypeParametersEClass, ReorderTypeParameters.class, "ReorderTypeParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contractSuperSetEClass, ContractSuperSet.class, "ContractSuperSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveUpInHierarchyEClass, MoveUpInHierarchy.class, "MoveUpInHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_New(), this.getElementReference(), null, "new", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Old(), this.getElementReference(), null, "old", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultClauseEClass, DefaultClause.class, "DefaultClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyEClass, Modify.class, "Modify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(upperBondaryEClass, UpperBondary.class, "UpperBondary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerBondaryEClass, LowerBondary.class, "LowerBondary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultValueEClass, DefaultValue.class, "DefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(renameEClass, Rename.class, "Rename", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessModifierEClass, AccessModifier.class, "AccessModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeBoundEClass, TypeBound.class, "TypeBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumeTypeEClass, ConsumeType.class, "ConsumeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldValueEClass, FieldValue.class, "FieldValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeAPIEClass, TypeAPI.class, "TypeAPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherModifierEClass, OtherModifier.class, "OtherModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementReference_EObject(), ecorePackage.getEJavaObject(), "EObject", null, 0, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementReference_LineNumber(), ecorePackage.getEBigInteger(), "lineNumber", null, 0, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementReference_Xpath(), ecorePackage.getEString(), "xpath", null, 1, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexEClass, Complex.class, "Complex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplex_SimpleDiffs(), this.getSimple(), null, "simpleDiffs", null, 2, -1, Complex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, Object.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterType_OldDefinition(), this.getElementDefinition(), null, "oldDefinition", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterType_NewDefinition(), this.getElementDefinition(), null, "newDefinition", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionEClass, Object.class, "ElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementDefinition_SchemaName(), ecorePackage.getEString(), "SchemaName", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementDefinition_Type(), this.getElementType(), "type", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnTypeEClass, Object.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType_OldDefinition(), this.getElementDefinition(), null, "oldDefinition", null, 1, 1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnType_NewDefinition(), this.getElementDefinition(), null, "newDefinition", null, 1, 1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(apiElementTypeEEnum, APIElementType.class, "APIElementType");
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.PACKAGE);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.CLASS);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.INTERFACE);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.METHOD);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.CONSTRUCTOR);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.FIELD);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.ENUMERATION);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.ELEMENT_ANNOTATION);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.ENUM_LITERAL);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.METHOD_PARAMETER);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.TYPE_FIELD);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.EXCEPTION_THROW);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.TYPE_PARAMETER);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.LOCATION);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.RETURN_TYPE);

		initEEnum(parameterLocationEEnum, ParameterLocation.class, "ParameterLocation");
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.QUERY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.PATH);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.HEADER);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.BODY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.FORM_DATA);

		initEEnum(elementTypeEEnum, ElementType.class, "ElementType");
		addEEnumLiteral(elementTypeEEnum, ElementType.UNSPECIFIED);
		addEEnumLiteral(elementTypeEEnum, ElementType.OBJECT);
		addEEnumLiteral(elementTypeEEnum, ElementType.BOOLEAN);
		addEEnumLiteral(elementTypeEEnum, ElementType.INTEGER);
		addEEnumLiteral(elementTypeEEnum, ElementType.NUMBER);
		addEEnumLiteral(elementTypeEEnum, ElementType.STRING);
		addEEnumLiteral(elementTypeEEnum, ElementType.ARRAY);
		addEEnumLiteral(elementTypeEEnum, ElementType.FILE);
		addEEnumLiteral(elementTypeEEnum, ElementType.NULL);

		// Create resource
		createResource(eNS_URI);
	}

} //diffPackageImpl
