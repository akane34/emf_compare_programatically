/**
 */
package co.edu.uniandes.diff.metamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import co.edu.uniandes.diff.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.diff.metamodel.DiffPackage
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
			public Adapter caseMoveDownInHierarchy(MoveDownInHierarchy object) {
				return createMoveDownInHierarchyAdapter();
			}
			@Override
			public Adapter caseChangeParameterLocation(ChangeParameterLocation object) {
				return createChangeParameterLocationAdapter();
			}
			@Override
			public Adapter caseReorderTypeParameters(ReorderTypeParameters object) {
				return createReorderTypeParametersAdapter();
			}
			@Override
			public Adapter caseContractSuperSet(ContractSuperSet object) {
				return createContractSuperSetAdapter();
			}
			@Override
			public Adapter caseMoveUpInHierarchy(MoveUpInHierarchy object) {
				return createMoveUpInHierarchyAdapter();
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
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
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
			public Adapter caseRename(Rename object) {
				return createRenameAdapter();
			}
			@Override
			public Adapter caseAccessModifier(AccessModifier object) {
				return createAccessModifierAdapter();
			}
			@Override
			public Adapter caseTypeBound(TypeBound object) {
				return createTypeBoundAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseFieldValue(FieldValue object) {
				return createFieldValueAdapter();
			}
			@Override
			public Adapter caseTypeAPI(TypeAPI object) {
				return createTypeAPIAdapter();
			}
			@Override
			public Adapter caseOtherModifier(OtherModifier object) {
				return createOtherModifierAdapter();
			}
			@Override
			public Adapter caseElementReference(ElementReference object) {
				return createElementReferenceAdapter();
			}
			@Override
			public Adapter caseAPIElement(APIElement object) {
				return createAPIElementAdapter();
			}
			@Override
			public Adapter caseComplex(Complex object) {
				return createComplexAdapter();
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
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Diff
	 * @generated
	 */
	public Adapter createDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.RefactoringType <em>Refactoring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.RefactoringType
	 * @generated
	 */
	public Adapter createRefactoringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Change
	 * @generated
	 */
	public Adapter createChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.MoveDownInHierarchy <em>Move Down In Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.MoveDownInHierarchy
	 * @generated
	 */
	public Adapter createMoveDownInHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.ChangeParameterLocation <em>Change Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.ChangeParameterLocation
	 * @generated
	 */
	public Adapter createChangeParameterLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.ReorderTypeParameters <em>Reorder Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.ReorderTypeParameters
	 * @generated
	 */
	public Adapter createReorderTypeParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.ContractSuperSet <em>Contract Super Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.ContractSuperSet
	 * @generated
	 */
	public Adapter createContractSuperSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.MoveUpInHierarchy <em>Move Up In Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.MoveUpInHierarchy
	 * @generated
	 */
	public Adapter createMoveUpInHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Simple
	 * @generated
	 */
	public Adapter createSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.DefaultClause <em>Default Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.DefaultClause
	 * @generated
	 */
	public Adapter createDefaultClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Modify
	 * @generated
	 */
	public Adapter createModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Rename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Rename
	 * @generated
	 */
	public Adapter createRenameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.AccessModifier
	 * @generated
	 */
	public Adapter createAccessModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.TypeBound <em>Type Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.TypeBound
	 * @generated
	 */
	public Adapter createTypeBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.FieldValue
	 * @generated
	 */
	public Adapter createFieldValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.TypeAPI <em>Type API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.TypeAPI
	 * @generated
	 */
	public Adapter createTypeAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.OtherModifier <em>Other Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.OtherModifier
	 * @generated
	 */
	public Adapter createOtherModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.ElementReference
	 * @generated
	 */
	public Adapter createElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.APIElement <em>API Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.APIElement
	 * @generated
	 */
	public Adapter createAPIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.diff.metamodel.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.diff.metamodel.Complex
	 * @generated
	 */
	public Adapter createComplexAdapter() {
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
