package com.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Cat cat = (Cat)context.getBean("cat");
		System.out.println(cat.toString());
		
		Dog dog = (Dog)context.getBean("dog");
		System.out.println(dog.toString());
		
	}
	
}
