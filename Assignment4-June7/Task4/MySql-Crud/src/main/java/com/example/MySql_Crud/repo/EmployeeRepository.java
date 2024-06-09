package com.example.MySql_Crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MySql_Crud.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
