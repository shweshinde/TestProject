package assignment30july;


	public class Square 
	{
		int a;
		int squr;
		
		void accept(int a)
		{
			this.a=a;
		}
		void display()
		{
			squr=a*a;
			System.out.println("Square is with no return no Parameter Passing : "+squr);
		}
		int with_return()
		{
			squr=a*a;
			return squr;
		}
		void parameter(int a)
		{
			squr=a*a;
			System.out.println("Square Is With no Return Type with Parametr Passing is : "+squr);
		}
		int square(int a)
		{
			squr=a*a;
			return squr;
		}

		public static void main(String[] args) 
		{
			Square s=new Square();
			s.accept(10);
			s.display();	

	    }

}





