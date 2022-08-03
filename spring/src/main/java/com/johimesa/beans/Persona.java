package com.johimesa.beans;

public class Persona {
	
	private int id;
	private String name;
	private String alias;
	
	public Persona(int id, String name, String alias) {
		this.id = id;
		this.name = name;
		this.alias = alias;
	}
	
	public Persona(int id) {
		this.id = id;
	}
	
	public Persona(String alias) {
		this.alias = alias;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", name=" + name + ", alias=" + alias + "]";
	}
}
