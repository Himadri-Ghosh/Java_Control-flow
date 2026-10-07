package com.kodewala.control.flow2;

public class Driver 
{
	public static void main(String args[])
	{
		
		Driver driver = new Driver();
		
		int day = Integer.parseInt(args[0]);
		
		driver.identifyDay(day);
	}
	
	public void identifyDay(int number)
	{
		switch (number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Teusday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Unknown numbers!!! Please give a correct number........");
			break;
		
		}
	}
}
