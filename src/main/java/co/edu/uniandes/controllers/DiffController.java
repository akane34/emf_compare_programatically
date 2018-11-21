package co.edu.uniandes.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.uniandes.changesIdentifier.ChangesIdentifier;
import co.edu.uniandes.pojos.CompareVersionInput;
import co.edu.uniandes.pojos.IdentifyOutput;

@Path("/diff")
public class DiffController {
	
	@POST
	@Path("compare")	
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public IdentifyOutput compare(CompareVersionInput compareVersion ){
		
		ChangesIdentifier identifierChanges = new ChangesIdentifier();
		return identifierChanges.identify(compareVersion);		
	}	
}
