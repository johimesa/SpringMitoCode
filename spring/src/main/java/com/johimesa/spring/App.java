package com.johimesa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.johimesa.beans.AppConfig;
import com.johimesa.beans.AppConfig2;
import com.johimesa.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.register(AppConfig2.class);
		context.refresh();
		
		Mundo m = (Mundo)context.getBean("mundo2");
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)context).close();
	}

}
