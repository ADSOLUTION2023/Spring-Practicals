package com.rays.tut;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "student_details")
public class Student {

	@Id
	private long id;
	private String name;
	private String address;
	private Date dob;
	
	public Student(long id, String name, String address, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	public Student() {
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}	

}
