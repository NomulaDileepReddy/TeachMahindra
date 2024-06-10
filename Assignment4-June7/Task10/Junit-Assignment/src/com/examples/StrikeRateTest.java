package com.examples;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class StrikeRateTest {
	
	StrikeRateCalcu st;
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	int runs= sc.nextInt();
	int balls_faced = sc.nextInt();
	
	@Test
	public void calculate() {
		st = new StrikeRateCalcu(name, runs, balls_faced);
		double cal_value = st.strikeRate(runs, balls_faced);
		double act_value = (runs/balls_faced)*100;
		assertEquals(cal_value,act_value,1);
	}
}
