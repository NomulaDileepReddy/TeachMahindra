package com.examples;

public class StrikeRateCalcu {
	private String name;
	private int runs;
	private int balls_faced;

	
	public StrikeRateCalcu(String name, int runs, int balls_faced) {
		
		this.name = name;
		this.runs = runs;
		this.balls_faced = balls_faced;
	}
	
	public double strikeRate(int runs, int balls_faced) {
		double strike = (runs/balls_faced)*100;
		return strike;
	}
}
