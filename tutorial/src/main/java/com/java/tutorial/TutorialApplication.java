package com.java.tutorial;

<<<<<<< Updated upstream
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.java.tutorial.vehicles.Vehicles;
import com.java.tutorial.vehicles.VehiclesController;
import com.java.tutorial.vehicles.VehiclesRepository;
import com.java.tutorial.vehicles.VehiclesService;
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
	public void printIngredients(Cake cake)
	{
		System.out.print("\nIngredients for the Cake : ");
=======
	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			// Create a new vehicle
			Vehicles vehicle1 = new Vehicles();
			vehicle1.setMake("Jeep");
			vehicle1.setModel("Hummer");
			vehicle1.setYear(2016);
			vehiclesService.createVehicle(vehicle1);

			Vehicles vehicle2 = new Vehicles();
			vehicle2.setMake("BMW");
			vehicle2.setModel("Mitsubishi");
			vehicle2.setYear(2012);
			vehiclesService.createVehicle(vehicle2);

			Vehicles vehicle3 = new Vehicles();
			vehicle3.setMake("Chevrolet");
			vehicle3.setModel("Ram");
			vehicle3.setYear(2012);
			vehiclesService.createVehicle(vehicle3);

			// Retrieve all vehicles and send to a list
			List<Vehicles> allVehicles = vehiclesService.getAllVehicles();

			// Print out the values
			System.out.println("All Vehicles:");
			for (Vehicles vehicle : allVehicles) {
				System.out.println("Vehicle ID: " + vehicle.getVehicleid());
				System.out.println("Make: " + vehicle.getMake());
				System.out.println("Model: " + vehicle.getModel());
				System.out.println("Year: " + vehicle.getYear());
				System.out.println("-----");
			}

			// Retrieve a vehicle by ID
			UUID vehicleId = UUID.fromString("0f626bc1-5593-4638-968d-96ff726ca8dd"); //use your own Vehicle ID
			System.out.println("Vehicle with ID: " + vehicleId);
			Optional<Vehicles> vehicleOpt = vehiclesService.getVehicleById(vehicleId);
			if (vehicleOpt.isPresent()) {
				Vehicles vehicle = vehicleOpt.get();
				System.out.println("Vehicle ID: " + vehicle.getVehicleid());
				System.out.println("Make: " + vehicle.getMake());
				System.out.println("Model: " + vehicle.getModel());
				System.out.println("Year: " + vehicle.getYear());
			} else {
				System.out.println("Vehicle not found.");
			}

			// Update the vehicle
			UUID updatevehicleId = UUID.fromString("0f626bc1-5593-4638-968d-96ff726ca8dd");
			Optional<Vehicles> updatevehicleOpt = vehiclesService.getVehicleById(updatevehicleId);
			if (vehicleOpt.isPresent()) {
				Vehicles vehicleToUpdate = updatevehicleOpt.get();
				vehicleToUpdate.setModel("Updated Model");
				vehiclesService.updateVehicle(vehicleToUpdate);
				System.out.println("Updated Vehicle:");
				vehiclesService.getVehicleById(updatevehicleId).ifPresent(System.out::println);
			} else {
				System.out.println("Vehicle not found for update.");
			}

			// Delete the vehicle
			/*vehiclesService.deleteVehicle(vehicleId);
			System.out.println("Vehicle Deleted. Remaining Vehicles:");
			vehiclesService.getAllVehicles().forEach(System.out::println);

			 */
		};
>>>>>>> Stashed changes
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
