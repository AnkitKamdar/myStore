package com.sm.svc.restful.store;

import javax.ws.rs.core.Response;

import com.sm.svc.domains.Store;

public interface StoreRestful{
	
	/**
	 * This method is used to get all the stores .
	 * @return 
	 */
	Response getStore();
	
	/**
	 * This method is used to create a new store
	 * @return
	 */
	Response createStore(Store _store);
	
	public Response updateStore(String storeId, Store store);
}