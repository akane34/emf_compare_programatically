package co.edu.uniandes.comparer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;

public class Main {

	public static void main(String[] args) {		
		
		Comparer comparer = new Comparer(); 
		Comparison comparison = comparer.compare(null, null);
		
		EList<Diff> diffs = comparison.getDifferences();
		
		for (Diff diff : diffs){
			System.out.println(diff.getKind().getName());
		}
	}

}
