package assignment30july;

import java.util.Scanner;

class GuessNumber {
	public static void main (String[] args){
		System.out.println("Welcome to the Nyumber Guessing Game:");
		System.out.println("Number is in Between 1 to 100:");
		Scanner sc= new Scanner(System.in);
		
	int num=5;
	int att= 0;
	for(int i=1; ; i++)
	{
		System.out.println("Guess The Number:");
		int no=sc.nextInt();
		
		if(num== no)
		{
			System.out.println("Congradulation!!" +" You guess the Number");
			break;
		}
		else if(num>no )
		{
			System.out.println("The number is greater than" +no);
		}
		else if (num<no)
		{
			System.out.println("The Number is lesser than" +no);
		}
		
		att= att+1;
		
	}
	System.out.println("Your Attempt is:" +att);

	
	}

}
