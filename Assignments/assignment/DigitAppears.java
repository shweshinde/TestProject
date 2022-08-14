package assignment;

import java.util.Scanner;

public class DigitAppears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Number:");
		Scanner sc=new Scanner(System.in);
		int num= sc.hashCode();
		System.out.println("Enter Digit:");
		int digit= sc.nextInt();
		int count=0;
		
		while(num>0)
		{
			int rem= num%10;
			if (rem==digit)
			{
				count++;
			}
			num/=10;
		}
		System.out.println(+digit+ "Appears" +count+ "Times");

	}

}
