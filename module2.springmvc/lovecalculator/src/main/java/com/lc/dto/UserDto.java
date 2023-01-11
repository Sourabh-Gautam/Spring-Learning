package com.lc.dto;

import javax.validation.constraints.NotBlank;

public class UserDto {
	
	@NotBlank(message = "Your name cannot be blank")
	private String yourName;
	
	@NotBlank(message = "Crsuh name cannot be blank")
	private String crushName;

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	@Override
	public String toString() {
		return crushName+ " "+yourName;
	}
	
}
