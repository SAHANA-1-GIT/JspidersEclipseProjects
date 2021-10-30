package com.jspiders.solidprinciples.isp;

public class Mainclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HpMachine hp=new HpMachine();
		hp.scan();
		CanonMachine canon=new CanonMachine();
		canon.scan();
		canon.Print();
		EpsonMachine epson=new EpsonMachine();
		epson.scan();
		epson.Print();
		epson.fax();

	}

}
