package Interface;

public class Project3 implements Project1,Project2 {
	
	public void display(int a,int b) {
		
		int c = a+b;
		System.out.println(c);
		System.out.println("anu");
		
	}
	
	public void show(int a,int b) {
		
		int c = a+b;
		System.out.println(c);
		System.out.println("sree");
	}
	
	public void print() {
		
		System.out.println("SreedeviAnandhu");	
		//System.out.println("a = : "+ a);
		//System.out.println("b = : "+ b);
	}
	

	public static void main(String[] args) {
		
		Project3 obj = new Project3();
		obj.display(2,4);
		obj.show(6,8);
		obj.print();
		System.out.println("a = : "+ obj.a);
		System.out.println("b = : "+ obj.b);
		
		
		
		

	}

}
