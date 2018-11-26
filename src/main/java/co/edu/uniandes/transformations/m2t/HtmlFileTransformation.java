package co.edu.uniandes.transformations.m2t;

import cs.ualberta.launcher.Launcher;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;

public class HtmlFileTransformation {

	public void transformation(String htmlModelPath){
		
		try {
			Launcher launcher = new Launcher();		
			launcher.runAcceleo("metamodels/html.ecore", "Html", htmlModelPath, "transformations/M2T/generateHTML.mtl", "gen/");
			
		} catch (AcceleoLauncherException e) {
			System.out.println(e.getMessage());
		}
	}
}
