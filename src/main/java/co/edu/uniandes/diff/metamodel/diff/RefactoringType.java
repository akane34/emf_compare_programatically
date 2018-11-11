/**
 */
package co.edu.uniandes.diff.metamodel.diff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactoring Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.diff.metamodel.diff.RefactoringType#getChanges <em>Changes</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getRefactoringType()
 * @model
 * @generated
 */
public interface RefactoringType extends EObject {
	/**
	 * Returns the value of the '<em><b>Changes</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.diff.metamodel.diff.Change}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' reference list.
	 * @see co.edu.uniandes.diff.metamodel.diff.diffPackage#getRefactoringType_Changes()
	 * @model
	 * @generated
	 */
	EList<Change> getChanges();

} // RefactoringType