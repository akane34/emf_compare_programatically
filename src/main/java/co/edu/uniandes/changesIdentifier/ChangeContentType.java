package co.edu.uniandes.changesIdentifier;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EAttribute;

import edu.uoc.som.openapi.Path;

public class ChangeContentType {
	private String path;
	private String uri;
	private EAttribute attr;
	private DifferenceKind kind;
	private String value;
	private Path pathObject;
	
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public EAttribute getAttr() {
		return attr;
	}
	public void setAttr(EAttribute attr) {
		this.attr = attr;
	}
	public void setKind(DifferenceKind kind) {
		this.kind = kind;
	}
	
	public DifferenceKind getKind() {
		return kind;
	}
	public Path getPathObject() {
		return pathObject;
	}
	public void setPathObject(Path pathObject) {
		this.pathObject = pathObject;
	}	
}
