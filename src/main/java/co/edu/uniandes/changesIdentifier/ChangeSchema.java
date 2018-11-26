package co.edu.uniandes.changesIdentifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Schema;

public class ChangeSchema {
	private Schema schema;
	private URI uri;
	private DifferenceKind differenceKind;
	private Diff diff;
	
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
	public URI getUri() {
		return uri;
	}
	public void setUri(URI uri) {
		this.uri = uri;
	}
	public Diff getDiff() {
		return diff;
	}
	public void setDiff(Diff diff) {
		this.diff = diff;
	}	
}
