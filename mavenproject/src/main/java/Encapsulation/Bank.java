package Encapsulation;

public class Bank {
	
	private int pin,amount,balance=500;

	public void setter(int pin,int amount) {
		
		this.pin=pin;
		this.amount=amount;
		
	}
	
	public void getter() {
		
		switch(pin) {
		
		case 1001:balance=balance=amount;
					System.out.println("Amount " +amount + " is withdrawed and available balance is " + balance);
		case 1234:balance=balance=amount;
					System.out.println("Amount " +amount + " is withdrawed and available balance is " + balance);
		case 1212:balance=balance=amount;
					System.out.println("Amount " +amount + " is withdrawed and available balance is " + balance);
       
	}

}
	
}
