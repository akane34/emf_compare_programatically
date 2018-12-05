package co.edu.uniandes.transformations.m2t;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import cs.ualberta.launcher.Launcher;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;

public class HtmlFileTransformation {

	public void transformation(String htmlModelPath){
		
		try {	        
			String path1 = java.net.URLDecoder.decode(this.getClass().getClassLoader().getResource("bin/html.ecore").getPath(), "UTF-8");
			String path2 = java.net.URLDecoder.decode(this.getClass().getClassLoader().getResource("bin/generateHTML.mtl").getPath(), "UTF-8");			
			
			Launcher launcher = new Launcher();		
			launcher.runAcceleo(path1, "Html", htmlModelPath, path2, "C:\\temp\\gen2");
			
			/*
			String line;
			Properties properties = new Properties();
			properties.setProperty("totalM2T", "1");
			properties.setProperty("m2t.metamodel.in.path.1", "metamodels/html.ecore");
			properties.setProperty("m2t.metamodel.in.name.1", "Html");
			properties.setProperty("m2t.metamodel.in.modelPath.1", htmlModelPath);
			properties.setProperty("m2t.templatePath.1", "transformations/m2t/generateHTML.mtl");
			properties.setProperty("m2t.outputDir.1", "WebContent");
									
			File file = new File("m2t.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, "M2T Transformation");
			fileOut.close();
			
			String fileName = "m2t.properties";
	        String[] commands = {"java", "-jar", "lib/MTCLauncher.jar", fileName};
	        Process p = Runtime.getRuntime().exec(commands);
			
	        BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while ((line = bri.readLine()) != null) {
				System.out.println(line);
			}
			bri.close();
			  
			while ((line = bre.readLine()) != null) {
				System.out.println(line);
			}			
			bre.close();
			
			p.waitFor();
			System.out.println("Done.");*/	        
	        
			
		} catch (AcceleoLauncherException | IOException e) {
			System.out.println(e.getMessage() + e.getStackTrace() + e.getCause());
		}
	}
}
