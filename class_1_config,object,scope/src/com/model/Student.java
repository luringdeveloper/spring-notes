package com.model;

public class Student {

	private String name;

	//	public Student() {
//	System.out.println("init");
//}

public Student(String name) {
//System.out.println("init");
	this.name=name;
}
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	private String college_name;

	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	
	
	
}
