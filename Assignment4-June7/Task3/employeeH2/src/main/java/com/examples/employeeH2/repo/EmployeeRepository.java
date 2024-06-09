package com.examples.employeeH2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examples.employeeH2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
}
