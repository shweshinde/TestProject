package com.assignment_13Aug;
//3. Write 3 programs for hierarchical inheritance
public class Hierarchical {
	class A {
	    public void print_A()
	    { 
	    	System.out.println("Class A"); 
	    }
	}
	  
	class B extends A {
	    public void print_B()
	    { 
	    	System.out.println("Class B");
	    }
	}
	  
	class C extends A {
	    public void print_C() 
	    {
	    	System.out.println("Class C");
	    }
	}
	  
	class D extends A {
	    public void print_D() 
	    { 
	    	System.out.println("Class D");
	    }
	}
	  
	// Driver Class
	public class Test {
	    public void main(String[] args)
	    {
	        B obj_B = new B();
	        obj_B.print_A();
	        obj_B.print_B();
	  
	        C obj_C = new C();
	        obj_C.print_A();
	        obj_C.print_C();
	  
	        D obj_D = new D();
	        obj_D.print_A();
	        obj_D.print_D();
	    }
	}
	

		private int i=10;
		int j=20;
		protected int k=30;
		public int m=40;
		
	}

class A{
	void display()
	{
		Hierarchical h= new Hierarchical();
		//System.out.println(ad.i);
		System.out.println(h.j);
		System.out.println(h.k);
		System.out.println(h.m);
	}
	}

class B extends Hierarchical{
	void display()
	{
		Hierarchical h= new Hierarchical();
		//System.out.println(ad.i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}

