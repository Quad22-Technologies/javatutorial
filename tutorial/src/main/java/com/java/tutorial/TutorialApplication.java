package com.java.tutorial;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
		System.out.println("Hello World");

		int age = 16;

		System.out.println("my age is: " + age);

		String grade = "B";

		System.out.println("My Grade is: " + grade);

		boolean istHot = true;

        System.out.println(istHot);

		if(age == 0)
		{
			System.out.print("Age: " + age + " Is grater than 0");
		}
		else if  (age == 16)
		{
			System.out.print("Age: " + age + " The condition is correct");
		}

		for(int i = 0; i <=age; i++)
		{
			System.out.print("\nThe value of i :  " + i);
		}

		int j = 1;
		while (j < 5)
		{
			System.out.print("\nIteration: " + j);
			j++;
		}

		System.out.print("\nMETHODS CALL: ");
		int sum  = addSum();
        
		double gpa = calcGPA(4.0, 3.0, 2.0);
		System.out.print("\nthe GPA is : " + gpa);


		System.out.print("\nThe sum is : " + sum);

		System.out.print("\nWorking with objects: ");
        
		Cake c = new Cake();
		c.setFlavor("Strawberry");
   
        System.out.print("\nThe Cake flavor: " + c.getFlavor());

	}
	
	
	public static int addSum()
	{
		int a = 7;
		int b = 3;

		int total = a + b;
		return total;

	}

	public static double calceGPA(double a, double b, double c)
	{
		
		double total = (a + b + c)/3;
		return total;

	}


}
