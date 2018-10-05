package com.model;

import java.util.Date;

import javax.validation.constraints.Size;

import com.custom.validtor.Validator;

public class Student 
{
	//@Size(min=5,max=10)
	@Validator(values="Krishna|Sunny|Kiram")
	private String sname;
	private Date dob;
	private String mobile;
	private String address;
	private Address address_model;
	
	public Address getAddress_model() {
		return address_model;
	}
	public void setAddress_model(Address address_model) {
		this.address_model = address_model;
	}
	public Student() {
		super();
		
	}
	public Student(String sname, Date dob, String mobile, String address) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
