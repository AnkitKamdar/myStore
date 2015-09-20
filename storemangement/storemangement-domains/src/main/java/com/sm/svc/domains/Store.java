/**
 * 
 */
package com.sm.svc.domains;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author user
 *
 */
@XmlRootElement
public class Store implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 00065L;
	private int storeId;
	private String storeName;
	private String storeAddress;
	private int storeType;
	private int storeLocality;
	private int storeCity;
	private int storeMobNo;
	private String ownerName;
	private String emailAddress;
	private int storePincode;
	private String serviceArea;
	
	

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
	public Store(int storeId, String storeName, String storeAddress,
			int storeType, int storeLocality, int storeCity,
			int storeMobNo) {
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
	public int getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(int storeId) {
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

	public int getStoreType() {
		return storeType;
	}


	public void setStoreType(int storeType) {
		this.storeType = storeType;
	}


	public int getStoreLocality() {
		return storeLocality;
	}


	public void setStoreLocality(int storeLocality) {
		this.storeLocality = storeLocality;
	}


	public int getStoreCity() {
		return storeCity;
	}


	public void setStoreCity(int storeCity) {
		this.storeCity = storeCity;
	}


	public int getStoreMobNo() {
		return storeMobNo;
	}


	public void setStoreMobNo(int storeMobNo) {
		this.storeMobNo = storeMobNo;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public int getStorePincode() {
		return storePincode;
	}


	public void setStorePincode(int storePincode) {
		this.storePincode = storePincode;
	}


	public String getServiceArea() {
		return serviceArea;
	}


	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}


	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName
				+ ", storeAddress=" + storeAddress + ", storeType=" + storeType
				+ ", storeLocality=" + storeLocality + ", storeCity="
				+ storeCity + ", storeMobNo=" + storeMobNo + "]";
	}

}
