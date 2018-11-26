package co.edu.uniandes.changesIdentifier;

import edu.uoc.som.openapi.Operation;

public class OperationWrapper {
	
	private Operation operation;
	private String method;
	
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}	
}
