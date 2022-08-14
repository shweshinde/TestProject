package com.assignment_10Aug;

public class PersonMain {
	public void display()
	{
		System.out.println("Person Id Is "+getId());
		System.out.println("Person Name Is "+getName());
	}
	
	
	public static void main(String []args)
	{
		Person p=new Person();
		Job j=new Job(101, "Mishty",null);
	}


}
