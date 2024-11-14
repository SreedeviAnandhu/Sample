package Polymorphism;

public class offSeason extends onSeason{
	
	public void discount(int Totalamount) {
		
		int Finalamount = (15*Totalamount)/100;
		System.out.println("Discount Amount on offSeason is : " + Finalamount);
		super.discount(5000);	
	}

	public static void main(String[] args) {
		
		onSeason obj = new offSeason();
		obj.discount(4000);
		
	    onSeason obj1 = new onSeason();
		obj1.discount(5000);
	}

}
