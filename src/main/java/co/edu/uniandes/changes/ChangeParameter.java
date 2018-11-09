package co.edu.uniandes.changes;

import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;

public class ChangeParameter {

	private Parameter parameter;
	private Operation operation;
	private String path;
	private String version;
	private DifferenceKind differenceKind;
	private String uri;
	
	public Parameter getParameter() {
		return parameter;
	}
	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
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

