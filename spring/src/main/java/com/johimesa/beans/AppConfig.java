package com.johimesa.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Mundo mundo() { //nombre método mundo, en el beans.xml era el id
		return new Mundo();
	}
	
}
