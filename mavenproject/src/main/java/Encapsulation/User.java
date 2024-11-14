package Encapsulation;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the pin");
		int a = sc.nextInt();
		
		System.out.println("Enter the amount");
		int k = sc.nextInt();
		
		Bank b = new Bank();
		b.setter(a,k);
		b.getter();
}
}