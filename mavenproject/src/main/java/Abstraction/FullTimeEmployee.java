package Abstraction;

public class FullTimeEmployee extends contractor {
	
    public void calculateSalary(int paymentperHours,int workingHours) {
		
		int c = paymentperHours*workingHours;
		System.out.println("The amount is : " +c);
		
	}

	public static void main(String[] args) {
		
		FullTimeEmployee f = new FullTimeEmployee();
		f.calculateSalary(4000,f.workingHours);
		
	

	}

}
