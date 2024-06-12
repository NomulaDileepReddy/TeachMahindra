package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer id;
	private String name;
	private Integer salary;
	
	public Employee() {
	}
	
	public Employee(Integer id) {
		this.id=id;
	}
	
	public Employee(String name,Integer salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public Employee(Integer id,String name,Integer salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void setid(Integer id) {
		this.id=id;
	}
	public Integer getid() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setSalary(Integer salary) {
		this.salary=salary;
	}
	public Integer getSalary() {
		return salary;
	}
	
	@Override
	  public String toString() {
		  return "Employee[id = " + id + ",Name = " + name + ",salary = " + salary + "]";
	  }
}