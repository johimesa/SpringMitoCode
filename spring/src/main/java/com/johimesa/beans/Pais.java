package com.johimesa.beans;

public class Pais {
	
	private String name;
	
	private Ciudad city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ciudad getCity() {
		return city;
	}

	public void setCity(Ciudad city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Pais [name=" + name + ", city=" + city + "]";
	}
}
