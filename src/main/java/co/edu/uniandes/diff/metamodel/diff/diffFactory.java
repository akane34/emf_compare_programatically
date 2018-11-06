/**
 */
package co.edu.uniandes.diff.metamodel.diff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage
 * @generated
 */
public interface diffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	diffFactory eINSTANCE = co.edu.uniandes.diff.metamodel.diff.impl.diffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff</em>'.
	 * @generated
	 */
	Diff createDiff();

	/**
	 * Returns a new object of class '<em>Refactoring Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refactoring Type</em>'.
	 * @generated
	 */
	RefactoringType createRefactoringType();

	/**
	 * Returns a new object of class '<em>Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change</em>'.
	 * @generated
	 */
	Change createChange();

	/**
	 * Returns a new object of class '<em>Move Down In Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Down In Hierarchy</em>'.
	 * @generated
	 */
	MoveDownInHierarchy createMoveDownInHierarchy();

	/**
	 * Returns a new object of class '<em>Relocate Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relocate Parameter</em>'.
	 * @generated
	 */
	RelocateParameter createRelocateParameter();

	/**
	 * Returns a new object of class '<em>Reorder Type Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reorder Type Parameters</em>'.
	 * @generated
	 */
	ReorderTypeParameters createReorderTypeParameters();

	/**
	 * Returns a new object of class '<em>Contract Super Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Super Set</em>'.
	 * @generated
	 */
	ContractSuperSet createContractSuperSet();

	/**
	 * Returns a new object of class '<em>Move Up In Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Up In Hierarchy</em>'.
	 * @generated
	 */
	MoveUpInHierarchy createMoveUpInHierarchy();

	/**
	 * Returns a new object of class '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple</em>'.
	 * @generated
	 */
	Simple createSimple();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Default Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Clause</em>'.
	 * @generated
	 */
	DefaultClause createDefaultClause();

	/**
	 * Returns a new object of class '<em>Modify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify</em>'.
	 * @generated
	 */
	Modify createModify();

	/**
	 * Returns a new object of class '<em>Upper Bondary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upper Bondary</em>'.
	 * @generated
	 */
	UpperBondary createUpperBondary();

	/**
	 * Returns a new object of class '<em>Lower Bondary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Bondary</em>'.
	 * @generated
	 */
	LowerBondary createLowerBondary();

	/**
	 * Returns a new object of class '<em>Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value</em>'.
	 * @generated
	 */
	DefaultValue createDefaultValue();

	/**
	 * Returns a new object of class '<em>Rename</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename</em>'.
	 * @generated
	 */
	Rename createRename();

	/**
	 * Returns a new object of class '<em>Access Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Modifier</em>'.
	 * @generated
	 */
	AccessModifier createAccessModifier();

	/**
	 * Returns a new object of class '<em>Type Bound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Bound</em>'.
	 * @generated
	 */
	TypeBound createTypeBound();

	/**
	 * Returns a new object of class '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Type</em>'.
	 * @generated
	 */
	ResultType createResultType();

	/**
	 * Returns a new object of class '<em>Consume Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consume Type</em>'.
	 * @generated
	 */
	ConsumeType createConsumeType();

	/**
	 * Returns a new object of class '<em>Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Value</em>'.
	 * @generated
	 */
	FieldValue createFieldValue();

	/**
	 * Returns a new object of class '<em>Type API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type API</em>'.
	 * @generated
	 */
	TypeAPI createTypeAPI();

	/**
	 * Returns a new object of class '<em>Other Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Modifier</em>'.
	 * @generated
	 */
	OtherModifier createOtherModifier();

	/**
	 * Returns a new object of class '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Reference</em>'.
	 * @generated
	 */
	ElementReference createElementReference();

	/**
	 * Returns a new object of class '<em>Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex</em>'.
	 * @generated
	 */
	Complex createComplex();

	/**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
	ParameterType createParameterType();

	/**
	 * Returns a new object of class '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition</em>'.
	 * @generated
	 */
	ElementDefinition createElementDefinition();

	/**
	 * Returns a new object of class '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type</em>'.
	 * @generated
	 */
	ReturnType createReturnType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	diffPackage getdiffPackage();

} //diffFactory
