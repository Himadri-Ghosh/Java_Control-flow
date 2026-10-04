package com.kodewala.control.flow;

public class Booking 
{
	public void doBooking(String from, String to, int noOfPass)
	{
		String pnr = null;
		
		if(noOfPass > 6) 
			/**
			 * if true then only below code gets executed
			 */
		{
			System.err.println("As per IRCTC policy, only 6 passengeress are allowed");
		}
		else {
			pnr = "4398309234";
			System.out.println("Confirming the booking : " + pnr);
			System.out.println("Status :  CONFIRMED");
			System.out.println("SEAT : 29 B2");
		}
	}
}
