package co.edu.uniandes.changesIdentifier;

import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Schema;

public class ModifyParameterSchema {

	private Path path;
	private Parameter parameter;
	private Schema schema;
	private Operation operation;
	
	public Path getPath() {
		return path;
	}
	public void setPath(Path path) {
		this.path = path;
	}
	public Parameter getParameter() {
		return parameter;
	}
	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
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
        if (!(o instanceof ModifyParameterSchema)) return false;
        
        ModifyParameterSchema m = (ModifyParameterSchema) o;
        if (m.getSchema() == null && schema == null) return true;        
        if (m.getSchema() == null || schema == null) return false;        
        if (m.getSchema().getName() == null && schema.getName() == null) return true;        
        if (m.getSchema().getName() == null || schema.getName() == null) return false;
        
        return m.schema.getName().equals(schema.getName());
    }    
}
