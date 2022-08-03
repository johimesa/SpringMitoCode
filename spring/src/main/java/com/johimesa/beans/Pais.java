package com.johimesa.beans;

import java.util.List;

public class Pais {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pais [name=" + name + "]";
	}
}
