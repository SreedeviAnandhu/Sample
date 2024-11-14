package MultipleInheritance;

public class MultipleInheritance implements MultipleSample, MultiSample2  {


	@Override
	public void show() {
		
		System.out.println("sree");
		
	}

	@Override
	public void display() {
		
		System.out.println("abc");
		
	}

	public static void main(String[] args) {
		
		MultipleInheritance obj = new MultipleInheritance();
		obj.show();
		obj.display();
	}
}
