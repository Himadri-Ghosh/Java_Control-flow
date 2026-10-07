package com.kodewala.control.flow2;

public class Ecommerce {
	
	double totalAmount;
	static double discount;

	public static void main(String[] args) {
		
		String type = args[0];
		
		int amount = Integer.parseInt(args[1]);
		
		Ecommerce ecom = new Ecommerce();
		
		if(amount < 1000) {
			discount = ecom.discountInType(amount, type);
		}
		ecom.discountWithAmount(amount);
		
	}
	
	public double discountInType(int amount, String customerType)
	{
		switch (customerType) {
		case "Gold":
				discount = amount * 0.2; 
			break;
		case "Silver":
			discount = amount * 0.15; 
			break;
		case "Regular":
			discount = amount * 0.05; 
			break;

		default:
			System.out.println("Write a valid.");
			break;
		}
		return discount;
		
	}
	
	public void discountWithAmount(int amount)
	{
		totalAmount = amount;
//		discount = discountInType(amount, type);
		
		if(amount < 0) {
			System.out.println("Negative amount not allowed");
		}
		else if(amount > 0 && amount <= 1000) {
			System.out.println("You need to buy more than 1000");
			discount = 0;
			totalAmount = amount;
			System.out.println("Total Amount : " + totalAmount);
			System.out.println("Discount : " + discount);
		}
		else if(amount > 1000) {
			if(discount > 2500) {
				discount = 2500;
				totalAmount = amount - discount;
				System.out.println("Total Amount : " + totalAmount);
				System.out.println("Discount : " + discount);
			}
			else {
				totalAmount = amount - discount;
				System.out.println("Discount : " + discount);
				System.out.println("Total Amount : " + totalAmount);
			}
		}
	}

}
