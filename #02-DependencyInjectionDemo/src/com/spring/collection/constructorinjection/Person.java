package com.spring.collection.constructorinjection;

import java.util.ArrayList;

public class Person {
	
	private double money;
	private Air air;
	private ArrayList<String> friends;

	public Person() {
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
}

