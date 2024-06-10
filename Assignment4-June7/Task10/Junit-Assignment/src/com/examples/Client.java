package com.examples;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Client {
	public static void main(String args[]) {
		System.out.print("Enter the batsmen name, runs scored and balls faced : ");
		Result result = JUnitCore.runClasses(StrikeRateTest.class);
		if (result.getFailureCount() == 0)
            System.out.println("There are No Failures...\n Test Passed...");
        else {
            for(Failure failure: result.getFailures()) {
                 System.out.println("The Test execution failed...\n" + failure.getMessage());
            }
        }
        System.out.println("Result " + result.wasSuccessful());
	}
}
