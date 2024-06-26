package com.java.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
		System.out.println("Hello World");

		int age = 16;

		System.out.println("my age is " + age);

		float score = 97.0f;

		System.out.println("My score is " + score);

		String grade = "B";

		System.out.println("My grade is " + grade);

		boolean isHot = true;

		System.out.println(isHot);

		//conditional state if-else
		if(age == 0)
		{
			System.out.print("Age: " + age + " Is greater than 0");
		}
		else if(age == 16)
		{
			System.out.print("Age: " + age + " The condition is correct");
		}

		//Loops
		System.out.print("\nFOR LOOPS: ");
		for(int i = 0; i <= age; i++)
		{
			System.out.print("\nThe value of i: " + i);
		}
		System.out.print("\nWHILE LOOPS: ");
		int j = 1;
		while(j < 5)
		{
			System.out.print("\nIteration: " + j);
			j++;
		}
		System.out.println("\nMETHODS CALL: ");
		int sum = addSum();

		double gpa = calculateGPA(4.0, 3.0, 2.0);
		System.out.print("\n the GPA is : " + gpa);

		System.out.print("\nThe sum is : " + sum);

		System.out.print("\n Working with objects");

		Cake c = new Cake();
		c.setFlavor("Strawberry");

		System.out.print("\n The cake flavor: " + c.getFlavor());

		c.addIngredients("Flour");
		c.addIngredients("Sugar");
		c.addIngredients("eggs");
		c.addIngredients("Milk");
		c.addIngredients("Water");
/* 
		c.getIngredients();

		for(String ingredient : c.getIngredients())
		{
			System.out.print("-" + ingredient);
		}
*/
	}

	public void printIngredients(Cake cake)
	{
		System.out.print("\nIngredients for the Cake : ");
	}

	public static int addSum()
	{
		int a = 7;
		int b = 3;

		int total = a + b;
		return total;
	}

	public static double calculateGPA(double a, double b, double c)
	{
		double total = (a + b + c)/3;
		return total;
	}
}
