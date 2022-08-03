package com.xml.autowiring;

public class Person {
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.println("Heart is not pumping!");
		}
	}
}
