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
	
	/**
	 * This method is used to update a store by storeId
	 * @return
	 */
	public Response updateStore(int storeId, Store store);
	
	/**
	 * This method is used to get a store by storeId
	 * @return
	 */
	public Response getStoreById(int storeType);
	
	/**
	 * This method is used to get a store by storeName
	 * @return
	 */
	public Response getStoreByName(String storeName);
}