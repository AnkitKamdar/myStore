/**
 * 
 */
package com.sm.svc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.sm.svc.domains.Store;

/**
 * @author user
 *
 */
public interface StoreMapper {
	
	
	/**
	 * This method is used to get all the stores .
	 * @return List<Store>
	 */
	public List<Store> selectAll();
	
	/**
	 * This method is used to create a new store
	 * @param store
	 */
	@Insert("INSERT INTO store_master(store_id, store_name, store_address,"
			
			          + "store_type, store_locality, store_city,store_mob_no) VALUES"
			
			          + "(#{storeId},#{storeName}, #{storeAddress}, #{storeType},"
			
			          + "#{storeLocality}, #{storeCity},#{storeMobNo})")
			
    public void createStore(Store store);

	
}
