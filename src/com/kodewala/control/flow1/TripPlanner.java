package com.kodewala.control.flow1;

public class TripPlanner 
{
	public String suggestPlan(String src, String dest, int budget) {
		String suggetion;
		if(budget <= 1000)
		{
			suggetion = "You can be in home only!!!";
			System.out.println(suggetion);
		}
		else if(budget > 1000 && budget <= 3000)
		{
			suggetion = "You can visit with in the city like Lal Bug etc... or you can watch movie near by";
			System.out.println(suggetion);
		}
		else if(budget > 3000 && budget <=5000)
		{
			suggetion = "You can hire a taxi and visit near by places like mysore etc....";
			System.out.println(suggetion);
		}
		else 
		{
			suggetion = "You can visit goa!!";
			System.out.println(suggetion);
		}
		
		return suggetion;
	}
}
