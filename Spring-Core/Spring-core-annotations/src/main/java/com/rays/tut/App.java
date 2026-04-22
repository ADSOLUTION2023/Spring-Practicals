package com.rays.tut;

import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started....!");
		Configuration cfg = (Configuration) new Configuration().configure().buildSessionFactory();
		
		
		
	}

}
