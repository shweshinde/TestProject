package com.assignment_10Aug;
//Create Person class with fields(id,name,job) where job is another class with
//field(jobid,profile,joiningdate) where joiningdate is another class with fields
//(day, month, year) Display Person information (Note - Containment using
//constructor and getter/setter).

public class Person {
	private int id;
	private String name;
	private Job j;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Job getJob() 
	{
		return j;
	}
	public void setJob (Job j)
	{
		this.j = j;
	}
	
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
     
