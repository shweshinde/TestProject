package com.assignment_13Aug;
//1. Write 3 programs for single inheritance.


//1
class SingleInheritance {
	class Tv{
	String Smart_Tv;
	}
	
	class Soney extends Tv
	{
		String App_Store;
	
	
	public void main(String[] args)
	{
		Soney s= new Soney();
		System.out.println("Soney TV is..:" +Smart_Tv);
		System.out.println("Soney TV has..:" +App_Store);
	}
	}
}

//2

class Company
{
	String Employee;
	String Worker;
}

class Division extends Company
{
	int eNo=25;
	int wNo=10;
	int total;
	
	public void main (String[] args)
	{
		 total= eNo+wNo;
		System.out.println("Total Number of People is..:" +total);
	}
}

//3

class School
{
	int s_fee= 1000;
	
}

class Goverment extends School
{
	int g_fee= 500;
	
	public void main (String[]args)
	{
		System.out.println("School fee is..:"+s_fee);
		System.out.println("Total Government School fee is..:"+g_fee);
		
	}
}