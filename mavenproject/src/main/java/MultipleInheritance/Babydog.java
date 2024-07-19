package MultipleInheritance;

public class Babydog extends Dog {
	
	String breed = "Pomerian";
	
	public void print() {
		System.out.println("breed of a babydog is : " + breed);
	}

	public static void main(String[] args) {
		Babydog obj = new Babydog();
		obj.display();
		obj.show();
		obj.print();

	}

}
