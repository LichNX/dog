package com.example.dog.dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApplication.class, args);
		System.out.println("hello dog!");
	}
}
