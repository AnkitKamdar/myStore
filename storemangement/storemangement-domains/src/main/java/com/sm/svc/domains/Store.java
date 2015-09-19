/**
 * 
 */
package com.sm.svc.domains;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author user
 *
 */
@XmlRootElement 
@XmlType(name = "store", propOrder = { "storeId", "storeName", "storeAddress", "storeType", "storeLocality",
"storeCity", "storeMobNo"})
public class Store implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 00065L;
	private String storeId;
	private String storeName;
	private String storeAddress;
	private Integer storeType;
	private Integer storeLocality;
	private Integer storeCity;
	private Integer storeMobNo;
	
	

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param storeId
	 * @param storeName
	 * @param storeAddress
	 * @param storeType
	 * @param storeLocality
	 * @param storeCity
	 * @param storeMobNo
	 */
	public Store(String storeId, String storeName, String storeAddress,
			Integer storeType, Integer storeLocality, Integer storeCity,
			Integer storeMobNo) {
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storeType = storeType;
		this.storeLocality = storeLocality;
		this.storeCity = storeCity;
		this.storeMobNo = storeMobNo;
	}


	/**
	 * @return the storeId
	 */
	public String getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * @return the storeAddress
	 */
	public String getStoreAddress() {
		return storeAddress;
	}
	/**
	 * @param storeAddress the storeAddress to set
	 */
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	/**
	 * @return the storeType
	 */
	public Integer getStoreType() {
		return storeType;
	}
	/**
	 * @param storeType the storeType to set
	 */
	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}
	/**
	 * @return the storeLocality
	 */
	public Integer getStoreLocality() {
		return storeLocality;
	}
	/**
	 * @param storeLocality the storeLocality to set
	 */
	public void setStoreLocality(Integer storeLocality) {
		this.storeLocality = storeLocality;
	}
	/**
	 * @return the storeCity
	 */
	public Integer getStoreCity() {
		return storeCity;
	}
	/**
	 * @param storeCity the storeCity to set
	 */
	public void setStoreCity(Integer storeCity) {
		this.storeCity = storeCity;
	}
	/**
	 * @return the storeMobNo
	 */
	public Integer getStoreMobNo() {
		return storeMobNo;
	}
	/**
	 * @param storeMobNo the storeMobNo to set
	 */
	public void setStoreMobNo(Integer storeMobNo) {
		this.storeMobNo = storeMobNo;
	}
	
	

}
