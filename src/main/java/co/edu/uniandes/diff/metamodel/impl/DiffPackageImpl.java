/**
 */
package co.edu.uniandes.diff.metamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import co.edu.uniandes.diff.metamodel.APIElement;
import co.edu.uniandes.diff.metamodel.APIElementType;
import co.edu.uniandes.diff.metamodel.AccessModifier;
import co.edu.uniandes.diff.metamodel.Add;
import co.edu.uniandes.diff.metamodel.Change;
import co.edu.uniandes.diff.metamodel.ChangeParameterLocation;
import co.edu.uniandes.diff.metamodel.Complex;
import co.edu.uniandes.diff.metamodel.ContractSuperSet;
import co.edu.uniandes.diff.metamodel.DefaultClause;
import co.edu.uniandes.diff.metamodel.Delete;
import co.edu.uniandes.diff.metamodel.Diff;
import co.edu.uniandes.diff.metamodel.DiffFactory;
import co.edu.uniandes.diff.metamodel.DiffPackage;
import co.edu.uniandes.diff.metamodel.ElementReference;
import co.edu.uniandes.diff.metamodel.FieldValue;
import co.edu.uniandes.diff.metamodel.Modify;
import co.edu.uniandes.diff.metamodel.MoveDownInHierarchy;
import co.edu.uniandes.diff.metamodel.MoveUpInHierarchy;
import co.edu.uniandes.diff.metamodel.OtherModifier;
import co.edu.uniandes.diff.metamodel.ParameterLocation;
import co.edu.uniandes.diff.metamodel.RefactoringType;
import co.edu.uniandes.diff.metamodel.Rename;
import co.edu.uniandes.diff.metamodel.ReorderTypeParameters;
import co.edu.uniandes.diff.metamodel.ResultType;
import co.edu.uniandes.diff.metamodel.Simple;
import co.edu.uniandes.diff.metamodel.TypeAPI;
import co.edu.uniandes.diff.metamodel.TypeBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffPackageImpl extends EPackageImpl implements DiffPackage {
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
	private EClass changeParameterLocationEClass = null;

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
	private EClass apiElementEClass = null;

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
	private EEnum apiElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterLocationEEnum = null;

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
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiffPackageImpl() {
		super(eNS_URI, DiffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DiffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiffPackage init() {
		if (isInited) return (DiffPackage)EPackage.Registry.INSTANCE.getEPackage(DiffPackage.eNS_URI);

		// Obtain or create and register package
		DiffPackageImpl theDiffPackage = (DiffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiffPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiffPackage.createPackageContents();

		// Initialize created meta-data
		theDiffPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiffPackage.eNS_URI, theDiffPackage);
		return theDiffPackage;
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
	public EClass getChangeParameterLocation() {
		return changeParameterLocationEClass;
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
	public EAttribute getElementReference_ApiElementName() {
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
	public EReference getElementReference_ApiElement() {
		return (EReference)elementReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIElement() {
		return apiElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIElement_Location() {
		return (EAttribute)apiElementEClass.getEStructuralFeatures().get(0);
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
	public DiffFactory getDiffFactory() {
		return (DiffFactory)getEFactoryInstance();
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

		changeParameterLocationEClass = createEClass(CHANGE_PARAMETER_LOCATION);

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

		renameEClass = createEClass(RENAME);

		accessModifierEClass = createEClass(ACCESS_MODIFIER);

		typeBoundEClass = createEClass(TYPE_BOUND);

		resultTypeEClass = createEClass(RESULT_TYPE);

		fieldValueEClass = createEClass(FIELD_VALUE);

		typeAPIEClass = createEClass(TYPE_API);

		otherModifierEClass = createEClass(OTHER_MODIFIER);

		elementReferenceEClass = createEClass(ELEMENT_REFERENCE);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__API_ELEMENT_NAME);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__LINE_NUMBER);
		createEReference(elementReferenceEClass, ELEMENT_REFERENCE__API_ELEMENT);

		apiElementEClass = createEClass(API_ELEMENT);
		createEAttribute(apiElementEClass, API_ELEMENT__LOCATION);

		complexEClass = createEClass(COMPLEX);
		createEReference(complexEClass, COMPLEX__SIMPLE_DIFFS);

		// Create enums
		apiElementTypeEEnum = createEEnum(API_ELEMENT_TYPE);
		parameterLocationEEnum = createEEnum(PARAMETER_LOCATION);
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
		changeParameterLocationEClass.getESuperTypes().add(this.getComplex());
		reorderTypeParametersEClass.getESuperTypes().add(this.getComplex());
		contractSuperSetEClass.getESuperTypes().add(this.getComplex());
		moveUpInHierarchyEClass.getESuperTypes().add(this.getComplex());
		simpleEClass.getESuperTypes().add(this.getChange());
		addEClass.getESuperTypes().add(this.getSimple());
		deleteEClass.getESuperTypes().add(this.getSimple());
		defaultClauseEClass.getESuperTypes().add(this.getDelete());
		modifyEClass.getESuperTypes().add(this.getSimple());
		renameEClass.getESuperTypes().add(this.getModify());
		accessModifierEClass.getESuperTypes().add(this.getModify());
		typeBoundEClass.getESuperTypes().add(this.getModify());
		resultTypeEClass.getESuperTypes().add(this.getModify());
		fieldValueEClass.getESuperTypes().add(this.getModify());
		typeAPIEClass.getESuperTypes().add(this.getModify());
		otherModifierEClass.getESuperTypes().add(this.getModify());
		complexEClass.getESuperTypes().add(this.getChange());

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

		initEClass(changeParameterLocationEClass, ChangeParameterLocation.class, "ChangeParameterLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(renameEClass, Rename.class, "Rename", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessModifierEClass, AccessModifier.class, "AccessModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeBoundEClass, TypeBound.class, "TypeBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldValueEClass, FieldValue.class, "FieldValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeAPIEClass, TypeAPI.class, "TypeAPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherModifierEClass, OtherModifier.class, "OtherModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementReference_ApiElementName(), ecorePackage.getEString(), "apiElementName", null, 0, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementReference_LineNumber(), ecorePackage.getEBigInteger(), "lineNumber", null, 0, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementReference_ApiElement(), this.getAPIElement(), null, "apiElement", null, 1, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiElementEClass, APIElement.class, "APIElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIElement_Location(), this.getParameterLocation(), "location", null, 0, 1, APIElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexEClass, Complex.class, "Complex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplex_SimpleDiffs(), this.getSimple(), null, "simpleDiffs", null, 2, -1, Complex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(parameterLocationEEnum, ParameterLocation.class, "ParameterLocation");
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.NONE);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.QUERY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.PATH);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.HEADER);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.BODY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.FORM_DATA);

		// Create resource
		createResource(eNS_URI);
	}

} //DiffPackageImpl
