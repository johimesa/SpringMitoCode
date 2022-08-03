package com.johimesa.beans;

public class Persona {
	
	private int id;
	private String name;
	private String alias;
	
	private Pais paiss;
	
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

	public Pais getPaiss() {
		return paiss;
	}

	public void setPaiss(Pais paiss) {
		this.paiss = paiss;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", name=" + name + ", alias=" + alias + ", paiss=" + paiss + "]";
	}
}
