package com.Assignment6Aug;

import java.util.Scanner;

public class PrimeNumber {
	public static void main( String[] args){
    System.out.println("The Prime Number in Between 300-400 are...:");
		int num= 400, count;
		for(int i=300; i<=num; i++)
		{
			count=0;
			for(int j=2; j<=i; i++)
			{
				if(i%j==0)
				{
					count=1;
					break;
				}
			}
			if (i>1 && count==0)
			{
				System.out.println("i");
		    }
		}
}
}
		
	

