package com.app.repo.impl;


import org.springframework.boot.CommandLineRunner;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;
	
	public void run(String...args) throws Exception {
		while(true) {
			System.out.println("1 FindAll");
			System.out.println("2 FindById");
			System.out.println("3 Insert");
			System.out.println("4 Delete");
			System.out.println("5 Update");
			System.out.println("6 Find Name by salary");
			System.out.println("7 Exit");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice : ");
			int ch=sc.nextInt();
			
			if(ch==1) {
				repo.findAll().forEach((System.out::println));
				System.out.println("Fetched all the Rows:");
			}
			else if(ch==2) {
				System.out.println("Enter Employee Id to find the details:");
				int id=sc.nextInt();
				
				
				Optional <Employee> employee=repo.findById(id);
				if(employee.isPresent()) {
					System.out.println(employee.get());
				}
				else {
					System.out.println("No Employee with id " + id);
				}
			}
			else if(ch==3) {
				System.out.print("Enter the Employee Id:");
				int id=sc.nextInt();
				System.out.print("Enter the Employee Name:");
				String name=sc.next();
				System.out.print("Enter the Employee Salary:");
				int salary=sc.nextInt();
				Optional <Employee> employee=repo.findById(id);
				if(employee.isPresent()) {
					System.out.println("Employee with id " + id + "already exist");
				}else {
					repo.save(new Employee(id,name,salary));
					System.out.println("Employee Details Saved Successfully!");
				}
			}else if(ch==4) {
				System.out.println("Enter the Employee id to delete:");
				int id=sc.nextInt();
				
				Optional <Employee> employee=repo.findById(id);
				if(employee.isPresent()) {
					repo.delete(employee.get());
					System.out.println("Employee Deleted Successfully");
				}else {
					System.out.println("No Employee with id " + id);
				}
			}else if(ch==5) {
				System.out.println("Enter the Employee id to update:");
				int id=sc.nextInt();
				
				Optional<Employee> employee = repo.findById(id);
				if(employee.isPresent()) {
					Employee emp=employee.get();
                    System.out.print("Enter the new Employee Name:");
                    String name=sc.next();
                    System.out.print("Enter the new Employee Salary:");
                    int salary=sc.nextInt();

                    emp.setName(name);
                    emp.setSalary(salary);

                    repo.save(emp);
                    System.out.println("Employee Details Updated Successfully!");
                }else {
                    System.out.println("No Employee with Id " + id);
                }
			}else if(ch==6) {
	        	System.out.println("Enter the Salary threshold to fetch Employee names:");
                int salary = sc.nextInt();
                List<String> employeeNames = repo.findNamesBySalaryGreaterThan(salary);
                if (!employeeNames.isEmpty()) {
                    employeeNames.forEach(System.out::println);
                } else {
                    System.out.println("No Employees with Salary greater than " + salary);
                }
	        }else if(ch==7) {
				System.out.println("Stopping the application.");
				break;
	        } else  {
	        	System.out.println("Invalid option. Please try again");
			}
			System.out.println();
		}
	}
}