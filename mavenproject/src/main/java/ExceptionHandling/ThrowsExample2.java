package ExceptionHandling;

import java.io.IOException;

public class ThrowsExample2 {
	
	public void show() throws IOException{
		
		throw new IOException();
	}

	public static void main(String[] args) throws IOException {
		ThrowsExample2  obj = new ThrowsExample2 ();
		obj.show();

	}

}
