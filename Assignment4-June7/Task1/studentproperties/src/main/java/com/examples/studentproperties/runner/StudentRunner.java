package com.examples.studentproperties.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner{
	@Value("${my.info.student.name}")
	private String name;
	
	@Value("${my.info.student.roll_no}")
	private int roll_no;
	
	@Value("${my.info.student.course}")
	private String course;
	
	@Value("${my.info.student.trainer}")
	private String trainer;
	
	@Value("${my.info.student.duration}")
	private int duration;
	
	@Override
	public String toString() {
		return "StudentRunner [name = " + name + ", roll_no= " + roll_no + ", course = " + course + ", trainer= " + trainer + ", duration = " + duration +"]";
	}
	
	public void run(String...args) throws Exception {
		System.out.println(this);
	}
	
}
