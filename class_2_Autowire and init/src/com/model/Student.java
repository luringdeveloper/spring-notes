package com.model;

public class Student {

	private String name;
	private long phone_number;
	private Address address;
	private Coll coll;

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getPhone_number() {
//		return phone_number;
//	}
//	public void setPhone_number(long phone_number) {
//		this.phone_number = phone_number;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	// through constructor

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public long getPhone_number() {
//		return phone_number;
//	}
//	public void setPhone_number(long phone_number) {
//		this.phone_number = phone_number;
//	}
//	
//	public Address getAddress() {
//		return address;
//	}
//	
//	
//	public Coll getColl() {
//		return coll;
//	}
//	
//	
//	public Student() {
//		System.out.println("constructor");
//	}
//	public void init() {
//		System.out.println("init");
//	}
//	public Student(Address address, Coll coll) {
//		super();
//		this.address = address;
//		this.coll = coll;
//	}

//gives error	
//	public Student(Coll coll) {
//		super();
//		
//		this.coll = coll;
//	}
//	
//	public Student(Address address) {
//	super();
//	this.address = address;
//
//}

//init method using	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Coll getColl() {
		return coll;
	}

	public void setColl(Coll coll) {
		this.coll = coll;
	}

	public Student() {
		System.out.println("construct");
	}

	public void init() {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

}
