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
 *   <li>{@link ReturnType.ReturnsType#getNew <em>New</em>}</li>
 *   <li>{@link ReturnType.ReturnsType#getOld <em>Old</em>}</li>
 * </ul>
 *
 * @see differences.DifferencesPackage#getSimple()
 * @model
 * @generated
 */
public interface ReturnType extends Modify {
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
	ElementDefinition getNewDefinition();

	/**
	 * Sets the value of the '{@link ReturnType.ReturnsType#getNew <em>New</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' containment reference.
	 * @see #getNew()
	 * @generated
	 */
	void setNewDefinition(ElementDefinition value);

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
	ElementDefinition getOldDefinition();

	/**
	 * Sets the value of the '{@link ReturnType.ReturnsType#getOld <em>Old</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old</em>' containment reference.
	 * @see #getOld()
	 * @generated
	 */
	void setOldDefinition(ElementDefinition value);

} // Simple
