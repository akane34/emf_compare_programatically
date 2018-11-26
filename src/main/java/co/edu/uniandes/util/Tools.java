package co.edu.uniandes.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.uoc.som.openapi.OpenAPIPackage;

public class Tools {
	public static ResourceSet loadModel(String absolutePath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		URI uri = URI.createFileURI(absolutePath);
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResource(uri, true);
	  
		return resourceSet;
	}
	
	public static OpenAPIPackage registerOpenAPIMetamodel() {		
		OpenAPIPackage openAPIPackage = OpenAPIPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(openAPIPackage.getNsURI(), openAPIPackage);
		
		return openAPIPackage;
	}
}
