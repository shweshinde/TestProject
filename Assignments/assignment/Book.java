package assignment;

import java.util.Scanner;

public class Book {
	Scanner sc= new Scanner(System.in);
	int bid, price;
	String bname, aname, rt;
	 
	void accept()
	{
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Book ID:");
		     bid= sc.nextInt();
		 System.out.println("Enter the Book Name:");
		   bname= sc.next();
		 System.out.println("Enter the Book Author Name:");
		   aname= sc.next();		
	}
	void show()
	{
		System.out.println("Enter the Book ID:" +bid);
		System.out.println("Enter the Book Name:"+bname);
		 System.out.println("Enter the Book Author Name:" +aname);
	}
	void rating()
	{   
		Scanner sc= new Scanner(System.in);
		System.out.println("Give Rating :: EXCELENT :: GOOG:: AVERAGE:: BAD");
		rt= sc.next();
		System.out.println("Book Rating::"  +rt);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk= new Book();
		bk.accept();
		bk.show();
		bk.rating();

	}

}
