package co.edu.uniandes.changes;

import org.eclipse.emf.compare.DifferenceKind;

import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Path;

public class ChangeOperation {

	private Operation oldOperation;
	private Operation newOperation;	
	private Path oldPath;
	private Path newPath;
	private String path;
	private String version;
	private DifferenceKind differenceKind;
	private String oldOperationUri;	
	private String newOperationUri;
			
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
	public Operation getOldOperation() {
		return oldOperation;
	}
	public void setOldOperation(Operation oldOperation) {
		this.oldOperation = oldOperation;
	}
	public Operation getNewOperation() {
		return newOperation;
	}
	public void setNewOperation(Operation newOperation) {
		this.newOperation = newOperation;
	}
	public String getOldOperationUri() {
		return oldOperationUri;
	}
	public void setOldOperationUri(String oldOperationUri) {
		this.oldOperationUri = oldOperationUri;
	}
	public String getNewOperationUri() {
		return newOperationUri;
	}
	public void setNewOperationUri(String newOperationUri) {
		this.newOperationUri = newOperationUri;
	}
	public Path getOldPath() {
		return oldPath;
	}
	public void setOldPath(Path oldPath) {
		this.oldPath = oldPath;
	}
	public Path getNewPath() {
		return newPath;
	}
	public void setNewPath(Path newPath) {
		this.newPath = newPath;
	}	
}

