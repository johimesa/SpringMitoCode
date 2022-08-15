package com.johimesa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.johimesa.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/xml/beans.xml");
		/*
		Jugador p = (Jugador)context.getBean("messi");//referencia al bean por su id
		
		System.out.println(p.getName() + " - " + p.getTeam().show());*/
		
		IEquipo b = (IEquipo) context.getBean("juventus");
		System.out.println(b.show());
		
		((ConfigurableApplicationContext)context).close();
	}
}