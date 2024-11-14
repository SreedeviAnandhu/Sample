package Accessmodifier;

public class program1 {
	
	protected int a =10;
	
       protected void show() {
		 System.out.println("Inside Method "+a);
	}

	public static void main(String[] args) {
		
		program1 obj = new program1();
		obj.show();

	}

}
