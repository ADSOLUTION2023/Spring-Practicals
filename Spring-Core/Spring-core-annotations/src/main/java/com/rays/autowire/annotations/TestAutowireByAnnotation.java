package com.rays.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByAnnotation {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		UserServiceByName user1 = (UserServiceByName) context.getBean("userServiceByName");
		UserServiceByConstructor user2 = (UserServiceByConstructor) context.getBean("userServiceByConstructor");
		UserServiceByType user3 = (UserServiceByType) context.getBean("userServiceByType");
		UserServiceByType user4 = (UserServiceByType) context.getBean("userServiceByType");
		user1.testAdd();
		user2.testAdd();
		user3.testAdd();
		user4.testAdd();
	}

}
