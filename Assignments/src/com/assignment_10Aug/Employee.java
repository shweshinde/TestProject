package com.assignment_10Aug;
//2. Create Employee class which has attributes (id, name, salary, dept, mydate)
//Where dept and mydate is class, dept has (dept_id, dept_name) And
//mydate has (day, month, year) Display Employee information
//(Note - Containment using constructor and getter/setter).

import java.util.Scanner;

public class Employee {
	private String eName;
	private Department d;
	private MyDate m;
	private int eId;
	private float eSalary;
	

	public void setEName(String eName)
	{
		this.eName= eName;
	}
	
	public String getEName()
	{
		return eName;
	}
	
	public void setDepartment( Department d)
	{
		this.d= d;
	}
	
	public Department getDepartment()
	{
		return d;
	}
	
	public void setMyDate(MyDate m)
	{
		this.m= m;
	}
	
	public MyDate getMyDate()
	{
		return m;
	}
	public void setEId(int eId)
	{
		this.eId= eId;
	}
	
	public int getEId()
	{
		return eId;
	}
	public void setESalary(float eSalary)
	{
		this.eSalary= eSalary;
	}
	
	public float getESalary()
	{
		return eSalary;
	}
	
	
}


