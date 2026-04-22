package com.rays.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("person")//by default class name se bean create hoti h
//Person person = new Person();
// <bean id="person" class="com.rays.test.Person"></bean>
public class Person {
	//@Value ("Amit")
	private String name;
	//@Value ("Indore")
	private String address;
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
