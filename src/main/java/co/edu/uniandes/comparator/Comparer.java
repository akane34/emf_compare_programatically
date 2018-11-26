package co.edu.uniandes.comparator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
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
import org.eclipse.emf.ecore.resource.ResourceSet;

import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.IdentifyOutput;
import co.edu.uniandes.pojos.ModelInputType;
import co.edu.uniandes.pojos.ModelPathOutput;
import co.edu.uniandes.util.Tools;
import edu.uoc.som.openapi.OpenAPIPackage;

public class Comparer {
		
	private OpenAPIPackage openAPIPackage;
	
	public Comparer(){
		Tools.registerOpenAPIMetamodel();
	}
	
	public EList<Diff> compare(ResourceSet minorVersionModel, ResourceSet mayorVersionModel) {		
		try{	
			EMFCompare comparator = getComparator();
			IComparisonScope scope = createScope(minorVersionModel, mayorVersionModel);
			
			Comparison comparison = comparator.compare(scope);
			
			return comparison.getDifferences();
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
	
	@SuppressWarnings("deprecation")
	private IComparisonScope createScope(ResourceSet resourceSet1, ResourceSet resourceSet2) {
		return EMFCompare.createDefaultScope(resourceSet1, resourceSet2);		
	}
}
