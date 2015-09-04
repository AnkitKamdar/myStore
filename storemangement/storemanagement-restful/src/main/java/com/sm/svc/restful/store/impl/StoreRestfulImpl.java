/**
 * 
 */
package com.sm.svc.restful.store.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sm.svc.domains.Store;
import com.sm.svc.restful.store.StoreRestful;
import com.sm.svc.services.store.StoreService;

/**
 * @author user
 *
 */
@Component
@Path("/store")
public class StoreRestfulImpl  implements StoreRestful{
	@Autowired
	private StoreService storeService;
	
	@GET
	@Path("/getStore")
	@Produces("application/json")
	public Response getStore(){
		List<Store> result = storeService.getStore();

		return Response.status(200).entity(result).build();
	}

}
