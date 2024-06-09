package com.example.cmd_line_argument;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmdLineArgumentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmdLineArgumentApplication.class, args);
		System.out.println("Extractied the values from arguments.");
	}

}
