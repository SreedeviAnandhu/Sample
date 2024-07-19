package inheritance;

public class car extends vehicle {
	
	String colour = "red";
	public void show() {
		System.out.println("colour of car is : " +colour);
	}
	
	public static void main(String[] args) {
		
		car obj = new car();
		obj.show();
		obj.display();
		System.out.println(obj.colour);
		System.out.println(obj.speed);
		
		
	}

	
	
	
}
