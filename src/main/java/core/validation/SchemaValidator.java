/**
 *
 * $Id$
 */
package core.validation;

import core.Schema;
import core.SchemaDeclaringContext;
import core.XMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link core.Schema}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SchemaValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateTitle(String value);
	boolean validateMaxProperties(Integer value);
	boolean validateMinProperties(Integer value);
	boolean validateExample(String value);
	boolean validateDiscriminator(String value);
	boolean validateReadOnly(Boolean value);
	boolean validateProperties(EList<Schema> value);
	boolean validateAllOf(EList<Schema> value);
	boolean validateItems(Schema value);
	boolean validateXml(XMLElement value);
	boolean validateAdditonalProperties(Schema value);
	boolean validateDeclaringContext(SchemaDeclaringContext value);
	boolean validateRequired(EList<Schema> value);
	boolean validateValue(Schema value);
	boolean validateAdditonalPropertiesAllowed(boolean value);
}
