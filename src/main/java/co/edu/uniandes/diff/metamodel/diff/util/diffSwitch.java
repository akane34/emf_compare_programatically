/**
 */
package co.edu.uniandes.diff.metamodel.diff.util;

import co.edu.uniandes.diff.metamodel.diff.*;

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
 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage
 * @generated
 */
public class diffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static diffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public diffSwitch() {
		if (modelPackage == null) {
			modelPackage = diffPackage.eINSTANCE;
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
			case diffPackage.DIFF: {
				Diff diff = (Diff)theEObject;
				T result = caseDiff(diff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.REFACTORING_TYPE: {
				RefactoringType refactoringType = (RefactoringType)theEObject;
				T result = caseRefactoringType(refactoringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.CHANGE: {
				Change change = (Change)theEObject;
				T result = caseChange(change);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.MOVE_DOWN_IN_HIERARCHY: {
				MoveDownInHierarchy moveDownInHierarchy = (MoveDownInHierarchy)theEObject;
				T result = caseMoveDownInHierarchy(moveDownInHierarchy);
				if (result == null) result = caseComplex(moveDownInHierarchy);
				if (result == null) result = caseChange(moveDownInHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.RELOCATE_PARAMETER: {
				RelocateParameter relocateParameter = (RelocateParameter)theEObject;
				T result = caseRelocateParameter(relocateParameter);
				if (result == null) result = caseComplex(relocateParameter);
				if (result == null) result = caseChange(relocateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.REORDER_TYPE_PARAMETERS: {
				ReorderTypeParameters reorderTypeParameters = (ReorderTypeParameters)theEObject;
				T result = caseReorderTypeParameters(reorderTypeParameters);
				if (result == null) result = caseComplex(reorderTypeParameters);
				if (result == null) result = caseChange(reorderTypeParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.CONTRACT_SUPER_SET: {
				ContractSuperSet contractSuperSet = (ContractSuperSet)theEObject;
				T result = caseContractSuperSet(contractSuperSet);
				if (result == null) result = caseComplex(contractSuperSet);
				if (result == null) result = caseChange(contractSuperSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.MOVE_UP_IN_HIERARCHY: {
				MoveUpInHierarchy moveUpInHierarchy = (MoveUpInHierarchy)theEObject;
				T result = caseMoveUpInHierarchy(moveUpInHierarchy);
				if (result == null) result = caseComplex(moveUpInHierarchy);
				if (result == null) result = caseChange(moveUpInHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.SIMPLE: {
				Simple simple = (Simple)theEObject;
				T result = caseSimple(simple);
				if (result == null) result = caseChange(simple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseSimple(add);
				if (result == null) result = caseChange(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseSimple(delete);
				if (result == null) result = caseChange(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.DEFAULT_CLAUSE: {
				DefaultClause defaultClause = (DefaultClause)theEObject;
				T result = caseDefaultClause(defaultClause);
				if (result == null) result = caseDelete(defaultClause);
				if (result == null) result = caseSimple(defaultClause);
				if (result == null) result = caseChange(defaultClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.MODIFY: {
				Modify modify = (Modify)theEObject;
				T result = caseModify(modify);
				if (result == null) result = caseSimple(modify);
				if (result == null) result = caseChange(modify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.UPPER_BONDARY: {
				UpperBondary upperBondary = (UpperBondary)theEObject;
				T result = caseUpperBondary(upperBondary);
				if (result == null) result = caseModify(upperBondary);
				if (result == null) result = caseSimple(upperBondary);
				if (result == null) result = caseChange(upperBondary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.LOWER_BONDARY: {
				LowerBondary lowerBondary = (LowerBondary)theEObject;
				T result = caseLowerBondary(lowerBondary);
				if (result == null) result = caseModify(lowerBondary);
				if (result == null) result = caseSimple(lowerBondary);
				if (result == null) result = caseChange(lowerBondary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.DEFAULT_VALUE: {
				DefaultValue defaultValue = (DefaultValue)theEObject;
				T result = caseDefaultValue(defaultValue);
				if (result == null) result = caseModify(defaultValue);
				if (result == null) result = caseSimple(defaultValue);
				if (result == null) result = caseChange(defaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.RENAME: {
				Rename rename = (Rename)theEObject;
				T result = caseRename(rename);
				if (result == null) result = caseModify(rename);
				if (result == null) result = caseSimple(rename);
				if (result == null) result = caseChange(rename);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.ACCESS_MODIFIER: {
				AccessModifier accessModifier = (AccessModifier)theEObject;
				T result = caseAccessModifier(accessModifier);
				if (result == null) result = caseModify(accessModifier);
				if (result == null) result = caseSimple(accessModifier);
				if (result == null) result = caseChange(accessModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.TYPE_BOUND: {
				TypeBound typeBound = (TypeBound)theEObject;
				T result = caseTypeBound(typeBound);
				if (result == null) result = caseModify(typeBound);
				if (result == null) result = caseSimple(typeBound);
				if (result == null) result = caseChange(typeBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
				if (result == null) result = caseModify(resultType);
				if (result == null) result = caseSimple(resultType);
				if (result == null) result = caseChange(resultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.CONSUME_TYPE: {
				ConsumeType consumeType = (ConsumeType)theEObject;
				T result = caseConsumeType(consumeType);
				if (result == null) result = caseModify(consumeType);
				if (result == null) result = caseSimple(consumeType);
				if (result == null) result = caseChange(consumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.FIELD_VALUE: {
				FieldValue fieldValue = (FieldValue)theEObject;
				T result = caseFieldValue(fieldValue);
				if (result == null) result = caseModify(fieldValue);
				if (result == null) result = caseSimple(fieldValue);
				if (result == null) result = caseChange(fieldValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.TYPE_API: {
				TypeAPI typeAPI = (TypeAPI)theEObject;
				T result = caseTypeAPI(typeAPI);
				if (result == null) result = caseModify(typeAPI);
				if (result == null) result = caseSimple(typeAPI);
				if (result == null) result = caseChange(typeAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.OTHER_MODIFIER: {
				OtherModifier otherModifier = (OtherModifier)theEObject;
				T result = caseOtherModifier(otherModifier);
				if (result == null) result = caseModify(otherModifier);
				if (result == null) result = caseSimple(otherModifier);
				if (result == null) result = caseChange(otherModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.ELEMENT_REFERENCE: {
				ElementReference elementReference = (ElementReference)theEObject;
				T result = caseElementReference(elementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.COMPLEX: {
				Complex complex = (Complex)theEObject;
				T result = caseComplex(complex);
				if (result == null) result = caseChange(complex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = caseModify(parameterType);
				if (result == null) result = caseSimple(parameterType);
				if (result == null) result = caseChange(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.ELEMENT_DEFINITION: {
				ElementDefinition elementDefinition = (ElementDefinition)theEObject;
				T result = caseElementDefinition(elementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case diffPackage.RETURN_TYPE: {
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
	 * Returns the result of interpreting the object as an instance of '<em>Move Down In Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Down In Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveDownInHierarchy(MoveDownInHierarchy object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reorder Type Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reorder Type Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReorderTypeParameters(ReorderTypeParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Super Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Super Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractSuperSet(ContractSuperSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Up In Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Up In Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveUpInHierarchy(MoveUpInHierarchy object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Rename</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRename(Rename object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessModifier(AccessModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBound(TypeBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultType(ResultType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldValue(FieldValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAPI(TypeAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherModifier(OtherModifier object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinition(ElementDefinition object) {
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

} //diffSwitch
