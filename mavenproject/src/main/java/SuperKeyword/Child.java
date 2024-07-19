package SuperKeyword;

public class Child extends Parent{
	int num=2;
	public void show() {
		super.show();
		
		System.out.println("child class Method");
		System.out.println(num);
		System.out.println(super.num);
	}
	public Child(int a,int b) { 
		super(6,8);
		super.display();
		System.out.println(a+b);
		System.out.println("Child Constructor"); 
	}

	
	public static void main(String[] args) {
		Child c = new Child(2,4);
		c.show();
		

	}

}
