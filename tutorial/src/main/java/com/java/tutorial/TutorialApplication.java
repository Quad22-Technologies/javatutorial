package com.java.tutorial;

import com.java.tutorial.vehicles.Vehicles;
import com.java.tutorial.vehicles.VehiclesController;
import com.java.tutorial.vehicles.VehiclesRepository;
import com.java.tutorial.vehicles.VehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@SpringBootApplication
@ComponentScan(basePackageClasses={VehiclesController.class, VehiclesRepository.class, VehiclesService.class})
public class TutorialApplication {

	@Autowired
	private VehiclesService vehiclesService;
	public static void main(String[] args)  {
		SpringApplication.run(TutorialApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			// Create a new vehicle
			Vehicles vehicle1 = new Vehicles();
			vehicle1.setMake("Toyota");
			vehicle1.setModel("Corolla");
			vehicle1.setYear(2022);
			vehiclesService.createVehicle(vehicle1);

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
			UUID updatevehicleId = UUID.fromString("0f626bc1-5593-4638-968d-96ff726ca8dd");;
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
/*
System.out.println("Hello World");

		int age = 16;

		System.out.println("my age is: " + age);

		String grade = "B";

		System.out.println("My Grade is: " + grade);

		boolean istHot = true;

        System.out.println(istHot);

		//conditional state if-else
		if(age == 0)
		{
			System.out.print("Age: " + age + " Is grater than 0");
		}
		else if  (age == 16)
		{
			System.out.print("Age: " + age + " The condition is correct");
		}

		//Loops
		System.out.print("\nFOR LOOPS: ");
		for(int i = 0; i <=age; i++)
		{
			System.out.print("\nThe value of i :  " + i);
		}

		System.out.print("\nWhile LOOPS: ");
		int j = 1;
		while (j < 5)
		{
			System.out.print("\nIteration: " + j);
			j++;
		}

		System.out.print("\nMETHODS CALL: ");
		int sum  = addSum();

		double gpa = calculateGPA(4.0, 3.0, 2.0);
		System.out.print("\nthe GPA is : " + gpa);


		System.out.print("\nThe sum is : " + sum);

		System.out.print("\nWorking with objects: ");

		Cake c = new Cake();
		c.setFlavor("Strawberry");

        System.out.print("\nThe Cake flavor: " + c.getFlavor());




 */