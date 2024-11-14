package Interface;

public class ClassSample implements InterfaceSample{
	
	public void display() {
		System.out.println("implementation -1");
	}
	
	public void print() {
		System.out.println("implementation -2");
	}
	
	public void sum(int a,int b) {
		
		System.out.println("sum is : "+a+b);
	}
	

	public static void main(String[] args) {
		InterfaceSample obj = new ClassSample(); //upcasting
		ClassSample ob = new ClassSample();
		obj.display();
		obj.print();
		ob.sum(5,5);
		ob.display();
		ob.print();
		
		

	}

}
