/**
 */
package co.edu.uniandes.metamodels.Diff;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>API Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.metamodels.Diff.DiffPackage#getAPIElementType()
 * @model
 * @generated
 */
public enum APIElementType implements Enumerator {
	/**
	 * The '<em><b>Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE(0, "Package", "Package"),

	/**
	 * The '<em><b>Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(1, "Class", "Class"),

	/**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(2, "Interface", "Interface"),

	/**
	 * The '<em><b>Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(3, "Method", "Method"),

	/**
	 * The '<em><b>Constructor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRUCTOR(4, "Constructor", "Constructor"),

	/**
	 * The '<em><b>Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD(5, "Field", "Field"),

	/**
	 * The '<em><b>Enumeration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMERATION(6, "Enumeration", "Enumeration"),

	/**
	 * The '<em><b>Element Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT_ANNOTATION(7, "ElementAnnotation", "ElementAnnotation"),

	/**
	 * The '<em><b>Enum Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERAL(8, "EnumLiteral", "EnumLiteral"),

	/**
	 * The '<em><b>Method Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_PARAMETER(9, "MethodParameter", "MethodParameter"),

	/**
	 * The '<em><b>Type Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_FIELD(10, "TypeField", "TypeField"),

	/**
	 * The '<em><b>Exception Throw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_THROW_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTION_THROW(11, "ExceptionThrow", "ExceptionThrow"),

	/**
	 * The '<em><b>Type Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_PARAMETER(12, "TypeParameter", "TypeParameter"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(13, "Location", "Location"),

	/**
	 * The '<em><b>Return Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN_TYPE(14, "ReturnType", "ReturnType"),

	/**
	 * The '<em><b>Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_VALUE
	 * @generated
	 * @ordered
	 */
	PATH(15, "Path", "Path"),

	/**
	 * The '<em><b>Content Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT_TYPE(16, "ContentType", "ContentType"),

	/**
	 * The '<em><b>Status Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_CODE(17, "StatusCode", "StatusCode");

	/**
	 * The '<em><b>Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Package</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @model name="Package"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_VALUE = 0;

	/**
	 * The '<em><b>Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @model name="Class"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 1;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model name="Interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 2;

	/**
	 * The '<em><b>Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @model name="Method"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 3;

	/**
	 * The '<em><b>Constructor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constructor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTOR
	 * @model name="Constructor"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR_VALUE = 4;

	/**
	 * The '<em><b>Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Field</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELD
	 * @model name="Field"
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_VALUE = 5;

	/**
	 * The '<em><b>Enumeration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enumeration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION
	 * @model name="Enumeration"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATION_VALUE = 6;

	/**
	 * The '<em><b>Element Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Element Annotation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_ANNOTATION
	 * @model name="ElementAnnotation"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_ANNOTATION_VALUE = 7;

	/**
	 * The '<em><b>Enum Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_LITERAL
	 * @model name="EnumLiteral"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERAL_VALUE = 8;

	/**
	 * The '<em><b>Method Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_PARAMETER
	 * @model name="MethodParameter"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_PARAMETER_VALUE = 9;

	/**
	 * The '<em><b>Type Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Type Field</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_FIELD
	 * @model name="TypeField"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_FIELD_VALUE = 10;

	/**
	 * The '<em><b>Exception Throw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exception Throw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_THROW
	 * @model name="ExceptionThrow"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTION_THROW_VALUE = 11;

	/**
	 * The '<em><b>Type Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Type Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_PARAMETER
	 * @model name="TypeParameter"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_PARAMETER_VALUE = 12;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Location</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model name="Location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 13;

	/**
	 * The '<em><b>Return Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Return Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETURN_TYPE
	 * @model name="ReturnType"
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_TYPE_VALUE = 14;

	/**
	 * The '<em><b>Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Path</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH
	 * @model name="Path"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_VALUE = 15;

	/**
	 * The '<em><b>Content Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Content Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTENT_TYPE
	 * @model name="ContentType"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_TYPE_VALUE = 16;

	/**
	 * The '<em><b>Status Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Status Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS_CODE
	 * @model name="StatusCode"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_CODE_VALUE = 17;

	/**
	 * An array of all the '<em><b>API Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final APIElementType[] VALUES_ARRAY =
		new APIElementType[] {
			PACKAGE,
			CLASS,
			INTERFACE,
			METHOD,
			CONSTRUCTOR,
			FIELD,
			ENUMERATION,
			ELEMENT_ANNOTATION,
			ENUM_LITERAL,
			METHOD_PARAMETER,
			TYPE_FIELD,
			EXCEPTION_THROW,
			TYPE_PARAMETER,
			LOCATION,
			RETURN_TYPE,
			PATH,
			CONTENT_TYPE,
			STATUS_CODE,
		};

	/**
	 * A public read-only list of all the '<em><b>API Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<APIElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>API Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static APIElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			APIElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>API Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static APIElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			APIElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>API Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static APIElementType get(int value) {
		switch (value) {
			case PACKAGE_VALUE: return PACKAGE;
			case CLASS_VALUE: return CLASS;
			case INTERFACE_VALUE: return INTERFACE;
			case METHOD_VALUE: return METHOD;
			case CONSTRUCTOR_VALUE: return CONSTRUCTOR;
			case FIELD_VALUE: return FIELD;
			case ENUMERATION_VALUE: return ENUMERATION;
			case ELEMENT_ANNOTATION_VALUE: return ELEMENT_ANNOTATION;
			case ENUM_LITERAL_VALUE: return ENUM_LITERAL;
			case METHOD_PARAMETER_VALUE: return METHOD_PARAMETER;
			case TYPE_FIELD_VALUE: return TYPE_FIELD;
			case EXCEPTION_THROW_VALUE: return EXCEPTION_THROW;
			case TYPE_PARAMETER_VALUE: return TYPE_PARAMETER;
			case LOCATION_VALUE: return LOCATION;
			case RETURN_TYPE_VALUE: return RETURN_TYPE;
			case PATH_VALUE: return PATH;
			case CONTENT_TYPE_VALUE: return CONTENT_TYPE;
			case STATUS_CODE_VALUE: return STATUS_CODE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private APIElementType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //APIElementType
