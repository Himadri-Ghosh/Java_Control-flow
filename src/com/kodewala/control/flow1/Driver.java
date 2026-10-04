package com.kodewala.control.flow1;

public class Driver 
{
	public static void main(String args[])
	{
		TripPlanner planner = new TripPlanner();
		planner.suggestPlan("BLR", "GOA", 9300);
	}
}
