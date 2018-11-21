package co.edu.uniandes.changesIdentifier;

import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Path;

public class ChangePath {

	private Path oldPath;
	private Path newPath;	
	private String path;
	private String version;
	private DifferenceKind differenceKind;
	private String oldPathUri;	
	private String newPathUri;
	
	public Path getNewPath() {
		return newPath;
	}
	public void setNewPath(Path parameter) {
		this.newPath = parameter;
	}	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public DifferenceKind getDifferenceKind() {
		return differenceKind;
	}
	public void setDifferenceKind(DifferenceKind differenceKind) {
		this.differenceKind = differenceKind;
	}
	public String getNewPathUri() {
		return newPathUri;
	}
	public void setNewPathUri(String uri) {
		this.newPathUri = uri;
	}
	public Path getOldPath() {
		return oldPath;
	}
	public void setOldPath(Path oldParameter) {
		this.oldPath = oldParameter;
	}
	public String getOldPathUri() {
		return oldPathUri;
	}
	public void setOldPathUri(String oldParameterUri) {
		this.oldPathUri = oldParameterUri;
	}	
	
	public void clone(ChangePath p){
		this.oldPath = p.getOldPath();
		this.newPath = p.getNewPath();		
		this.path = p.getPath();
		this.version = p.getVersion();
		this.differenceKind = p.getDifferenceKind();
		this.oldPathUri = p.getOldPathUri();	
		this.newPathUri = p.getNewPathUri();
	}
}

