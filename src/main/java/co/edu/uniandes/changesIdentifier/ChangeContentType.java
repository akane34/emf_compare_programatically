package co.edu.uniandes.changesIdentifier;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EAttribute;

import edu.uoc.som.openapi.Path;

public class ChangeContentType {
	private String path;
	private String oldUri;
	private String newUri;
	private EAttribute attr;
	private DifferenceKind kind;
	private String oldValue;
	private String newValue;
	private Path pathObject;
	
	
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String value) {
		this.oldValue = value;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getOldUri() {
		return oldUri;
	}
	public void setOldUri(String uri) {
		this.oldUri = uri;
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
	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	public String getNewUri() {
		return newUri;
	}
	public void setNewUri(String newUri) {
		this.newUri = newUri;
	}	
}
