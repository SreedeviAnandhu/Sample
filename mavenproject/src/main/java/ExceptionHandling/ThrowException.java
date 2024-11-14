package ExceptionHandling;

public class ThrowException {
	
	public void sum(int a,int b) {
		
		int sum =a+b;
		if(sum>50) {
			
			throw new NullPointerException("sum greater than 50");
		}
		else {
			System.out.println(sum);
		}
		
	}

	public static void main(String[] args) {
		ThrowException obj = new ThrowException();
		try {
		obj.sum(50, 60);
		}
		catch(NullPointerException e) {
			System.out.println("Exception handled");
		}
		
		System.out.println("Exception in prograss");

	}

}
