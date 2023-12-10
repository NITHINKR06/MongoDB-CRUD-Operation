package com.mongo.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StudentDatas")
public class StudentModel {

	@Id
	private int id;
	private String name;
	private String fatherName;
	private String regNo;
	private long perentMobileNo;
	private long mobileNo;
	private String address;
	
	public StudentModel(int id, String name, String fatherName, String regNo, long perentMobileNo, long mobileNo,
			String address) {
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.regNo = regNo;
		this.perentMobileNo = perentMobileNo;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public long getPerentMobileNo() {
		return perentMobileNo;
	}
	public void setPerentMobileNo(long perentMobileNo) {
		this.perentMobileNo = perentMobileNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
