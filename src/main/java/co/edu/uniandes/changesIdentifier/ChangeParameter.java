package co.edu.uniandes.changesIdentifier;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;

public class ChangeParameter {

	private Parameter oldParameter;
	private Parameter newParameter;	
	private List<Operation> operations;
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
	public List<Operation> getOperations() {
		if (operations == null)
			operations = new ArrayList<Operation>();
		
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

