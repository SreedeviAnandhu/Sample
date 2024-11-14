package java_Refresh;

public class JavaVariables {
	
	int a = 10;
	static int b = 20;
	
	public void display() {
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		int c = 30;
		System.out.println(b);
		System.out.println(c);
		
		JavaVariables obj = new JavaVariables();
		obj.display();
		
	}
	
}
 