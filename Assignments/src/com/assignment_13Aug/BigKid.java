package com.assignment_13Aug;
//Create a class BigKid which extends Kid created above and Implement
//readBook() differently in BigKid class. Here the method readBook() has
//been over-ridden in the child class BigKid().

class BigKid{
 void readBook(String Chava)
	{
		System.out.println("Book:" +Chava);
		
	}
class Kid extends BigKid
{
    void readBook(String Chava)
	{
		super.readBook(Chava);
		System.out.println("Book:" +Chava);
		
	}
    
public class BigKids{
public  void main(String[] args) {
			/*Kid k=new Kid();
			k.readBook();*/
		//specialization	
			BigKid b;
			b=new Kid();
			b.readBook("Chava");
			
			
	
}
}
}
}

