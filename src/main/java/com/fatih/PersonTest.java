package com.fatih;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpEL.xml");
		Person person=context.getBean("personId" , Person.class);
		System.out.println(person);
		((ClassPathXmlApplicationContext)context).close();
	}

}
