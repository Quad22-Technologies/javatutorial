package com.java.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
		System.out.println("Hello world");

		int age = 16;
		System.out.println("my age is " + age);

		String grade =  "B";
		System.out.println("My grade is " + grade);

		boolean isHot = true;
		System.out.println(isHot);

		if (age == 0)
		{
			System.out.println("Age: " + age +" is greater than 0");
		}
		else if (age == 16)
		{
			System.out.println("Age: " + age +" The condition is correct");
		}

		System.out.println("\nFOR LOOPS: ");
		for(int i = 0; i <= age; i++)
		{
			System.out.println("The value of i: " + i);
		}

		System.out.println("\nWhile LOOPS: ");
		int j = 1;
		while (j < 5)
		{
			System.out.println("\nIteration " + j);
			j++;
		}

		
		System.out.println("\nWorking with objects: ");

		Cake c = new Cake();
		c.setFlavor("strawberry");

		System.out.print("\nThe cake Flavor: " + c.getFlavor());

		c.addIngredients("Flour");
		c.addIngredients("Sugar");
		c.addIngredients("Eggs");
		c.addIngredients("Milk");
		c.addIngredients("Water");

		c.printIngredients();

		System.out.println("\nMETHODS CALL: ");
		int sum = addSum();
		double gpa = calculateGPA(4.0,3.0, 2.0);
		System.out.println("\nThe GPA is: " + gpa);
		


	}

	

	public static int addSum()
		{
			int a = 7;
			int b = 3;

			int total = a + b;
			return total;
		}
	

		public static double calculateGPA(double a, double b, double c )
		{

			double total = (a + b + c) / 3;
			return total;
		}
	

}
