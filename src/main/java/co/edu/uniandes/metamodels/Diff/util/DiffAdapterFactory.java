/**
 */
package co.edu.uniandes.metamodels.Diff.util;

import co.edu.uniandes.metamodels.Diff.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage
 * @generated
 */
public class DiffAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiffPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiffPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffSwitch<Adapter> modelSwitch =
		new DiffSwitch<Adapter>() {
			@Override
			public Adapter caseDiff(Diff object) {
				return createDiffAdapter();
			}
			@Override
			public Adapter caseRefactoringType(RefactoringType object) {
				return createRefactoringTypeAdapter();
			}
			@Override
			public Adapter caseChange(Change object) {
				return createChangeAdapter();
			}
			@Override
			public Adapter caseRelocateParameter(RelocateParameter object) {
				return createRelocateParameterAdapter();
			}
			@Override
			public Adapter caseMultipleParametersInOne(MultipleParametersInOne object) {
				return createMultipleParametersInOneAdapter();
			}
			@Override
			public Adapter caseSameParameter(SameParameter object) {
				return createSameParameterAdapter();
			}
			@Override
			public Adapter caseSimple(Simple object) {
				return createSimpleAdapter();
			}
			@Override
			public Adapter caseAdd(Add object) {
				return createAddAdapter();
			}
			@Override
			public Adapter caseAddParameter(AddParameter object) {
				return createAddParameterAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseUnsupportRequestMethod(UnsupportRequestMethod object) {
				return createUnsupportRequestMethodAdapter();
			}
			@Override
			public Adapter caseDeletePath(DeletePath object) {
				return createDeletePathAdapter();
			}
			@Override
			public Adapter caseRemoveParameter(RemoveParameter object) {
				return createRemoveParameterAdapter();
			}
			@Override
			public Adapter caseDefaultClause(DefaultClause object) {
				return createDefaultClauseAdapter();
			}
			@Override
			public Adapter caseModify(Modify object) {
				return createModifyAdapter();
			}
			@Override
			public Adapter caseModifyParameterSchemaType(ModifyParameterSchemaType object) {
				return createModifyParameterSchemaTypeAdapter();
			}
			@Override
			public Adapter caseUpperBondary(UpperBondary object) {
				return createUpperBondaryAdapter();
			}
			@Override
			public Adapter caseLowerBondary(LowerBondary object) {
				return createLowerBondaryAdapter();
			}
			@Override
			public Adapter caseDefaultValue(DefaultValue object) {
				return createDefaultValueAdapter();
			}
			@Override
			public Adapter caseRenameParameter(RenameParameter object) {
				return createRenameParameterAdapter();
			}
			@Override
			public Adapter caseConsumeType(ConsumeType object) {
				return createConsumeTypeAdapter();
			}
			@Override
			public Adapter caseProduceType(ProduceType object) {
				return createProduceTypeAdapter();
			}
			@Override
			public Adapter caseAddStatusCode(AddStatusCode object) {
				return createAddStatusCodeAdapter();
			}
			@Override
			public Adapter caseRemoveStatusCode(RemoveStatusCode object) {
				return createRemoveStatusCodeAdapter();
			}
			@Override
			public Adapter caseExposeData(ExposeData object) {
				return createExposeDataAdapter();
			}
			@Override
			public Adapter caseElementReference(ElementReference object) {
				return createElementReferenceAdapter();
			}
			@Override
			public Adapter caseComplex(Complex object) {
				return createComplexAdapter();
			}
			@Override
			public Adapter caseRemoveRestriction(RemoveRestriction object) {
				return createRemoveRestrictionAdapter();
			}
			@Override
			public Adapter caseChangeFormatReturnValue(ChangeFormatReturnValue object) {
				return createChangeFormatReturnValueAdapter();
			}
			@Override
			public Adapter caseRenameMethod(RenameMethod object) {
				return createRenameMethodAdapter();
			}
			@Override
			public Adapter caseCombineMethods(CombineMethods object) {
				return createCombineMethodsAdapter();
			}
			@Override
			public Adapter caseSplitMethod(SplitMethod object) {
				return createSplitMethodAdapter();
			}
			@Override
			public Adapter caseAddRestriction(AddRestriction object) {
				return createAddRestrictionAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseReturnType(ReturnType object) {
				return createReturnTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.Diff
	 * @generated
	 */
	public Adapter createDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.RefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.RefactoringType
	 * @generated
	 */
	public Adapter createRefactoringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.Change
	 * @generated
	 */
	public Adapter createChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.RelocateParameter <em>Relocate Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.RelocateParameter
	 * @generated
	 */
	public Adapter createRelocateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.MultipleParametersInOne <em>Multiple Parameters In One</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.MultipleParametersInOne
	 * @generated
	 */
	public Adapter createMultipleParametersInOneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.SameParameter <em>Same Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.SameParameter
	 * @generated
	 */
	public Adapter createSameParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.Simple
	 * @generated
	 */
	public Adapter createSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.AddParameter <em>Add Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.AddParameter
	 * @generated
	 */
	public Adapter createAddParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.UnsupportRequestMethod <em>Unsupport Request Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.UnsupportRequestMethod
	 * @generated
	 */
	public Adapter createUnsupportRequestMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.DeletePath <em>Delete Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.DeletePath
	 * @generated
	 */
	public Adapter createDeletePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.RemoveParameter <em>Remove Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.RemoveParameter
	 * @generated
	 */
	public Adapter createRemoveParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.DefaultClause <em>Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.DefaultClause
	 * @generated
	 */
	public Adapter createDefaultClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.Modify
	 * @generated
	 */
	public Adapter createModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ModifyParameterSchemaType <em>Modify Parameter Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ModifyParameterSchemaType
	 * @generated
	 */
	public Adapter createModifyParameterSchemaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.UpperBondary <em>Upper Bondary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.UpperBondary
	 * @generated
	 */
	public Adapter createUpperBondaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.LowerBondary <em>Lower Bondary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.LowerBondary
	 * @generated
	 */
	public Adapter createLowerBondaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.DefaultValue
	 * @generated
	 */
	public Adapter createDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.RenameParameter <em>Rename Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.RenameParameter
	 * @generated
	 */
	public Adapter createRenameParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ConsumeType <em>Consume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ConsumeType
	 * @generated
	 */
	public Adapter createConsumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ProduceType <em>Produce Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ProduceType
	 * @generated
	 */
	public Adapter createProduceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.AddStatusCode <em>Add Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.AddStatusCode
	 * @generated
	 */
	public Adapter createAddStatusCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.RemoveStatusCode <em>Remove Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.RemoveStatusCode
	 * @generated
	 */
	public Adapter createRemoveStatusCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ExposeData <em>Expose Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ExposeData
	 * @generated
	 */
	public Adapter createExposeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ElementReference
	 * @generated
	 */
	public Adapter createElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.Complex
	 * @generated
	 */
	public Adapter createComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.RemoveRestriction <em>Remove Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.RemoveRestriction
	 * @generated
	 */
	public Adapter createRemoveRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ChangeFormatReturnValue <em>Change Format Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ChangeFormatReturnValue
	 * @generated
	 */
	public Adapter createChangeFormatReturnValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.RenameMethod <em>Rename Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.RenameMethod
	 * @generated
	 */
	public Adapter createRenameMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.CombineMethods <em>Combine Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.CombineMethods
	 * @generated
	 */
	public Adapter createCombineMethodsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.SplitMethod <em>Split Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.SplitMethod
	 * @generated
	 */
	public Adapter createSplitMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.AddRestriction <em>Add Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.AddRestriction
	 * @generated
	 */
	public Adapter createAddRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Diff.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Diff.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiffAdapterFactory
