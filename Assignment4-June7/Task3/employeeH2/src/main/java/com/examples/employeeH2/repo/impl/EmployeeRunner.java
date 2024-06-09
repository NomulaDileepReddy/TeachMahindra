package com.examples.employeeH2.repo.impl;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Scanner;
import java.util.Optional;
import com.examples.employeeH2.repo.EmployeeRepository;
import com.examples.employeeH2.model.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public void run(String...args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. FetchAll");
		System.out.println("2. Insert");
		System.out.println("3. Delete");
		System.out.println("4. FindById");
		System.out.println("5. Update");
		System.out.print("Enter your choice : ");
		int ch = sc.nextInt();
		while(ch<=5) {
			try {
				
				if(ch==1) {
					System.out.println("Displaying the details ....");
					repo.findAll().forEach((System.out::println));
				}
				else if(ch==2) {
					System.out.print("Enter emp_id : ");
					int emp_id = sc.nextInt();
					System.out.print("Enter emp_name : ");
					String emp_name = sc.next();
					System.out.print("Enter emp_sal : ");
					int emp_sal = sc.nextInt();
					repo.save(new Employee(emp_id, emp_name, emp_sal));
					System.out.println("Employee saved succesfully.");
				}
				else if(ch==3) {
					System.out.print("Enter the emp_id to delete the particular row :");
					int emp_id = sc.nextInt();
					Optional <Employee> employee = repo.findById(emp_id);
					if(employee.isPresent()) {
						repo.delete(employee.get());
						System.out.println("Employee deleted successfully.");
					}else {
						System.out.println("Employee not found.");
					}
				}
				else if(ch==4) {
					System.out.print("Enter the emp_id to fetch :");
					int emp_id = sc.nextInt();
					Optional <Employee> employee = repo.findById(emp_id);
					if(employee.isPresent()) {
						System.out.println(employee);
					}else {
						System.out.println("No employee with the emp_id");
					}
				}
				else if(ch==5) {
					System.out.print("Enter emp_id to update : ");
					int emp_id = sc.nextInt();
					Optional <Employee> employee = repo.findById(emp_id);
					if(employee.isPresent()) {
						System.out.print("Enter the emp_id to update : ");
						int new_id = sc.nextInt();
						System.out.print("Enter the updated Employee name : ");
						String new_name = sc.next();
						System.out.print("Enter the updated salary : ");
						int new_sal = sc.nextInt();
						repo.save(new Employee(new_id, new_name, new_sal));
						System.out.println("Employee Updated...!");
					}else {
						System.out.println("There is no employee with the entered emp_id.");
					}
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("1. FetchAll");
			System.out.println("2. Insert");
			System.out.println("3. Delete");
			System.out.println("4. FindById");
			System.out.println("5. Update");
			System.out.print("Enter your choise : ");
			ch = sc.nextInt();

		}
	}
}
