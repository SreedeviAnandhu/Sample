package review;

public class interfaceSaample2 implements interfacesample {
	
	
	public void display() {
		System.out.println("hello java");
	}
	
	public void show() {
		System.out.println("richuz");
	}
	
	public static void main(String[] args) {
		
		interfacesample obj = new interfaceSaample2(); 
		obj.display();
	    obj.print();
		
		interfaceSaample2 obj2 = new interfaceSaample2();
			obj2.show();

		
	}
}
	