package com.java.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
		System.out.println("HELLO WORLD");
		
		int age = 16;
		{
		System.out.println("my age is: " + age);
	}
		


	
