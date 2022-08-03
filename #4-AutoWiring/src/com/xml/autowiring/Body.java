package com.xml.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/autowiring/config.xml");
		Person person = context.getBean("person", Person.class);
		person.startPumping();
	}

}
