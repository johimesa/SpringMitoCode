package com.johimesa.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	
	@Value("Hola Mundo desde Anotaciones!")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
}
