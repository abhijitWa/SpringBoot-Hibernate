package com.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHibernateDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateDbApplication.class, args);
		System.err.println("SpringBootHibernateDbApplication");
	}

}
