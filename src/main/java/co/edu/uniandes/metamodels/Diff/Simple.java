/**
 */
package co.edu.uniandes.metamodels.Diff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.Simple#getNew <em>New</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Diff.Simple#getOld <em>Old</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getSimple()
 * @model
 * @generated
 */
public interface Simple extends Change {
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
	 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getSimple_New()
	 * @model containment="true"
	 * @generated
	 */
	ElementReference getNew();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Diff.Simple#getNew <em>New</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' containment reference.
	 * @see #getNew()
	 * @generated
	 */
	void setNew(ElementReference value);

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
	 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getSimple_Old()
	 * @model containment="true"
	 * @generated
	 */
	ElementReference getOld();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Diff.Simple#getOld <em>Old</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old</em>' containment reference.
	 * @see #getOld()
	 * @generated
	 */
	void setOld(ElementReference value);

} // Simple
