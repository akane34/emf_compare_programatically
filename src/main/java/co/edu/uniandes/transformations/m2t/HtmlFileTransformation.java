package co.edu.uniandes.transformations.m2t;

import cs.ualberta.launcher.Launcher;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;

public class HtmlFileTransformation {

	public void transformation(String htmlModelPath){
		
		try {
			
			String path = this.getClass().getClassLoader().getResource("").getPath();

			Launcher launcher = new Launcher();		
			launcher.runAcceleo(path + "/html.ecore", "Html", htmlModelPath, path + "/generateHTML.mtl", "/");
			
		} catch (AcceleoLauncherException e) {
			System.out.println(e.getMessage());
		}
	}
}
