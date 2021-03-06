package co.edu.uniandes.transformations.m2t;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import co.edu.uniandes.transformation.mtcluncher.Launcher;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;

public class HtmlToFileTransformation {

	public void transformation(String htmlModelPath){
		
		try {	        
			String metamodelPath = java.net.URLDecoder.decode(this.getClass().getClassLoader().getResource("bin/html.ecore").getPath(), "UTF-8");
			String templatePath = java.net.URLDecoder.decode(this.getClass().getClassLoader().getResource("bin/generateHTML.mtl").getPath(), "UTF-8");			
			String generateHTMLCompilated = Files.createTempDirectory(null).toAbsolutePath().toString() + "/";
			
			String output = java.net.URLDecoder.decode(new File(metamodelPath).getParent() + "/../../../", "UTF-8");
			
			System.out.println("Html output directory: " + output);
			
			Launcher launcher = new Launcher();		
			launcher.runAcceleo(metamodelPath, "Html", htmlModelPath, templatePath, output, generateHTMLCompilated);
			
		} catch (AcceleoLauncherException | IOException e) {
			System.out.println(e.getMessage() + e.getStackTrace() + e.getCause());
		}
	}
}
