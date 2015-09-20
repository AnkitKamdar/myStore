/**
 * 
 */
package com.sm.svc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

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
	@SelectKey(statement="SELECT nextval('store_id_seq')", keyProperty="storeId", resultType=int.class, before = true)
    public void createStore(Store store);

	/**
	 * This method is used to update the stores .
	 * 
	 */
	@Update("UPDATE store_master SET store_name = #{storeName} where store_id = #{storeId}")
	public void updateStore(Store store);
	
//	@Select("SELECT * from store_master where store_type=#{storeType}")
	public Store getStoreById(int storeType);
	
	public Store getStoreByName(String storeName);
}
