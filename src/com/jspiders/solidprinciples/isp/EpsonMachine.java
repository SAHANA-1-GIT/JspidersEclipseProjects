package com.jspiders.solidprinciples.isp;

public class EpsonMachine implements ScanMachine,PrintMachine,FaxMachine
{

	@Override
	public void fax() 
	{
		// TODO Auto-generated method stub
		System.out.println("scanning by epson machine...");
		
	}

	@Override
	public void Print() 
	{
		// TODO Auto-generated method stub
		System.out.println("printing by epson machine...");
		
	}

	@Override
	public void scan() 
	{
		// TODO Auto-generated method stub
		System.out.println("faxing by epson machine...");
		
	}

}
