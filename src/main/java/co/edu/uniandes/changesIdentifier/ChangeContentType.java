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
	private String oldValueProduces;
	private String newValueProduces;
	private String oldValueConsumes;
	private String newValueConsumes;
	private Path pathObject;
			
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
	public String getNewUri() {
		return newUri;
	}
	public void setNewUri(String newUri) {
		this.newUri = newUri;
	}
	public String getOldValueProduces() {
		return oldValueProduces;
	}
	public void setOldValueProduces(String oldValueProduces) {
		this.oldValueProduces = oldValueProduces;
	}
	public String getNewValueProduces() {
		return newValueProduces;
	}
	public void setNewValueProduces(String newValueProduces) {
		this.newValueProduces = newValueProduces;
	}
	public String getOldValueConsumes() {
		return oldValueConsumes;
	}
	public void setOldValueConsumes(String oldValueConsumes) {
		this.oldValueConsumes = oldValueConsumes;
	}
	public String getNewValueConsumes() {
		return newValueConsumes;
	}
	public void setNewValueConsumes(String newValueConsumes) {
		this.newValueConsumes = newValueConsumes;
	}	
}
