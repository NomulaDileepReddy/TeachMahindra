package com.example.cmd_line_argument.runner;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdArgumentRunner implements CommandLineRunner{
	public void run(String...args) {
		System.out.println("Initialzed the Command Line Argument...");
		System.out.println("Captain is "+args[5]);
		System.out.println("Team India" +Arrays.asList(args));
	}
}
