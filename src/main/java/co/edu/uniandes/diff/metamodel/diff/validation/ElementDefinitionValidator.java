/**
 *
 * $Id$
 */
package co.edu.uniandes.diff.metamodel.diff.validation;

import co.edu.uniandes.diff.metamodel.diff.ElementType;

/**
 * A sample validator interface for {@link ElementDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementDefinitionValidator {
	boolean validate();

	boolean validateSchemaName(String value);
	boolean validateType(ElementType value);
}