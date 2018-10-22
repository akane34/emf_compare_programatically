package co.edu.uniandes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.FeatureMapChange;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.ResourceAttachmentChange;
import org.eclipse.emf.compare.ResourceLocationChange;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

import com.google.common.collect.ImmutableList;

import org.eclipse.emf.compare.rcp.ui.internal.structuremergeviewer.groups.impl.ByResourceGroupProvider;
import org.eclipse.emf.compare.rcp.ui.internal.structuremergeviewer.groups.impl.ByResourceGroupProvider.ResourceGroup;
import org.eclipse.emf.compare.rcp.ui.structuremergeviewer.groups.IDifferenceGroup;

import co.edu.uniandes.comparer.Comparer;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.impl.OperationImpl;
import edu.uoc.som.openapi.impl.ParameterImpl;

public class Main {

	public static void main(String[] args) {		
		
		Comparer comparer = new Comparer(); 
		Comparison comparison = comparer.compare("ThingBoardV10.xmi", "ThingBoardV20.xmi");
		
		ByResourceGroupAkane resourceComparisonGroup = new ByResourceGroupAkane();
		
		
		
		
		/*
		Set<Match> roots = new LinkedHashSet<Match>();
		for (Match match : comparison.getMatches()) {
			recursiveFindRoots(match);
		}
		super.buildSubTree();	
*/
	
	
		//Collection<? extends IDifferenceGroup> groups = ImmutableList.of(group);
		
//		Collection<? extends IDifferenceGroup> groups = resourceComparisonGroup.getGroups(comparison);
		/*
		for (IDifferenceGroup dg : groups){
			System.out.println(dg.getName());
		}
		*/
		EList<Diff> diffs = comparison.getDifferences();
		
		//EObject parameter = comparer.getParameterObject();
		//EList<Diff> diffsParameters = comparison.getDifferences(parameter);
		
		for (Diff diff : diffs){
			
			if (diff instanceof ReferenceChange){
				if (((ReferenceChange)diff).getValue() instanceof OperationImpl){
					OperationImpl operation = (OperationImpl)((ReferenceChange)diff).getValue();
					EList<Parameter> parameters = operation.getParameters();
					if (parameters != null){
						for (Parameter parameter : parameters){							
							System.out.println(parameter.getName() + "  " + operation.getFullPath());
						}
					}					
				}
			}
			if (diff instanceof AttributeChange){
				if (((AttributeChange)diff).getValue() instanceof OperationImpl){
					OperationImpl operation = (OperationImpl)((AttributeChange)diff).getValue();
					EList<Parameter> parameters = operation.getParameters();
					if (parameters != null){
						for (Parameter parameter : parameters){							
							System.out.println(parameter.getName());
						}
					}					
				}
			}
			if (diff instanceof FeatureMapChange){
				if (((FeatureMapChange)diff).getValue() instanceof OperationImpl){
					OperationImpl operation = (OperationImpl)((FeatureMapChange)diff).getValue();
					EList<Parameter> parameters = operation.getParameters();
					if (parameters != null){
						for (Parameter parameter : parameters){							
							System.out.println(parameter.getName());
						}
					}					
				}			
				/*
				if (((ResourceAttachmentChange)diff).getValue() instanceof OperationImpl){
					OperationImpl operation = (OperationImpl)((ResourceAttachmentChange)diff).getValue();
					EList<Parameter> parameters = operation.getParameters();
					if (parameters != null){
						for (Parameter parameter : parameters){							
							System.out.println(parameter.getName());
						}
					}					
				}
				
				if (((ResourceLocationChange)diff).getValue() instanceof OperationImpl){
					OperationImpl operation = (OperationImpl)((ResourceLocationChange)diff).getValue();
					EList<Parameter> parameters = operation.getParameters();
					if (parameters != null){
						for (Parameter parameter : parameters){							
							System.out.println(parameter.getName());
						}
					}					
				}	*/			
			}
		}
	}
}
