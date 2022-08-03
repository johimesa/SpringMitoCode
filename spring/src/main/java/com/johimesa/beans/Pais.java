package com.johimesa.beans;

import java.util.List;

public class Pais {
	
	private String name;
	
	private List<Ciudad> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ciudad> getCities() {
		return cities;
	}

	public void setCities(List<Ciudad> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Pais [name=" + name + ", cities=" + cities + "]";
	}
}
