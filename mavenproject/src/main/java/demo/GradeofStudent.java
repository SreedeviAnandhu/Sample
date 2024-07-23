package demo;

import java.util.Scanner;
public class GradeofStudent {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Grade");
		char grade= sc.next().charAt(0);
		
	switch(grade)
	{
	    case 'A':
	    System.out.println("Exllecent");
	    break;

	    case 'B':
	    System.out.println("VeryGood");
	    break;
	    
	    case 'C':
		    System.out.println("Good");
		    break;
		    
	    case 'D':
		    System.out.println("Average");
		    break;

	    default:
	    System.out.println("Incorrect");
	    break;

	}
	}
	}
