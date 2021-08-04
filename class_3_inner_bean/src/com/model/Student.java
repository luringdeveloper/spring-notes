package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void destroy() {
		System.out.println("object is destroyed");
	}

	// Using List
	private List<Certificate> certificates;

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	// using Set
	private Set<String> game_collections;

	public Set<String> getGame_collections() {
		return game_collections;
	}

	public void setGame_collections(Set<String> game_collections) {
		this.game_collections = game_collections;
	}

	// using map
	private Map<Integer, String> map;

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	

}
