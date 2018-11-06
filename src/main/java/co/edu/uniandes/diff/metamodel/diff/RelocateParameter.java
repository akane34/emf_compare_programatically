/**
 */
package co.edu.uniandes.diff.metamodel.diff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relocate Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getNewLocation <em>New Location</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getOldLocation <em>Old Location</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getRelocateParameter()
 * @model
 * @generated
 */
public interface RelocateParameter extends Complex {
	/**
	 * Returns the value of the '<em><b>New Location</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.diff.metamodel.diff.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Location</em>' attribute.
	 * @see co.edu.uniandes.diff.metamodel.diff.ParameterLocation
	 * @see #setNewLocation(ParameterLocation)
	 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getRelocateParameter_NewLocation()
	 * @model
	 * @generated
	 */
	ParameterLocation getNewLocation();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getNewLocation <em>New Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Location</em>' attribute.
	 * @see co.edu.uniandes.diff.metamodel.diff.ParameterLocation
	 * @see #getNewLocation()
	 * @generated
	 */
	void setNewLocation(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Old Location</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.diff.metamodel.diff.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Location</em>' attribute.
	 * @see co.edu.uniandes.diff.metamodel.diff.ParameterLocation
	 * @see #setOldLocation(ParameterLocation)
	 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getRelocateParameter_OldLocation()
	 * @model
	 * @generated
	 */
	ParameterLocation getOldLocation();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter#getOldLocation <em>Old Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Location</em>' attribute.
	 * @see co.edu.uniandes.diff.metamodel.diff.ParameterLocation
	 * @see #getOldLocation()
	 * @generated
	 */
	void setOldLocation(ParameterLocation value);

} // RelocateParameter
