package com.app.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	@Query("SELECT e.name FROM Employee e WHERE e.salary > :salary")
    List<String> findNamesBySalaryGreaterThan(@Param("salary") int salary);
}