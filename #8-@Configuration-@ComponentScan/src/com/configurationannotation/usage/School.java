package com.configurationannotation.usage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class School {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		System.out.println("Object created ");
		Student stu = context.getBean("student", Student.class);
		System.out.println(stu);
	}

}
