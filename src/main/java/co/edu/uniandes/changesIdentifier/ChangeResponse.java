package co.edu.uniandes.changesIdentifier;

import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Response;

public class ChangeResponse {

	private Response response;
	private Operation operation;
	private String path;
	private String version;
	private DifferenceKind differenceKind;
	private String uri;
	
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
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
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
