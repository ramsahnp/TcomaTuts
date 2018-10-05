package com.model;

public class Address {
	private String sector;
	private String houseNo;
	private String city;
	
	
	public Address() {
		super();
		
	}
	public Address(String sector, String houseNo, String city) {
		super();
		this.sector = sector;
		this.houseNo = houseNo;
		this.city = city;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
