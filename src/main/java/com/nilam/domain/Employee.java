package com.nilam.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private long id;
	private String name;
	private String position;
	private Date dob;
	
	public Employee() {
	}
	
	public Employee(long id, String name, String position, Date dob) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.dob = dob;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}