package com.assignment_13Aug;

import java.util.Scanner;

public class LaptopMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of USB Port:");
		int noOfUSBPort= sc.nextInt();
		System.out.println("Enter processor Speed:");
		int processorSpeed= sc.nextInt();
		
		
		Laptop p= new Laptop();
		p.setNoOfUSBPort(noOfUSBPort);
		p.getNoOfUSBPort();
		p.setProcessorSpeed(processorSpeed);
		p.getProcessorSpeed();	
	}
}
