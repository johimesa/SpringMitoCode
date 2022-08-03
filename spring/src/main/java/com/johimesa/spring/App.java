package com.johimesa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.johimesa.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/xml/beans.xml");
		
		Persona p = (Persona)context.getBean("persona");
		
		System.out.println(p);
		
		((ConfigurableApplicationContext)context).close();
	}

}
