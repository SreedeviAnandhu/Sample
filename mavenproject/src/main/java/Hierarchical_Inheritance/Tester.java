package Hierarchical_Inheritance;

public class Tester extends Employee {
	
	int id = 304;
	
	public void show()
	{
		System.out.println("Employee ID is : "+ id);
	}
	

	public static void main(String[] args) {
		
		Tester obj = new Tester();
		Developer obj = new Developer();
			obj.display();
			obj.show();
	}

}
