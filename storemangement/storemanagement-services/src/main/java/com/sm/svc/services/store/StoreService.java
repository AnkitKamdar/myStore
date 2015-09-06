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
}
