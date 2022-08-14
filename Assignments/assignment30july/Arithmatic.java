package assignment30july;

class Arithmatic {
	    int a;
		int b;
		int c;
		
		int addition(int a,int b)
		{
			c=a+b;
			return c;
		}
		int substraction(int a,int b)
		{
			c=a-b;
			return c;
		}
		int multiplication(int a,int b)
		{
			c=a*b;
			return c;
		}
		int division(int a,int b)
		{
			c=a/b;
			return c;
		}

		public static void main(String[] args) 
		{
			Arithmatic a=new Arithmatic();
			
			System.out.println("Addition is : "+a.addition(10, 5));
			System.out.println("Sustraction is : "+a.substraction(10,5));
			System.out.println("Multiplication is : "+a.multiplication(10, 5));
			System.out.println("Division is : "+a.division(10, 5));

		}

	}



	