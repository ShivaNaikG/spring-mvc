package com.jsp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
@ComponentScan(basePackages = "com.jsp")
public class MyConfig {
	@Bean
	public EntityManagerFactory entityManagerFactory()
	{
		return Persistence.createEntityManagerFactory("god");
	}

}
