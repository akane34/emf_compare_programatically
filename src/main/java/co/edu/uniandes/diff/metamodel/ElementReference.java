/**
 */
package co.edu.uniandes.diff.metamodel;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.ElementReference#getApiElementName <em>Api Element Name</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.ElementReference#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.ElementReference#getApiElement <em>Api Element</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getElementReference()
 * @model
 * @generated
 */
public interface ElementReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Element Name</em>' attribute.
	 * @see #setApiElementName(String)
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getElementReference_ApiElementName()
	 * @model
	 * @generated
	 */
	String getApiElementName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.ElementReference#getApiElementName <em>Api Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Element Name</em>' attribute.
	 * @see #getApiElementName()
	 * @generated
	 */
	void setApiElementName(String value);

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(BigInteger)
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getElementReference_LineNumber()
	 * @model
	 * @generated
	 */
	BigInteger getLineNumber();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.ElementReference#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Api Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Element</em>' reference.
	 * @see #setApiElement(APIElement)
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getElementReference_ApiElement()
	 * @model required="true"
	 * @generated
	 */
	APIElement getApiElement();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.ElementReference#getApiElement <em>Api Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Element</em>' reference.
	 * @see #getApiElement()
	 * @generated
	 */
	void setApiElement(APIElement value);

} // ElementReference
