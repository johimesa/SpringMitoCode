package com.johimesa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.johimesa.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/xml/beans.xml");
		
		Persona p = (Persona)context.getBean("persona");//referencia al bean por su id
		//Persona p = (Persona)context.getBean("personaBean");//referencia al bean por su name
		//Persona p = (Persona)context.getBean("personaAlias");//referencia al bean por su alias, donde en name va el id
		//sin el autowire -> ref implícita
		// autowire => byName (atributos), byType (valida la clase a la q pertenece el atributo x ej private Ciudad ciudad; 
		// no puede haber 2 del mismo tipo x ej. private Ciudad ciudad1; private Ciudad ciudad2;), contructor (se define un 
		// constructor con los parámetros
		p.setName("Hilario");
		p.setId(23);
		System.out.println(p);
		
		((ConfigurableApplicationContext)context).close();
	}
}