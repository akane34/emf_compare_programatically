/**
 */
package co.edu.uniandes.metamodels.Diff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage
 * @generated
 */
public interface DiffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffFactory eINSTANCE = co.edu.uniandes.metamodels.Diff.impl.DiffFactoryImpl.init();

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
	 * Returns a new object of class '<em>Relocate Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relocate Parameter</em>'.
	 * @generated
	 */
	RelocateParameter createRelocateParameter();

	/**
	 * Returns a new object of class '<em>Multiple Parameters In One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Parameters In One</em>'.
	 * @generated
	 */
	MultipleParametersInOne createMultipleParametersInOne();

	/**
	 * Returns a new object of class '<em>Same Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Same Parameter</em>'.
	 * @generated
	 */
	SameParameter createSameParameter();

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
	 * Returns a new object of class '<em>Add Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Parameter</em>'.
	 * @generated
	 */
	AddParameter createAddParameter();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Unsupport Request Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsupport Request Method</em>'.
	 * @generated
	 */
	UnsupportRequestMethod createUnsupportRequestMethod();

	/**
	 * Returns a new object of class '<em>Delete Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Path</em>'.
	 * @generated
	 */
	DeletePath createDeletePath();

	/**
	 * Returns a new object of class '<em>Remove Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Parameter</em>'.
	 * @generated
	 */
	RemoveParameter createRemoveParameter();

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
	 * Returns a new object of class '<em>Modify Parameter Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Parameter Schema Type</em>'.
	 * @generated
	 */
	ModifyParameterSchemaType createModifyParameterSchemaType();

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
	 * Returns a new object of class '<em>Rename Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Parameter</em>'.
	 * @generated
	 */
	RenameParameter createRenameParameter();

	/**
	 * Returns a new object of class '<em>Consume Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consume Type</em>'.
	 * @generated
	 */
	ConsumeType createConsumeType();

	/**
	 * Returns a new object of class '<em>Produce Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produce Type</em>'.
	 * @generated
	 */
	ProduceType createProduceType();

	/**
	 * Returns a new object of class '<em>Add Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Status Code</em>'.
	 * @generated
	 */
	AddStatusCode createAddStatusCode();

	/**
	 * Returns a new object of class '<em>Remove Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Status Code</em>'.
	 * @generated
	 */
	RemoveStatusCode createRemoveStatusCode();

	/**
	 * Returns a new object of class '<em>Expose Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expose Data</em>'.
	 * @generated
	 */
	ExposeData createExposeData();

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
	 * Returns a new object of class '<em>Remove Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Restriction</em>'.
	 * @generated
	 */
	RemoveRestriction createRemoveRestriction();

	/**
	 * Returns a new object of class '<em>Change Format Return Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Format Return Value</em>'.
	 * @generated
	 */
	ChangeFormatReturnValue createChangeFormatReturnValue();

	/**
	 * Returns a new object of class '<em>Rename Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Method</em>'.
	 * @generated
	 */
	RenameMethod createRenameMethod();

	/**
	 * Returns a new object of class '<em>Combine Methods</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combine Methods</em>'.
	 * @generated
	 */
	CombineMethods createCombineMethods();

	/**
	 * Returns a new object of class '<em>Split Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Method</em>'.
	 * @generated
	 */
	SplitMethod createSplitMethod();

	/**
	 * Returns a new object of class '<em>Add Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Restriction</em>'.
	 * @generated
	 */
	AddRestriction createAddRestriction();

	/**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
	ParameterType createParameterType();

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
	DiffPackage getDiffPackage();

} //DiffFactory
