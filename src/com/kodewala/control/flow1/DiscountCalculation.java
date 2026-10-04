package com.kodewala.control.flow1;

public class DiscountCalculation 
{
	public double discountPrice(int totalFare)
	{
		double finalPrice = totalFare;
		
		if(totalFare > 0 && totalFare <= 5000)
		{
			System.out.println("No discount applied.");
		}
		else if(totalFare >5000 && totalFare <= 10000)
		{
			System.out.println("Discount : " + (totalFare * 0.1));
			finalPrice = totalFare - (totalFare * 0.1);
		}
		else if(totalFare > 10000)
		{
			double discount = (totalFare * 0.15);
			if(discount > 1250)
			{
				finalPrice = totalFare - 1250;
				System.out.println("Maximum discount of the customer is 1250.");
			}
			else {
				finalPrice = totalFare - discount;
				System.out.println("Discount : " + discount);
			}
		}
		return finalPrice;
	}
}
