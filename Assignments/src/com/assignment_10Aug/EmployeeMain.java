package com.assignment_10Aug;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String eName= sc.next();
		System.out.println("Enter Employee ID:");
		int eId= sc.nextInt();
		System.out.println("Enter Employee Salary:");
		float eSalary= sc.nextFloat();
		
		Employee e= new Employee();
		e.setEName(eName);
		e.setEId(eId);
		e.setESalary(eSalary);
		
		System.out.println("Enter Department ID:");
		int eDeptId= sc.nextInt();
		System.out.println("Enter Department Name:");
		String eDeptName= sc.next();
		
		Department d= new Department(eDeptId, eDeptName);
		e.setDepartment(d);
		e.getDepartment();
		
		System.out.println("Enter Day:");
		int day= sc.nextInt();
		System.out.println("Enter Month:");
		int month= sc.nextInt();
		System.out.println("Enter Year:");
		int year= sc.nextInt();		
	}
	


}
