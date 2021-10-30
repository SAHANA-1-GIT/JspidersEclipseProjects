package com.jspiders.solidprinciples.ocp;

public class Mainclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer customer=new HomeLoanCustomer();
		double discount=DiscountCalculator.isCustomerLoyal(customer);
		System.out.println(discount);
		
		//Customer customer=new EducationalLoanCustomer();
		//double discount=DiscountCalculator.isCustomerLoyal(customer);
		//System.out.println(discount);
		
		//Customer customer=new GoladLoanCustomer();
		//double discount=DiscountCalculator.isCustomerLoyal(customer);
		//System.out.println(discount);
		
		//Customer customer=new VehicleLoanCustomer();
		//double discount=DiscountCalculator.isCustomerLoyal(customer);
		//System.out.println(discount);
		
		

	}

}
  