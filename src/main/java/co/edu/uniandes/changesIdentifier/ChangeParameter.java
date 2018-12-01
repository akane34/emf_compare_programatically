package co.edu.uniandes.changesIdentifier;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Parameter;

public class ChangeParameter {

	private Parameter oldParameter;
	private Parameter newParameter;	
	private List<OperationWrapper> operations;
	private String path;
	private String version;
	private DifferenceKind differenceKind;
	private String oldParameterUri;	
	private String newParameterUri;
	private String method;
	
	public Parameter getNewParameter() {
		return newParameter;
	}
	public void setNewParameter(Parameter parameter) {
		this.newParameter = parameter;
	}
	public List<OperationWrapper> getOperations() {
		if (operations == null)
			operations = new ArrayList<OperationWrapper>();
		
		return operations;
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
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	public void clone(ChangeParameter p){
		this.oldParameter = p.getOldParameter();
		this.newParameter = p.getNewParameter();	
		this.operations = p.getOperations();
		this.path = p.getPath();
		this.version = p.getVersion();
		this.differenceKind = p.getDifferenceKind();
		this.oldParameterUri = p.getOldParameterUri();	
		this.newParameterUri = p.getNewParameterUri();
	}
}

