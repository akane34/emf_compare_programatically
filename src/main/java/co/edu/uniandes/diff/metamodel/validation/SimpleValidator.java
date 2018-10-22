/**
 *
 * $Id$
 */
package co.edu.uniandes.diff.metamodel.validation;

import co.edu.uniandes.diff.metamodel.ElementReference;

/**
 * A sample validator interface for {@link co.edu.uniandes.diff.metamodel.Simple}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SimpleValidator {
	boolean validate();

	boolean validateNew(ElementReference value);
	boolean validateOld(ElementReference value);
}
