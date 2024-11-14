package Polymorphism;

public class Child extends Parent{
	
	public void sum(int a,int b) {
		int sum=a+b;
		System.out.println("Sum of child class is : " +sum);
		 super.sum(4,6);
		
	}

	public static void main(String[] args) {
	
		Child obj = new Child();
		obj.sum(2,4);
	
		
		Parent p = new Child(); //up casting
	    p.sum(2, 2);
	
	}

}
