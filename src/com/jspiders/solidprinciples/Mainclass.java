package com.jspiders.solidprinciples;

public class Mainclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(105,"sahana",35000.75);
		EmployeeDelete e2=new EmployeeDelete();
		EmployeeInsert e3=new EmployeeInsert();
		EmployeeUpdate e4=new EmployeeUpdate();
		e2.deleteemployee();
		e3.insertEmployee();
		e4.updateemployee();
		
	}

}
