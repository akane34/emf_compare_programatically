package co.edu.uniandes.diff;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.diff.metamodel.*;
import co.edu.uniandes.diff.metamodel.impl.DiffPackageImpl;
import co.edu.uniandes.diff.metamodel.impl.RenameImpl;

public class DiffMetamodel {

	private DiffPackage diffPackage;	
	private EFactory eFactory;
	private DiffFactory factory;
	
	
	public DiffMetamodel(){
		DiffPackage diffPackage = DiffPackage.eINSTANCE;		
		EPackage.Registry.INSTANCE.put(diffPackage.getNsURI(), diffPackage);		
		eFactory = diffPackage.getEFactoryInstance();	
		
		DiffPackage.eINSTANCE.eClass();
		DiffPackageImpl.init();
		factory = DiffFactory.eINSTANCE;
	}	
	
	public void createChangeTypeOfParameterInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){		
		
	}	
	
	public void createRenameParameterInstance(String oldVersion, String newVersion){
		
		Diff diff = factory.createDiff();
		diff.setOldVersion(oldVersion);
		diff.setNewVersion(newVersion);
		
		EList<Change> change = diff.getChange();	
		
		Rename rename = factory.createRename();		
		
		change.add(rename);
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        
        //Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI.createFileURI("C:/temp/model.xmi"));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(rename);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
	
	public void createDecreaseOrIncreaseNumberOfParametersInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
			
	}
	
	public void createChangeFormatOfReturnValueInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createExposeDataInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
		
	public void createChangeTypeOfReturnValueInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createDeleteMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createRenameMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createCombineMethodsInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createSplitMethodInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createRelocateParameterInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createChangeDefaultValueOfParameterInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createChangeUpperBoundOfParameterInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}
	
	public void createRestricAccessToAPIInstance(EFactory diffFactoryInstance, String oldVersion, String newVersion){
		
	}	
}
