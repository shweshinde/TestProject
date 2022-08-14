package com.assignment_10Aug;
//6. Create a class named 'Rectangle' with two data members 'length' and
//'breadth' and two methods to print the area and perimeter of the rectangle
//respectively. Its constructor having parameters for length and breadth is
//used to initialize length and breadth of the rectangle. Let class 'Square'

//inherit the 'Rectangle' class with its constructor having a parameter for its
//side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
//Print the area and perimeter of a rectangle and a square.

	class Square
	{
		int side;
		
		public Square(int side)
		{
			this.side=side;
		}
		void area()
		{
			System.out.println("Area of Square is : "+(side*side));
			
		}
		void perimeter()
		{
			System.out.println("Perimeter of Square is : "+(side+side));
		}
	}

	public class Rectangle extends Square
	{
		int length;
		int breadth;
		
		public Rectangle(int length,int breadth) 
		{
			super(10);
			this.length=length;
			this.breadth=breadth;
		}

		
	 void area()
	 {
		 super.area();
		 
		 System.out.println("Area of Rectangle is : "+(length*breadth));
	 }
	 void perimeter()
	 {
		 super.perimeter();
		 System.out.println("Perimeter of Rectangle is : "+(length+breadth));
	 }
	 
		public static void main(String[]args)
		{
		
			Rectangle r=new Rectangle(20,30);
			r.area();
			r.perimeter();
		}
	}



