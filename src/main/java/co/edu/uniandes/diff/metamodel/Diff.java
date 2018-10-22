/**
 */
package co.edu.uniandes.diff.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.Diff#getNewVersion <em>New Version</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.Diff#getOldVersion <em>Old Version</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.Diff#getRefactoringType <em>Refactoring Type</em>}</li>
 *   <li>{@link co.edu.uniandes.diff.metamodel.Diff#getChange <em>Change</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getDiff()
 * @model
 * @generated
 */
public interface Diff extends EObject {
	/**
	 * Returns the value of the '<em><b>New Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Version</em>' attribute.
	 * @see #setNewVersion(String)
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getDiff_NewVersion()
	 * @model
	 * @generated
	 */
	String getNewVersion();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.Diff#getNewVersion <em>New Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Version</em>' attribute.
	 * @see #getNewVersion()
	 * @generated
	 */
	void setNewVersion(String value);

	/**
	 * Returns the value of the '<em><b>Old Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Version</em>' attribute.
	 * @see #setOldVersion(String)
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getDiff_OldVersion()
	 * @model
	 * @generated
	 */
	String getOldVersion();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.diff.metamodel.Diff#getOldVersion <em>Old Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Version</em>' attribute.
	 * @see #getOldVersion()
	 * @generated
	 */
	void setOldVersion(String value);

	/**
	 * Returns the value of the '<em><b>Refactoring Type</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.diff.metamodel.RefactoringType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refactoring Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactoring Type</em>' containment reference list.
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getDiff_RefactoringType()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefactoringType> getRefactoringType();

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.diff.metamodel.Change}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference list.
	 * @see co.edu.uniandes.diff.metamodel.DiffPackage#getDiff_Change()
	 * @model containment="true"
	 * @generated
	 */
	EList<Change> getChange();

} // Diff
