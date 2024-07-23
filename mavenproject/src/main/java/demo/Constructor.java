package demo;

public class Constructor {
	
	public Constructor() {
		this("Sreedevi");
	}
	
	
	public Constructor(String name){
		 
		 System.out.println(name);
		
	}

	public static void main(String[] args) {
		
	 Constructor obj = new Constructor();
		
	}

}
