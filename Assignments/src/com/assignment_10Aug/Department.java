package com.assignment_10Aug;

public class Department {
	int eDeptId;
	String eDeptName;
	
	public Department(int eDeptId, String eDeptName)
	{
		this.eDeptId=eDeptId;
		this.eDeptName=eDeptName;
	}
	public void show()
	{
		System.out.println("Department ID is..:" +eDeptId);
		System.out.println("Department Name is..:"+eDeptName);
	}
	

}
