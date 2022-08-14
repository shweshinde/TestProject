package com.Assignment6Aug;

import java.util.Scanner;

public class Pattern {
	public static void main( String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Rows:");
	int i,j;
	int r= sc.nextInt();
	
		for(i=1; i<=r; r++)
	{
		System.out.print("*");
		for(j=1; j<=1; j++)
		{
			System.out.print(j);
		}
		for(j=i-1; j>=1; j--)
		{
			System.out.println(j);
		}
		System.out.println("*");
		System.out.println("/n");
	 }
	for(j=1; j<=i; j++)
	{
		System.out.print(j);
	}
	for(j=i-1; j>=1; j--)
	{
		System.out.println(j);
	}
	System.out.println("*");
	System.out.println("/n");

}
}

