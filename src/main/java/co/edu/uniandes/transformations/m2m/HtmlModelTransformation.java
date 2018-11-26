package co.edu.uniandes.transformations.m2m;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.metamodels.Diff.Change;
import co.edu.uniandes.metamodels.Diff.DiffFactory;
import co.edu.uniandes.metamodels.Diff.DiffPackage;
import co.edu.uniandes.metamodels.Diff.RenameParameter;
import co.edu.uniandes.metamodels.Diff.impl.DiffImpl;
import co.edu.uniandes.metamodels.Diff.impl.DiffPackageImpl;
import co.edu.uniandes.metamodels.Html.BODY;
import co.edu.uniandes.metamodels.Html.HTML;
import co.edu.uniandes.metamodels.Html.HtmlFactory;
import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.TABLE;
import co.edu.uniandes.metamodels.Html.TD;
import co.edu.uniandes.metamodels.Html.TR;
import co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl;

public class HtmlModelTransformation {
	
	private DiffPackage diffPackage;	
	private DiffFactory diffFactory;
	private HtmlPackage htmlPackage;	
	private HtmlFactory htmlFactory;
	private Resource xmiResource;
	private ResourceSet resourceSet;
	
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
        
        resourceSet = new ResourceSetImpl();
        xmiResource = resourceSet.createResource(URI.createFileURI(outputFilePath));        
	}	
	
	public ResourceSet transformation(ResourceSet outputModel, ResourceSet minorVersionModel, ResourceSet mayorVersionModel) {				
		BODY body = htmlFactory.createBODY();		
		
		DiffImpl diffRoot = getDiffRoot(outputModel);
		if (diffRoot != null){
			TABLE tableRenameParameter = htmlFactory.createTABLE();
			tableRenameParameter.setTitle("Rename Parameter");
			tableRenameParameter.setId(UUID.randomUUID().toString());
			
			EList<Change> changes =	diffRoot.getChange();
			for (Change change : changes){
				if (change instanceof RenameParameter){
					RenameParameter c = (RenameParameter)change;
					
					TD td1 = htmlFactory.createTD();
					td1.setTitle("Old parameter");
					td1.setValue(c.getOld().getValue());
					
					TD td2 = htmlFactory.createTD();
					td2.setTitle("New parameter");
					td2.setValue(c.getNew().getValue());
					
					TR tr = htmlFactory.createTR();
					tr.setTitle(c.getOld().getPath());
					tr.getTds().add(td1);
					tr.getTds().add(td2);
										
					tableRenameParameter.getTrs().add(tr);	
					
					xmiResource.getContents().add(td1);
					xmiResource.getContents().add(td2);
					xmiResource.getContents().add(tr);
				}
			}
			
			body.getBodyElements().add(tableRenameParameter);
			
			xmiResource.getContents().add(tableRenameParameter);
		}	
		
		HTML html = htmlFactory.createHTML();
		html.setBody(body);		
		
		xmiResource.getContents().add(html);
		xmiResource.getContents().add(body);
		saveInstance();	
		
		return resourceSet;
	}

	private DiffImpl getDiffRoot(ResourceSet outputModel) {
		DiffImpl diffRoot = null;
		EList<Resource> resources = outputModel.getResources();
		if (resources != null && resources.size() > 0){
			EList<EObject> contents = resources.get(0).getContents();
			if (contents != null && contents.size() > 0){
				if (contents.get(0) instanceof DiffImpl){
					diffRoot = (DiffImpl) contents.get(0);
				}
			}			
		}
		
		return diffRoot;
	}	
	
	private void saveInstance() {
		try {
            xmiResource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
