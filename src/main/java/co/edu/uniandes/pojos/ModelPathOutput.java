package co.edu.uniandes.pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ModelPathOutput {
	private String path;	
	private boolean success;
	private String error;
		
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}	
}
