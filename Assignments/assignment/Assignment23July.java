package assignment;

import java.util.Scanner;

public class Assignment23July {
	int totalbill;
	int pizza;
	int puffs;
	int colddrinks;
	
	void accept()
	{
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter the Quantity of Pizza:");
		int pizza= sc.nextInt();
		 System.out.println("Enter the Quantity of Puffs:");
		int puffs= sc.nextInt();
		 System.out.println("Enter the Quantity of Colddrinks:");
		int colddrinks= sc.nextInt();
		
	}

	   void calculate()
		{
		   totalbill= (pizza*100)+ (puffs*20)+ (colddrinks*10);
	
		}
		void show()
		{
	     System.out.println("Bill Details:");
		 System.out.println("Quantity of Pizza:"+ pizza);
		 System.out.println("Quantity of Puffs:"+ pizza);
		 System.out.println("Quantity of Colddrink:"+colddrinks);
		 System.out.println("Total Bill:"+totalbill);
		
		 System.out.println(" ENJIOY THE SHOW!!!");
		}
		 
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
			
			Assignment23July r= new Assignment23July();
			r.accept();
			r.calculate();
			r.show();
			
			
			
				
			 

	}

}
