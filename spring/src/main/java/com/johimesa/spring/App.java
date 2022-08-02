package com.johimesa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.johimesa.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/xml/beans.xml");

		Mundo m = (Mundo)context.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)context).close();
	}

}
