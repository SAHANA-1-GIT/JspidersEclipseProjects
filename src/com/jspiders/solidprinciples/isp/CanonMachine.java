package com.jspiders.solidprinciples.isp;

public class CanonMachine implements ScanMachine, PrintMachine 
{

	@Override
	public void Print() 
	{
		// TODO Auto-generated method stub
		System.out.println("scanning by canon mavhine..");
		
	}

	@Override
	public void scan() 
	{
		// TODO Auto-generated method stub
		System.out.println("printing by canon machine...");
		
	}

}
