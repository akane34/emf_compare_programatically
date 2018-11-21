package co.edu.uniandes.changesIdentifier;
import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Schema;

public class ChangeSchema {
	private Schema schema;
	private String uri;
	private DifferenceKind differenceKind;
	
	public DifferenceKind getDifferenceKind() {
		return differenceKind;
	}
	public void setDifferenceKind(DifferenceKind differenceKind) {
		this.differenceKind = differenceKind;
	}
	public Schema getSchema() {
		return schema;
	}
	public void setSchema(Schema schema) {
		this.schema = schema;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
