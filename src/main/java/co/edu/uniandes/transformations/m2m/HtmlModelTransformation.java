package co.edu.uniandes.transformations.m2m;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.metamodels.Diff.DiffFactory;
import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl;
import co.edu.uniandes.metamodels.Html.HTML;
import co.edu.uniandes.metamodels.Html.HtmlFactory;
import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl;

public class HtmlModelTransformation {
	
	private DiffPackage diffPackage;	
	private DiffFactory diffFactory;
	private HtmlPackage htmlPackage;	
	private HtmlFactory htmlFactory;
	private Resource xmiResource;
	
	public HtmlModelTransformation(String outputFilePath){
		diffPackage = DiffPackage.eINSTANCE;		
		EPackage.Registry.INSTANCE.put(diffPackage.getNsURI(), diffPackage);		
		
		DiffPackage.eINSTANCE.eClass();
		DiffPackageImpl.init();
		diffFactory = DiffFactory.eINSTANCE;
		
		htmlPackage = HtmlPackage.eINSTANCE;		
		EPackage.Registry.INSTANCE.put(htmlPackage.getNsURI(), htmlPackage);		
		
		HtmlPackage.eINSTANCE.eClass();
		HtmlPackageImpl.init();
		htmlFactory = HtmlFactory.eINSTANCE;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();
        xmiResource = resSet.createResource(URI.createFileURI(outputFilePath));        
	}	
	
	public HTML createHtmlModel(String oldVersion, String newVersion) {
		HTML html = htmlFactory.createHTML();		
		xmiResource.getContents().add(html);
		return html;
	}
}
