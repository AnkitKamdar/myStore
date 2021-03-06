/**
 * 
 */
package com.sm.svc.services.store;

import java.util.List;

import com.sm.svc.domains.Store;

/**
 * @author user
 *
 */
public interface StoreService {
	
	/**
	 * This method is used to get all the stores .
	 * @return List<Store>
	 */
	 
	List<Store> getStore(); 
	
	/**
	 * This method is used to create a new store
	 * @param _store
	 */
	void createStore(Store _store);
	
	/**
	 * This method is used to update a store by id
	 * @param _store
	 */
	void updateStore(Store store);
	
	/**
	 * This method is used to get a store by id
	 * @param storeId
	 */
	public Store getStoreById(int storeType);
	
	/**
	 * This method is used to update a store by name
	 * @param storeName
	 */
	public Store getStoreByName(String storeName);
}
