package Abstraction;

public class contractor extends Employee {
	

	public void calculateSalary(int paymentperHours,int workingHours) {
		
		int c = paymentperHours*workingHours;
		System.out.println("The amount is : " +c);
		
	}
	

	public static void main(String[] args) {
	
		contractor c = new contractor();
		c.calculateSalary(2400,20);
		

	}

}
