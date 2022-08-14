package com.assignment_13Aug;
//5. Create class IPLTeam with method play. Create child classes of IPLTeam
//called as CSK, RCB. In main, call play from child class objects.
//Compile time and Runtime polymorphism(Method Overloading method Overriding)

class IPLTeam {
	//public String cName= "M.S.Dhoni";
	//public String rName="Virat Kohali";
    public void play()
	{
		System.out.println("The IPL Teams which are playing...");
	}
class CSK extends IPLTeam{
	//super play()
	 String cName;
	 void CSK()
	 {
		 super.play();
		 String cName= "M.S.Dhoni";
		System.out.println("Captain of CSK Team is...:" +cName);
	}
class RCB extends IPLTeam{
	 String rName;
	  void RCB()
	{
		  String rName="Virat Kohali";
		System.out.println("Captain of RCB Team is...:" +rName);
		
	}
		
	}
public class Submain{
public void main(String[] args) {
	CSK c= new CSK();
	c.play();
	
}
	
}
	
}
}
