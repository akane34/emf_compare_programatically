/**
 */
package co.edu.uniandes.metamodels.Diff.util;

import co.edu.uniandes.metamodels.Diff.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage
 * @generated
 */
public class DiffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffSwitch() {
		if (modelPackage == null) {
			modelPackage = DiffPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiffPackage.DIFF: {
				Diff diff = (Diff)theEObject;
				T result = caseDiff(diff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.REFACTORING_TYPE: {
				RefactoringType refactoringType = (RefactoringType)theEObject;
				T result = caseRefactoringType(refactoringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.CHANGE: {
				Change change = (Change)theEObject;
				T result = caseChange(change);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.RELOCATE_PARAMETER: {
				RelocateParameter relocateParameter = (RelocateParameter)theEObject;
				T result = caseRelocateParameter(relocateParameter);
				if (result == null) result = caseComplex(relocateParameter);
				if (result == null) result = caseChange(relocateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.MULTIPLE_PARAMETERS_IN_ONE: {
				MultipleParametersInOne multipleParametersInOne = (MultipleParametersInOne)theEObject;
				T result = caseMultipleParametersInOne(multipleParametersInOne);
				if (result == null) result = caseRelocateParameter(multipleParametersInOne);
				if (result == null) result = caseComplex(multipleParametersInOne);
				if (result == null) result = caseChange(multipleParametersInOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.SAME_PARAMETER: {
				SameParameter sameParameter = (SameParameter)theEObject;
				T result = caseSameParameter(sameParameter);
				if (result == null) result = caseRelocateParameter(sameParameter);
				if (result == null) result = caseComplex(sameParameter);
				if (result == null) result = caseChange(sameParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.SIMPLE: {
				Simple simple = (Simple)theEObject;
				T result = caseSimple(simple);
				if (result == null) result = caseChange(simple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseSimple(add);
				if (result == null) result = caseChange(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.ADD_PARAMETER: {
				AddParameter addParameter = (AddParameter)theEObject;
				T result = caseAddParameter(addParameter);
				if (result == null) result = caseAdd(addParameter);
				if (result == null) result = caseSimple(addParameter);
				if (result == null) result = caseChange(addParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseSimple(delete);
				if (result == null) result = caseChange(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.UNSUPPORT_REQUEST_METHOD: {
				UnsupportRequestMethod unsupportRequestMethod = (UnsupportRequestMethod)theEObject;
				T result = caseUnsupportRequestMethod(unsupportRequestMethod);
				if (result == null) result = caseDelete(unsupportRequestMethod);
				if (result == null) result = caseSimple(unsupportRequestMethod);
				if (result == null) result = caseChange(unsupportRequestMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.DELETE_PATH: {
				DeletePath deletePath = (DeletePath)theEObject;
				T result = caseDeletePath(deletePath);
				if (result == null) result = caseDelete(deletePath);
				if (result == null) result = caseSimple(deletePath);
				if (result == null) result = caseChange(deletePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.REMOVE_PARAMETER: {
				RemoveParameter removeParameter = (RemoveParameter)theEObject;
				T result = caseRemoveParameter(removeParameter);
				if (result == null) result = caseDelete(removeParameter);
				if (result == null) result = caseSimple(removeParameter);
				if (result == null) result = caseChange(removeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.DEFAULT_CLAUSE: {
				DefaultClause defaultClause = (DefaultClause)theEObject;
				T result = caseDefaultClause(defaultClause);
				if (result == null) result = caseDelete(defaultClause);
				if (result == null) result = caseSimple(defaultClause);
				if (result == null) result = caseChange(defaultClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.MODIFY: {
				Modify modify = (Modify)theEObject;
				T result = caseModify(modify);
				if (result == null) result = caseSimple(modify);
				if (result == null) result = caseChange(modify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.MODIFY_PARAMETER_SCHEMA_TYPE: {
				ModifyParameterSchemaType modifyParameterSchemaType = (ModifyParameterSchemaType)theEObject;
				T result = caseModifyParameterSchemaType(modifyParameterSchemaType);
				if (result == null) result = caseModify(modifyParameterSchemaType);
				if (result == null) result = caseSimple(modifyParameterSchemaType);
				if (result == null) result = caseChange(modifyParameterSchemaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.UPPER_BONDARY: {
				UpperBondary upperBondary = (UpperBondary)theEObject;
				T result = caseUpperBondary(upperBondary);
				if (result == null) result = caseModify(upperBondary);
				if (result == null) result = caseSimple(upperBondary);
				if (result == null) result = caseChange(upperBondary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.LOWER_BONDARY: {
				LowerBondary lowerBondary = (LowerBondary)theEObject;
				T result = caseLowerBondary(lowerBondary);
				if (result == null) result = caseModify(lowerBondary);
				if (result == null) result = caseSimple(lowerBondary);
				if (result == null) result = caseChange(lowerBondary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.DEFAULT_VALUE: {
				DefaultValue defaultValue = (DefaultValue)theEObject;
				T result = caseDefaultValue(defaultValue);
				if (result == null) result = caseModify(defaultValue);
				if (result == null) result = caseSimple(defaultValue);
				if (result == null) result = caseChange(defaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.RENAME_PARAMETER: {
				RenameParameter renameParameter = (RenameParameter)theEObject;
				T result = caseRenameParameter(renameParameter);
				if (result == null) result = caseModify(renameParameter);
				if (result == null) result = caseSimple(renameParameter);
				if (result == null) result = caseChange(renameParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.CONSUME_TYPE: {
				ConsumeType consumeType = (ConsumeType)theEObject;
				T result = caseConsumeType(consumeType);
				if (result == null) result = caseModify(consumeType);
				if (result == null) result = caseSimple(consumeType);
				if (result == null) result = caseChange(consumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.PRODUCE_TYPE: {
				ProduceType produceType = (ProduceType)theEObject;
				T result = caseProduceType(produceType);
				if (result == null) result = caseModify(produceType);
				if (result == null) result = caseSimple(produceType);
				if (result == null) result = caseChange(produceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.ADD_STATUS_CODE: {
				AddStatusCode addStatusCode = (AddStatusCode)theEObject;
				T result = caseAddStatusCode(addStatusCode);
				if (result == null) result = caseModify(addStatusCode);
				if (result == null) result = caseSimple(addStatusCode);
				if (result == null) result = caseChange(addStatusCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.REMOVE_STATUS_CODE: {
				RemoveStatusCode removeStatusCode = (RemoveStatusCode)theEObject;
				T result = caseRemoveStatusCode(removeStatusCode);
				if (result == null) result = caseModify(removeStatusCode);
				if (result == null) result = caseSimple(removeStatusCode);
				if (result == null) result = caseChange(removeStatusCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.EXPOSE_DATA: {
				ExposeData exposeData = (ExposeData)theEObject;
				T result = caseExposeData(exposeData);
				if (result == null) result = caseComplex(exposeData);
				if (result == null) result = caseChange(exposeData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.ELEMENT_REFERENCE: {
				ElementReference elementReference = (ElementReference)theEObject;
				T result = caseElementReference(elementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.COMPLEX: {
				Complex complex = (Complex)theEObject;
				T result = caseComplex(complex);
				if (result == null) result = caseChange(complex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.REMOVE_RESTRICTION: {
				RemoveRestriction removeRestriction = (RemoveRestriction)theEObject;
				T result = caseRemoveRestriction(removeRestriction);
				if (result == null) result = caseComplex(removeRestriction);
				if (result == null) result = caseChange(removeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.CHANGE_FORMAT_RETURN_VALUE: {
				ChangeFormatReturnValue changeFormatReturnValue = (ChangeFormatReturnValue)theEObject;
				T result = caseChangeFormatReturnValue(changeFormatReturnValue);
				if (result == null) result = caseModify(changeFormatReturnValue);
				if (result == null) result = caseSimple(changeFormatReturnValue);
				if (result == null) result = caseChange(changeFormatReturnValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.RENAME_METHOD: {
				RenameMethod renameMethod = (RenameMethod)theEObject;
				T result = caseRenameMethod(renameMethod);
				if (result == null) result = caseComplex(renameMethod);
				if (result == null) result = caseChange(renameMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.COMBINE_METHODS: {
				CombineMethods combineMethods = (CombineMethods)theEObject;
				T result = caseCombineMethods(combineMethods);
				if (result == null) result = caseComplex(combineMethods);
				if (result == null) result = caseChange(combineMethods);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.SPLIT_METHOD: {
				SplitMethod splitMethod = (SplitMethod)theEObject;
				T result = caseSplitMethod(splitMethod);
				if (result == null) result = caseComplex(splitMethod);
				if (result == null) result = caseChange(splitMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.ADD_RESTRICTION: {
				AddRestriction addRestriction = (AddRestriction)theEObject;
				T result = caseAddRestriction(addRestriction);
				if (result == null) result = caseComplex(addRestriction);
				if (result == null) result = caseChange(addRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = caseModify(parameterType);
				if (result == null) result = caseSimple(parameterType);
				if (result == null) result = caseChange(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiffPackage.RETURN_TYPE: {
				ReturnType returnType = (ReturnType)theEObject;
				T result = caseReturnType(returnType);
				if (result == null) result = caseModify(returnType);
				if (result == null) result = caseSimple(returnType);
				if (result == null) result = caseChange(returnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiff(Diff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refactoring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refactoring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefactoringType(RefactoringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChange(Change object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relocate Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relocate Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelocateParameter(RelocateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Parameters In One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Parameters In One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleParametersInOne(MultipleParametersInOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameParameter(SameParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple(Simple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddParameter(AddParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsupport Request Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsupport Request Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsupportRequestMethod(UnsupportRequestMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletePath(DeletePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveParameter(RemoveParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultClause(DefaultClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModify(Modify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Parameter Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Parameter Schema Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyParameterSchemaType(ModifyParameterSchemaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Bondary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Bondary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperBondary(UpperBondary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Bondary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Bondary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerBondary(LowerBondary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultValue(DefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameParameter(RenameParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumeType(ConsumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Produce Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produce Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduceType(ProduceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Status Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStatusCode(AddStatusCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Status Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveStatusCode(RemoveStatusCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expose Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expose Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExposeData(ExposeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementReference(ElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplex(Complex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveRestriction(RemoveRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Format Return Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Format Return Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeFormatReturnValue(ChangeFormatReturnValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameMethod(RenameMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combine Methods</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combine Methods</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombineMethods(CombineMethods object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitMethod(SplitMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddRestriction(AddRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiffSwitch
