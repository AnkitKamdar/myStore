/**
 * 
 */
package com.sm.svc.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

/**
 * @author user
 *
 */
@Component
@Path("/payment")
public class MyRestFul {

	@GET
	@Path("/mkyong")
	//@Produces("text/plain")
    //@Produces("application/json")
	public Response  testText(){
		String result = "my first Rest";

		return Response.status(200).entity(result).build();

		
	}
}
