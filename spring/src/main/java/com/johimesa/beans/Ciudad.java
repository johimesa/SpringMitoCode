package com.johimesa.beans;

public class Ciudad {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ciudad [name=" + name + "]";
	}
}
