package com.test4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test4Application {

	int x=100;
	System.out.println("Hello World");
	public static void main(String[] args) {
		SpringApplication.run(Test4Application.class, args);
	}

}
