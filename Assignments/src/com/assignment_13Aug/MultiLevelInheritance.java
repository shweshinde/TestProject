package com.assignment_13Aug;
//2. Write 3 programs for multilevel inheritance.
public class MultiLevelInheritance {

	
//1
class one {
	    public void printHello()
	    {
	        System.out.println("Hello");
	    }
	}
	  
class two extends one {
	    public void printGoodMorning() 
	    { 
	    	System.out.println("GoodMorning");
	    }
	}
	  
class three extends two {
	    public void printHowAreYou()
	    {
	        System.out.println("HowAreYou");
	    }
	}

	public class Main {
	    public void main(String[] args)
	    {
	        three m = new three();
	        m.printHello();
	        m.printGoodMorning();
	        m.printHowAreYou();
	    }
	}

//2

	
		private int i=10;
		int j=20;
		protected int k=30;
		public int s=40;	
class A{
	
void display()
{
	MultiLevelInheritance m= new MultiLevelInheritance();
	//System.out.println(ad.i);
	System.out.println(m.j);
	System.out.println(m.k);
	System.out.println(m.s);
}
}

class B extends A{
void display()
{
	MultiLevelInheritance m= new MultiLevelInheritance();
	//System.out.println(ad.i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(s);
}
}
class c extends B{
void display()
{
	MultiLevelInheritance m= new MultiLevelInheritance();
	//System.out.println(ad.i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(s);
}
}
}
