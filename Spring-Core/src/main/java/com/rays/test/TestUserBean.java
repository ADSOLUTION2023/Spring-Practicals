package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestUserBean {
	public static void main(String[] args) {
		
		//Normal way
		
		UserBean bean = new UserBean();
		
		bean.setName("Rama");
		bean.setAddress("Bhopal");
		bean.setDob("12/10/1987");
		
		System.out.println(bean.getName());
		System.out.println(bean.getAddress());
		System.out.println(bean.getDob());
		System.out.println("----------------------------------");
		
		//Using Spring Container
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("user.xml"));
		
		UserBean user = (UserBean) factory.getBean("user");
		
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		System.out.println(user.getDob());
		
		System.out.println("----------------");
		
		UserBean user1 = (UserBean) factory.getBean("user");
		
		System.out.println(user1.getName());
		System.out.println(user1.getAddress());
		System.out.println(user1.getDob());
	}

}
