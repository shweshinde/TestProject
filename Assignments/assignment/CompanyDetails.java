
package assignment;
class Brand{
	static String companyName;
	int numofBrand;
	String name;
	String size;
	
	public Brand(int numofBrand, String name, String size)
	{
		this.numofBrand= numofBrand;
		this.name= name;
		this.size=size;
	}
	
	void display()
	{
		System.out.println(companyName+" "+numofBrand+" "+name+" "+size);
	}
	
}
public class CompanyDetails{
	public static void main(String[]args)
	{
		Brand.companyName="Puma";
		System.out.println(Brand.companyName);
	    Brand b= new Brand (1,"Shose", "7");
	    b.display();
	    Brand b1= new Brand (2,"Bag", "Travelling");
	    b1.display();
	}
}