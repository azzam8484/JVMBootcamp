package com.H2Demo.DBDemo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication {

	@Autowired
	private BookStore bookStore;

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);

	}

	@PostConstruct
	public void showBookDetails() {
		System.out.println(bookStore);
	}

}
