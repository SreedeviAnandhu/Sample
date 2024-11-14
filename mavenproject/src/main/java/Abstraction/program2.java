package Abstraction;

public class program2 extends program1{
	
	public void display() {
		System.out.println("Abstract method implimented");
	}
	
	public void sum(int a,int b) {
		
		int sum = a+b;
		System.out.println("Sum is: "+sum);
	}

	public static void main(String[] args) {
		program2 obj = new program2();
		obj.display();
		obj.show();
		obj.sum(4, 6);

	}
}
