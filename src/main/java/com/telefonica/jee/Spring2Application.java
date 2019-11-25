package com.telefonica.jee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telefonica.jee.beans.HelloWorld;

/**
 * En esta aplicacion tenemos 2 tipos de configuraciones: XML y mediante lenguaje java
 * 
 * @author alan.sastre
 */
@SpringBootApplication
public class Spring2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring2Application.class, args);

		// Los beans vienen de XmlConfiguration.java (applicationContext.xml) y
		// JavaConfiguration.java
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}

		System.out.println("========================");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		System.out.println("========================");
	}

}
