package com.assignment_10Aug;

import java.util.Scanner;

// WAP to have Student class has roll, name and Department object should
//have id and name. Assign and print individual values in main method
//(Note - Containment using constructor and getter/setter).


public class Student {
	private int sRollNo;
	private String sName;
	private String sDept;
	
	public void setSRollNo(int sRollNo)
	{
		this.sRollNo= sRollNo;
	}
	
	public int getSRollNo()
	{
		return sRollNo;
	}
	
	public void setSName(String sName)
	{
		this.sName= sName;
	}
	
	public String getSName()
	{
		return sName;
	}
	
	public void setSDept(String sDept)
	{
		this.sDept= sDept;
	}
	
	public String getSDept()
	{
		return sDept;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String sName= sc.next();
		System.out.println("Enter Student Roll Number:");
		int sRollNo= sc.nextInt();
		
		Student s= new Student();
		s.setSName(sName);
		s.setSRollNo(sRollNo);
		
		System.out.println(s.getSName());
		System.out.println(s.getSRollNo());
		
	}
	

}
