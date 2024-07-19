package Hierarchical_Inheritance;

public class Developer extends Employee {
	 
	String position = "Python Developer";

	public void print()
	{
		System.out.println("Employee position is : "+ position);
	}
	public static void main(String[] args) {
		
		Developer obj1 = new Developer();
		obj1.display();
		obj1.print();
		
	}

}
