package DivisibleBy10;

public class program2 extends program1 {
	
	public void display(int a,int b) {
		
		int result=super.sum(a,b);
		
		if(result%10==0) {
			System.out.println("Divisible by 10");
		}
		else {
			System.out.println("Not Divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		
		program2 obj = new program2();
		obj.display(2,4);
	}

}
