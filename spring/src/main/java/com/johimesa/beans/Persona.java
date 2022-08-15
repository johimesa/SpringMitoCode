package com.johimesa.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Persona implements InitializingBean, DisposableBean {
	
	private int id;
	private String name;
	private String alias;
	
	private Pais paiss;
	private Ciudad ciudad;
	
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

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", name=" + name + ", alias=" + alias + ", paiss=" + paiss + ", ciudad=" + ciudad
				+ "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Justo después de instanciar el bean Persona");
	}
	
	public void destroy() throws Exception {
		System.out.println("A punto de destruir el bean Persona");
	}
	
	
}
