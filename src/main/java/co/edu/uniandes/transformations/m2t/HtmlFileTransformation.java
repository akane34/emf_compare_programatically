package co.edu.uniandes.transformations.m2t;

import cs.ualberta.launcher.Launcher;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;

public class HtmlFileTransformation {

	public void transformation(){
		
		try {
			Launcher launcher = new Launcher();
			/*
			launcher.runATL("metamodels/Book.ecore", "Book", "models/myBook.xmi", 
					"metamodels/Publication.ecore", "Publication", "models/publication.xmi", 
					"Book2Publication", "transformations/M2M/");
			
			launcher.runAcceleo("metamodels/Publication.ecore", "Publication", "models/publication.xmi",
					"transformations/M2T/generateHTML.mtl", "gen/");*/		
		
			launcher.runAcceleo("metamodels/diff.ecore", "diff", "models/model.xmi", "transformations/M2T/generateHTML.mtl", "gen/");
			
		} catch (AcceleoLauncherException e) {
			System.out.println(e.getMessage());
		}
	}
}
