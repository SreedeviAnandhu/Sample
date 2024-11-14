package ExceptionHandling;

public class TestExpt {

	public static void main(String[] args) {
		
		int a =10;
		int b = 30;
		int c = a+b;
		
		try
		{
			int arr[]=new int[6];
			arr[8]=90;
			
			int result =5/0;
			System.out.println("In try block");
		}
		
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Array size is 6");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Division by zero is not possible");
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		
		finally{
			System.out.println("inside finally");
		}
		System.out.println("Rest of the code");


	}

}
