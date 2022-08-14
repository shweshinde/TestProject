package com.assignment_13Aug;
//6)    WAP to create a class Kid with method readBook() and another method
//readBook () with 2 parameters. The method readBook here is over-loaded.

class Kid {
	 static void readBook(String Chava)
	{
		System.out.println("Book:" +Chava);
		
	}
	 static void readBook(int C)
	{
		System.out.println("The Book I had read:" +C);
		
	}
	 void readBook(String Sambhaji, String Mrutunjay)
	{
		System.out.println("Book:" +Sambhaji);
		System.out.println("Book:" +Mrutunjay);
		
	}
	public static void main(String[] args) {
           /* Kid k=new Kid();
			k.Book();
			k.Book(2);
			k.Book();*/
		readBook("Chava");
		readBook(3);
		readBook("Sambhaji");
		readBook("Mrutunjay");
}
}