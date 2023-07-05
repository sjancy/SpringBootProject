package com.example.springboot.SpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootProjectApplication.class, args);
		
		Alien a=context.getBean(Alien.class);
		a.show();
		
		Alien a1=context.getBean(Alien.class);
		a1.show();

	}

}
