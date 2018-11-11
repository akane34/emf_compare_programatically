package co.edu.uniandes.changes;

import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;

public class ChangeParameter {

	private Parameter oldParameter;
	private Parameter newParameter;	
	private Operation operation;
	private String path;
	private String version;
	private DifferenceKind differenceKind;
	private String oldParameterUri;	
	private String newParameterUri;
	
	public Parameter getNewParameter() {
		return newParameter;
	}
	public void setNewParameter(Parameter parameter) {
		this.newParameter = parameter;
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
	public String getNewParameterUri() {
		return newParameterUri;
	}
	public void setNewParameterUri(String uri) {
		this.newParameterUri = uri;
	}
	public Parameter getOldParameter() {
		return oldParameter;
	}
	public void setOldParameter(Parameter oldParameter) {
		this.oldParameter = oldParameter;
	}
	public String getOldParameterUri() {
		return oldParameterUri;
	}
	public void setOldParameterUri(String oldParameterUri) {
		this.oldParameterUri = oldParameterUri;
	}	
}

