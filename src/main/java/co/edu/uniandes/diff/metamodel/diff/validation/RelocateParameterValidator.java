/**
 *
 * $Id$
 */
package co.edu.uniandes.diff.metamodel.diff.validation;

import co.edu.uniandes.diff.metamodel.diff.ParameterLocation;

/**
 * A sample validator interface for {@link co.edu.uniandes.diff.metamodel.diff.RelocateParameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelocateParameterValidator {
	boolean validate();

	boolean validateNewLocation(ParameterLocation value);
	boolean validateOldLocation(ParameterLocation value);
}
