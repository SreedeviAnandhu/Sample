package ExceptionHandling;

public class ThrowsExample1 {
	
	public void multi() throws NullPointerException {
		
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		ThrowsExample1 obj = new ThrowsExample1();
		obj.multi();
		
		
	}

}
