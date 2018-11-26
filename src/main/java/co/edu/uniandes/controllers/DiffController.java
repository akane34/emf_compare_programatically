package co.edu.uniandes.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.TransformationChainOutput;
import co.edu.uniandes.transformations.TransformationChain;

@Path("/diff")
public class DiffController {
	
	@POST
	@Path("compare")	
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public TransformationChainOutput compare(CompareVersionInput compareVersion){		
		
		TransformationChain transformationChain = new TransformationChain();
		return transformationChain.execute(compareVersion);
	}	
}
