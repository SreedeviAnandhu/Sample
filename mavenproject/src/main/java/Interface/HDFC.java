package Interface;

public class HDFC implements RBI {
	
	public void recurringDeposit(int amount,int duration,int rate) {
		
		int calucation = amount*duration*rate;
		
		System.out.println(calucation);
		
	}

	public static void main(String[] args) {
		
		HDFC obj = new HDFC();
		obj.recurringDeposit(400,24,4500);
		
	}

}
