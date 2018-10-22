/**
 */
package co.edu.uniandes.diff.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.APIElement#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getAPIElement()
 * @model
 * @generated
 */
public interface APIElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.diff.metamodel.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see co.edu.uniandes.diff.metamodel.ParameterLocation
	 * @see #setLocation(ParameterLocation)
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getAPIElement_Location()
	 * @model
	 * @generated
	 */
	ParameterLocation getLocation();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.APIElement#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see co.edu.uniandes.diff.metamodel.ParameterLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ParameterLocation value);

} // APIElement
