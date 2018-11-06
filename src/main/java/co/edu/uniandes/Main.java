package co.edu.uniandes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;

import co.edu.uniandes.changes.ChangeParameter;
import co.edu.uniandes.changes.ChangeResponse;
import co.edu.uniandes.changes.ChangesProcessor;
import co.edu.uniandes.comparer.Comparer;
import co.edu.uniandes.diff.DiffMetamodel;

public class Main {

	static String oldVersion = "1.0";
	static String newVersion = "2.0";
	
	public static void main(String[] args) {		
		
		
		DiffMetamodel diffMetamodel = new DiffMetamodel();
		Comparer comparer = new Comparer();
		Comparison comparison = comparer.compare("v1.0.xmi", "v2.0.xmi");
	
		EList<Diff> diffs = comparison.getDifferences();
		
		List<ChangeParameter> deleteParameters = new ArrayList<ChangeParameter>();
		List<ChangeParameter> addParameters = new ArrayList<ChangeParameter>();
		List<ChangeParameter> changeParameters = new ArrayList<ChangeParameter>();
		Map<String, List<ChangeParameter>> operations = new HashMap<String, List<ChangeParameter>>();
		
		List<ChangeResponse> deleteResponse = new ArrayList<ChangeResponse>();
		List<ChangeResponse> addResponse = new ArrayList<ChangeResponse>();
		
		for (Diff diff : diffs){
			
			if (diff instanceof ReferenceChange){								
				ChangesProcessor.getDeletedParameters(deleteParameters, operations, diff, oldVersion);				
				ChangesProcessor.getAddedParameters(addParameters, operations, diff, newVersion);
				ChangesProcessor.getChangedParameters(changeParameters, diff, oldVersion, newVersion);
				ChangesProcessor.getDeletedResponse(deleteResponse, diff, oldVersion);				
				ChangesProcessor.getAddedResponse(addResponse, diff, newVersion);
			}
		}
				
		ChangesProcessor.processRelocateParameter(diffMetamodel, deleteParameters, addParameters);
		ChangesProcessor.processChangeTypeParameter(diffMetamodel, deleteParameters, addParameters);
		ChangesProcessor.processIncreaseNumberOfParameters(diffMetamodel, operations, oldVersion);
		ChangesProcessor.processDecreaseNumberOfParameters(diffMetamodel, operations, oldVersion);
		ChangesProcessor.processChangeTypeOfReturnValue(diffMetamodel, deleteResponse, addResponse);
		
		diffMetamodel.saveInstance();
	}	
}
