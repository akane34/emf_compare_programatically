package co.edu.uniandes.changesIdentifier;

import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.Schema;

public class ModifyReturnSchema {

	private Path path;
	private Response response;
	private Schema schema;
	private Operation operation;
	
	public Path getPath() {
		return path;
	}
	public void setPath(Path path) {
		this.path = path;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public Schema getSchema() {
		return schema;
	}
	public void setSchema(Schema schema) {
		this.schema = schema;
	}
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}	
	
	@Override
    public boolean equals(Object o) {

        if (o == null) return false;
        if (!(o instanceof ModifyReturnSchema)) return false;
        
        ModifyReturnSchema m = (ModifyReturnSchema) o;
        if (m.getSchema() == null && schema == null) return true;        
        if (m.getSchema() == null || schema == null) return false;        
        if (m.getSchema().getName() == null && schema.getName() == null) return true;        
        if (m.getSchema().getName() == null || schema.getName() == null) return false;
        
        return m.schema.getName().equals(schema.getName());
    }    
}
