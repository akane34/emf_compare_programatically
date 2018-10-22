package co.edu.uniandes.diff;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import co.edu.uniandes.diff.metamodel.*;

public class DiffMetamodel {

	public EFactory getEFactoryInstance(){		
		
		DiffPackage diffPackage = DiffPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(diffPackage.getNsURI(), diffPackage);
				
		return diffPackage.getEFactoryInstance();		
	}
	
	public void createChangeParameterLocationDiff(EFactory diffFactoryInstance, String oldVersion, String newVersion, APIElementType apiElementType){
		/*
		EObject bookObject = diffFactoryInstance.create(bookEClass);
		EObject bookStoreObject = diffFactoryInstance.create(bookStoreEClass);*/
	}
}
