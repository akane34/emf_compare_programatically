/**
 */
package co.edu.uniandes.metamodels.Diff.impl;

import co.edu.uniandes.metamodels.Diff.APIElementType;
import co.edu.uniandes.metamodels.Diff.Add;
import co.edu.uniandes.metamodels.Diff.AddParameter;
import co.edu.uniandes.metamodels.Diff.AddRestriction;
import co.edu.uniandes.metamodels.Diff.AddStatusCode;
import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.metamodels.Diff.ChangeFormatReturnValue;
import co.edu.uniandes.metamodels.Diff.CombineMethods;
import co.edu.uniandes.metamodels.Diff.Complex;
import co.edu.uniandes.metamodels.Diff.ConsumeType;
import co.edu.uniandes.metamodels.Diff.DefaultClause;
import co.edu.uniandes.metamodels.Diff.DefaultValue;
import co.edu.uniandes.metamodels.Diff.Delete;
import co.edu.uniandes.metamodels.Diff.DeletePath;
import co.edu.uniandes.metamodels.Diff.Diff;
import co.edu.uniandes.metamodels.Diff.DiffFactory;
import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Diff.ElementReference;
import co.edu.uniandes.metamodels.Diff.ElementType;
import co.edu.uniandes.metamodels.Diff.ExposeData;
import co.edu.uniandes.metamodels.Diff.LowerBondary;
import co.edu.uniandes.metamodels.Diff.Modify;
import co.edu.uniandes.metamodels.Diff.ModifyParameterSchemaType;
import co.edu.uniandes.metamodels.Diff.MultipleParametersInOne;
import co.edu.uniandes.metamodels.Diff.ParameterLocation;
import co.edu.uniandes.metamodels.Diff.ParameterType;
import co.edu.uniandes.metamodels.Diff.ProduceType;
import co.edu.uniandes.metamodels.Diff.RefactoringType;
import co.edu.uniandes.metamodels.Diff.RelocateParameter;
import co.edu.uniandes.metamodels.Diff.RemoveParameter;
import co.edu.uniandes.metamodels.Diff.RemoveRestriction;
import co.edu.uniandes.metamodels.Diff.RemoveStatusCode;
import co.edu.uniandes.metamodels.Diff.RenameMethod;
import co.edu.uniandes.metamodels.Diff.RenameParameter;
import co.edu.uniandes.metamodels.Diff.ReturnType;
import co.edu.uniandes.metamodels.Diff.SameParameter;
import co.edu.uniandes.metamodels.Diff.Simple;
import co.edu.uniandes.metamodels.Diff.SplitMethod;
import co.edu.uniandes.metamodels.Diff.UnsupportRequestMethod;
import co.edu.uniandes.metamodels.Diff.UpperBondary;

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
	private EClass relocateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleParametersInOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameParameterEClass = null;

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
	private EClass addParameterEClass = null;

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
	private EClass unsupportRequestMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeParameterEClass = null;

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
	private EClass modifyParameterSchemaTypeEClass = null;

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
	private EClass renameParameterEClass = null;

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
	private EClass produceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStatusCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStatusCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposeDataEClass = null;

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
	private EClass removeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeFormatReturnValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combineMethodsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addRestrictionEClass = null;

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
	 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#eNS_URI
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
	public EClass getMultipleParametersInOne() {
		return multipleParametersInOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameParameter() {
		return sameParameterEClass;
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
	public EClass getAddParameter() {
		return addParameterEClass;
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
	public EClass getUnsupportRequestMethod() {
		return unsupportRequestMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletePath() {
		return deletePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveParameter() {
		return removeParameterEClass;
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
	public EClass getModifyParameterSchemaType() {
		return modifyParameterSchemaTypeEClass;
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
	public EClass getRenameParameter() {
		return renameParameterEClass;
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
	public EClass getProduceType() {
		return produceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStatusCode() {
		return addStatusCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStatusCode() {
		return removeStatusCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExposeData() {
		return exposeDataEClass;
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
	public EAttribute getElementReference_Method() {
		return (EAttribute)elementReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementReference_Value() {
		return (EAttribute)elementReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementReference_Path() {
		return (EAttribute)elementReferenceEClass.getEStructuralFeatures().get(3);
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
	public EClass getRemoveRestriction() {
		return removeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeFormatReturnValue() {
		return changeFormatReturnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameMethod() {
		return renameMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombineMethods() {
		return combineMethodsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitMethod() {
		return splitMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddRestriction() {
		return addRestrictionEClass;
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
	public EClass getReturnType() {
		return returnTypeEClass;
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

		relocateParameterEClass = createEClass(RELOCATE_PARAMETER);
		createEAttribute(relocateParameterEClass, RELOCATE_PARAMETER__NEW_LOCATION);
		createEAttribute(relocateParameterEClass, RELOCATE_PARAMETER__OLD_LOCATION);

		multipleParametersInOneEClass = createEClass(MULTIPLE_PARAMETERS_IN_ONE);

		sameParameterEClass = createEClass(SAME_PARAMETER);

		simpleEClass = createEClass(SIMPLE);
		createEReference(simpleEClass, SIMPLE__NEW);
		createEReference(simpleEClass, SIMPLE__OLD);

		addEClass = createEClass(ADD);

		addParameterEClass = createEClass(ADD_PARAMETER);

		deleteEClass = createEClass(DELETE);

		unsupportRequestMethodEClass = createEClass(UNSUPPORT_REQUEST_METHOD);

		deletePathEClass = createEClass(DELETE_PATH);

		removeParameterEClass = createEClass(REMOVE_PARAMETER);

		defaultClauseEClass = createEClass(DEFAULT_CLAUSE);

		modifyEClass = createEClass(MODIFY);

		modifyParameterSchemaTypeEClass = createEClass(MODIFY_PARAMETER_SCHEMA_TYPE);

		upperBondaryEClass = createEClass(UPPER_BONDARY);

		lowerBondaryEClass = createEClass(LOWER_BONDARY);

		defaultValueEClass = createEClass(DEFAULT_VALUE);

		renameParameterEClass = createEClass(RENAME_PARAMETER);

		consumeTypeEClass = createEClass(CONSUME_TYPE);

		produceTypeEClass = createEClass(PRODUCE_TYPE);

		addStatusCodeEClass = createEClass(ADD_STATUS_CODE);

		removeStatusCodeEClass = createEClass(REMOVE_STATUS_CODE);

		exposeDataEClass = createEClass(EXPOSE_DATA);

		elementReferenceEClass = createEClass(ELEMENT_REFERENCE);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__EOBJECT);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__METHOD);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__VALUE);
		createEAttribute(elementReferenceEClass, ELEMENT_REFERENCE__PATH);

		complexEClass = createEClass(COMPLEX);
		createEReference(complexEClass, COMPLEX__SIMPLE_DIFFS);

		removeRestrictionEClass = createEClass(REMOVE_RESTRICTION);

		changeFormatReturnValueEClass = createEClass(CHANGE_FORMAT_RETURN_VALUE);

		renameMethodEClass = createEClass(RENAME_METHOD);

		combineMethodsEClass = createEClass(COMBINE_METHODS);

		splitMethodEClass = createEClass(SPLIT_METHOD);

		addRestrictionEClass = createEClass(ADD_RESTRICTION);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);

		returnTypeEClass = createEClass(RETURN_TYPE);

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
		relocateParameterEClass.getESuperTypes().add(this.getComplex());
		multipleParametersInOneEClass.getESuperTypes().add(this.getRelocateParameter());
		sameParameterEClass.getESuperTypes().add(this.getRelocateParameter());
		simpleEClass.getESuperTypes().add(this.getChange());
		addEClass.getESuperTypes().add(this.getSimple());
		addParameterEClass.getESuperTypes().add(this.getAdd());
		deleteEClass.getESuperTypes().add(this.getSimple());
		unsupportRequestMethodEClass.getESuperTypes().add(this.getDelete());
		deletePathEClass.getESuperTypes().add(this.getDelete());
		removeParameterEClass.getESuperTypes().add(this.getDelete());
		defaultClauseEClass.getESuperTypes().add(this.getDelete());
		modifyEClass.getESuperTypes().add(this.getSimple());
		modifyParameterSchemaTypeEClass.getESuperTypes().add(this.getModify());
		upperBondaryEClass.getESuperTypes().add(this.getModify());
		lowerBondaryEClass.getESuperTypes().add(this.getModify());
		defaultValueEClass.getESuperTypes().add(this.getModify());
		renameParameterEClass.getESuperTypes().add(this.getModify());
		consumeTypeEClass.getESuperTypes().add(this.getModify());
		produceTypeEClass.getESuperTypes().add(this.getModify());
		addStatusCodeEClass.getESuperTypes().add(this.getModify());
		removeStatusCodeEClass.getESuperTypes().add(this.getModify());
		exposeDataEClass.getESuperTypes().add(this.getComplex());
		complexEClass.getESuperTypes().add(this.getChange());
		removeRestrictionEClass.getESuperTypes().add(this.getComplex());
		changeFormatReturnValueEClass.getESuperTypes().add(this.getModify());
		renameMethodEClass.getESuperTypes().add(this.getComplex());
		combineMethodsEClass.getESuperTypes().add(this.getComplex());
		splitMethodEClass.getESuperTypes().add(this.getComplex());
		addRestrictionEClass.getESuperTypes().add(this.getComplex());
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

		initEClass(relocateParameterEClass, RelocateParameter.class, "RelocateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelocateParameter_NewLocation(), this.getParameterLocation(), "newLocation", null, 0, 1, RelocateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelocateParameter_OldLocation(), this.getParameterLocation(), "oldLocation", null, 0, 1, RelocateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleParametersInOneEClass, MultipleParametersInOne.class, "MultipleParametersInOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sameParameterEClass, SameParameter.class, "SameParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_New(), this.getElementReference(), null, "new", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Old(), this.getElementReference(), null, "old", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addParameterEClass, AddParameter.class, "AddParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsupportRequestMethodEClass, UnsupportRequestMethod.class, "UnsupportRequestMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deletePathEClass, DeletePath.class, "DeletePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeParameterEClass, RemoveParameter.class, "RemoveParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultClauseEClass, DefaultClause.class, "DefaultClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyEClass, Modify.class, "Modify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyParameterSchemaTypeEClass, ModifyParameterSchemaType.class, "ModifyParameterSchemaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(upperBondaryEClass, UpperBondary.class, "UpperBondary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerBondaryEClass, LowerBondary.class, "LowerBondary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultValueEClass, DefaultValue.class, "DefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(renameParameterEClass, RenameParameter.class, "RenameParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumeTypeEClass, ConsumeType.class, "ConsumeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(produceTypeEClass, ProduceType.class, "ProduceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addStatusCodeEClass, AddStatusCode.class, "AddStatusCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeStatusCodeEClass, RemoveStatusCode.class, "RemoveStatusCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exposeDataEClass, ExposeData.class, "ExposeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementReference_EObject(), ecorePackage.getEString(), "EObject", null, 0, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementReference_Method(), ecorePackage.getEString(), "method", null, 0, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementReference_Value(), ecorePackage.getEString(), "value", null, 1, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementReference_Path(), ecorePackage.getEString(), "path", null, 0, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexEClass, Complex.class, "Complex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplex_SimpleDiffs(), this.getSimple(), null, "simpleDiffs", null, 1, -1, Complex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeRestrictionEClass, RemoveRestriction.class, "RemoveRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeFormatReturnValueEClass, ChangeFormatReturnValue.class, "ChangeFormatReturnValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(renameMethodEClass, RenameMethod.class, "RenameMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combineMethodsEClass, CombineMethods.class, "CombineMethods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitMethodEClass, SplitMethod.class, "SplitMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addRestrictionEClass, AddRestriction.class, "AddRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.PATH);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.CONTENT_TYPE);
		addEEnumLiteral(apiElementTypeEEnum, APIElementType.STATUS_CODE);

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

} //DiffPackageImpl
