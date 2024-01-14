package com.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ab {
	
	@Id
	int id;
	String name;
	String designation;
	public Ab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ab(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Ab [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
	
}
