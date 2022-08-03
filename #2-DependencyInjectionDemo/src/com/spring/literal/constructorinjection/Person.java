package com.spring.literal.constructorinjection;

public class Person {
	
	private double money;

	public Person(double money) {
		this.money = money;
	}

	public void show() {
		System.out.println(this.money);
	}
	
}

