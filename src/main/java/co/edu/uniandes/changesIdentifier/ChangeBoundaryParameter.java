package co.edu.uniandes.changesIdentifier;

import edu.uoc.som.openapi.Parameter;

public class ChangeBoundaryParameter {

	private Parameter oldParam;
	private Parameter newParam;
	private String oldUri;
	private String newUri;
	private Boundary boundary;
	private String path;	
	
	public Boundary getBoundary() {
		return boundary;
	}
	public void setBoundary(Boundary boundary) {
		this.boundary = boundary;
	}
	public Parameter getOldParam() {
		return oldParam;
	}
	public void setOldParam(Parameter oldParam) {
		this.oldParam = oldParam;
	}
	public Parameter getNewParam() {
		return newParam;
	}
	public void setNewParam(Parameter newParam) {
		this.newParam = newParam;
	}
	public String getOldUri() {
		return oldUri;
	}
	public void setOldUri(String oldUri) {
		this.oldUri = oldUri;
	}
	public String getNewUri() {
		return newUri;
	}
	public void setNewUri(String newUri) {
		this.newUri = newUri;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}	
}
