package com.telefonica.jee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.telefonica.jee.beans.HelloWorld;

@Configuration //Esta anotacion indica que esta clase contiene configuracion de Beans
public class JavaConfiguration {
	
	@Bean // Esta anotacion permite la creacion de un Bean
	public String someDummyBean1() {
		return "someDummyBean1";
	}
	
	@Bean
	public String someDummyBean2() {
		return "someDummyBean2";
	}
	
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
