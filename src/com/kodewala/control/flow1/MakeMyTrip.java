package com.kodewala.control.flow1;

public class MakeMyTrip 
{
	public static void main(String args[])
	{
		DiscountCalculation discount = new DiscountCalculation();
		double finalprice = discount.discountPrice(22000);
		System.out.println("Final Price is : " + finalprice);
	}
}
