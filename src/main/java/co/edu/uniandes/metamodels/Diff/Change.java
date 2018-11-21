/**
 */
package co.edu.uniandes.metamodels.Diff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.Change#getChangeElement <em>Change Element</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getChange()
 * @model
 * @generated
 */
public interface Change extends EObject {
	/**
	 * Returns the value of the '<em><b>Change Element</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.metamodels.Diff.APIElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Element</em>' attribute.
	 * @see co.edu.uniandes.metamodels.Diff.APIElementType
	 * @see #setChangeElement(APIElementType)
	 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getChange_ChangeElement()
	 * @model
	 * @generated
	 */
	APIElementType getChangeElement();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Diff.Change#getChangeElement <em>Change Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Element</em>' attribute.
	 * @see co.edu.uniandes.metamodels.Diff.APIElementType
	 * @see #getChangeElement()
	 * @generated
	 */
	void setChangeElement(APIElementType value);

} // Change
