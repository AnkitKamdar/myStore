/**
 * 
 */
package com.sm.svc.restful.store.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
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
	@Produces(MediaType.APPLICATION_XML)
	public Response getStore(){
		List<Store> result = storeService.getStore();
		/*Stores stores = new Stores();
		stores.setStores(result);*/
		GenericEntity<List<Store>> storeList = new GenericEntity<List<Store>>(result){};
        return Response.status(200).entity(storeList).build();
       // return result;
		//return Response.status(200).entity(result).build();
	}
    @POST
    @Path("/createStore")
	@Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
	public Response createStore(final Store _store) {
    	storeService.createStore(_store);	
		// TODO Auto-generated method stub
    	return Response.status(200).entity("Store Created Successfully").build();
	}

	@PUT
	@Path("/updateStore/{storeId}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})
	public Response updateStore(@PathParam("storeId") int storeId, Store store) {
		// TODO Auto-generated method stub
		storeService.updateStore(store);
		return Response.status(200).entity("Store has been updated").build();
	}
	
	@GET
	@Path("getStore/id/{storeType}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response getStoreById(@PathParam("storeType") int storeType) {
		// TODO Auto-generated method stub
		Store result = storeService.getStoreById(storeType);
		if(result !=null){
			return Response.status(200).entity(result).build();
		} else {
			return Response.status(404).entity("The store with the id " + storeType + " does not exist").build();
		}
	}
	
	@GET
	@Path("getStore/name/{storeName}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response getStoreByName(@PathParam("storeName") String storeName) {
		Store result = storeService.getStoreByName(storeName);
		if(result != null){
			return Response.status(200).entity(result).build();
		} else {
			return Response.status(404).entity("The store with the name " + storeName + " does not exist").build();
		}
	}

}
