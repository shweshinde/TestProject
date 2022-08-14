package assignment30july;

public class Student {
	String name;
	int id;
	
	void display()
	{
		System.out.println(" Enter the Student Name:"+ name);
		System.out.println(" Enter the Student ID:" +id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.display("Mishty, 01234567890");
		s.display();

	}

}
