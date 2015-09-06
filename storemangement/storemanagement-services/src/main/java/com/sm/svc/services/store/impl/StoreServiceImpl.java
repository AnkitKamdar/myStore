/**
 * 
 */
package com.sm.svc.services.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.svc.dao.StoreMapper;
import com.sm.svc.services.store.StoreService;
import com.sm.svc.domains.Store;

/**
 * @author user
 *
 */
@Service
public class StoreServiceImpl implements StoreService{
	  @Autowired
	
	  private StoreMapper storeMapper;

	   public StoreServiceImpl(){
		   
	   }
	
       public List<Store> getStore(){
    	   return storeMapper.selectAll();
    	   //return "this is my first store";
       }

	public void createStore(final Store _store) {
		storeMapper.createStore(_store);
		// TODO Auto-generated method stub
		
	}
}
