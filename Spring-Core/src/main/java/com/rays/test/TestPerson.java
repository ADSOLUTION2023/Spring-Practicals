package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("person.xml"));
		
		Person person = (Person) factory.getBean("person");
		
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		
		System.out.println("-------------------");
		
		Person person1 = (Person) factory.getBean("person");
		
		System.out.println(person1.getName());
		System.out.println(person1.getAddress());
		
	}

}
