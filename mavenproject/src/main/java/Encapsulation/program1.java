package Encapsulation;

public class program1 {
	
	private String name;
	private long accountNo;
	private int balance;
	
	
	public void setter(String name,long accountNo,int balance) {
		
		this.name=name;
		this.accountNo=accountNo;
		this.balance=balance;
		
	}
	
	
	public void getter() {
		
		System.out.println(name);
		System.out.println(accountNo);
		System.out.println(balance);
		
	}

}
