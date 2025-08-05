package com.Assignment.JPA2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Jpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);
	}

	@Bean
	CommandLineRunner initData(VehicleRepository repo) {
		return args -> {
			Car car = new Car();
			car.setBrand("Toyota");
			car.setNumberOfDoors(4);

			Bike bike = new Bike();
			bike.setBrand("Yamaha");
			bike.setHasCarrier(true);

			repo.save(car);
			repo.save(bike);
		};
	}

	@Bean
	CommandLineRunner insertData(EmployeeRepository repo) {
		return args -> {
			Salary salary = new Salary();
			salary.setBasicSalary(40000);
			salary.setBonusSalary(5000);
			salary.setTaxAmount(3000);
			salary.setSpecialAllowanceSalary(2000);

			Employee emp = new Employee();
			emp.setFirstName("John");
			emp.setLastName("Doe");
			emp.setAge(30);
			emp.setSalary(50000);
			emp.setSalaryyy(salary);

			repo.save(emp);
		};
	}


}
