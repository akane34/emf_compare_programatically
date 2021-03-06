/**
 *
 * $Id$
 */
package co.edu.uniandes.metamodels.Diff.validation;

import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.metamodels.Diff.RefactoringType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link co.edu.uniandes.metamodels.Diff.Diff}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DiffValidator {
	boolean validate();

	boolean validateNewVersion(String value);
	boolean validateOldVersion(String value);
	boolean validateRefactoringType(EList<RefactoringType> value);
	boolean validateChange(EList<Change> value);
}
