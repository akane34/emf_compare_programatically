package co.edu.uniandes.comparer;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.uoc.som.openapi.OpenAPIPackage;

public class Comparer {
		
	private OpenAPIPackage openAPIPackage;
	
	public Comparer(){
		registerOpenAPIMetamodel();
	}
	
	public Comparison compare(String model1, String model2) {		
		try{
			ResourceSet resourceSet1 = loadModel(model1);
			ResourceSet resourceSet2 = loadModel(model2);		
	
			EMFCompare comparator = getComparator();
			IComparisonScope scope = createScope(resourceSet1, resourceSet2);
			
			return comparator.compare(scope);
		}catch (Exception ex){
			System.out.println(ex.getMessage() + " " + ex.getStackTrace());
		}
		
		return null;		
	}

	public EObject getParameterObject(){		
		for (Iterator<EObject> iterator = openAPIPackage.eAllContents(); iterator.hasNext();) {
			EObject eo = iterator.next();
			if (eo instanceof EClass) {
				String name = ((EClass)eo).getName();
				if ("parameter".equalsIgnoreCase(name))
					return eo;
			}
		}
		
		return null;
	}
	
	private OpenAPIPackage registerOpenAPIMetamodel() {
		if (openAPIPackage == null){
			openAPIPackage = OpenAPIPackage.eINSTANCE;
			EPackage.Registry.INSTANCE.put(openAPIPackage.getNsURI(), openAPIPackage);
		}
		
		return openAPIPackage;
	}	

	private EMFCompare getComparator() {
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
	        matchEngineFactory.setRanking(20);
	        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
	        matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
		return comparator;
	}

	private ResourceSet loadModel(String absolutePath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		URI uri = URI.createFileURI(absolutePath);

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResource(uri, true);
	  
		return resourceSet;
	}	
	
	@SuppressWarnings("deprecation")
	private IComparisonScope createScope(ResourceSet resourceSet1, ResourceSet resourceSet2) {
		return EMFCompare.createDefaultScope(resourceSet1, resourceSet2);		
	}
}
