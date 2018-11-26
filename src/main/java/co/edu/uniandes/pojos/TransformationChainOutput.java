package co.edu.uniandes.pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransformationChainOutput {
	private String outputType;
	private String diffModel;
	private boolean success;
	private String error;	
	
	public String getOutputType() {
		return outputType;
	}
	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}
	public String getDiffModel() {
		return diffModel;
	}
	public void setDiffModel(String diffModel) {
		this.diffModel = diffModel;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getError() {
		if (error == null)
			return "";
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}	
}
