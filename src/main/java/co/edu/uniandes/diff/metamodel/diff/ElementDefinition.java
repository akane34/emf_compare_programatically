/**
 */
package co.edu.uniandes.diff.metamodel.diff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link differences.ElementsDefinition#getNew <em>New</em>}</li>
 *   <li>{@link differences.ElementsDefinition#getOld <em>Old</em>}</li>
 * </ul>
 *
 * @see differences.DifferencesPackage#getSimple()
 * @model
 * @generated
 */
public interface ElementDefinition {
	/**
	 * Returns the value of the '<em><b>New</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New</em>' containment reference.
	 * @see #setNew(ElementReference)
	 * @see differences.DifferencesPackage#getSimple_New()
	 * @model containment="true"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link differences.ElementsDefinition#getNew <em>New</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' containment reference.
	 * @see #getNew()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old</em>' containment reference.
	 * @see #setOld(ElementReference)
	 * @see differences.DifferencesPackage#getSimple_Old()
	 * @model containment="true"
	 * @generated
	 */
	ElementType getType();

	/**
	 * Sets the value of the '{@link differences.ElementsDefinition#getOld <em>Old</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old</em>' containment reference.
	 * @see #getOld()
	 * @generated
	 */
	void setType(ElementType value);

} // Simple
