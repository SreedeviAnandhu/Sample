package ExceptionHandling;

public class LicenseSample {
	
	public void test(int a) throws LicenseException {
		if(a<18) {
			throw new LicenseException("Not eligible for license");
		}
		else {
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		
		LicenseSample obj = new LicenseSample();
		try {
		obj.test(10);
		}
		catch(LicenseException e) {
			System.out.println(e);
		}
		
	}

}
