package demo;

public class Studentname {
	
	String name,department;
	int rollno;
	
	public Studentname(String name,String department,int rollno)
	{
		
		this.name = name;
		this.department = department;
		this.rollno= rollno;
	}
	
	
	public void display()
	{
		System.out.println("name = " + name);
		System.out.println("department = " + department);
		System.out.println("rollno = " + rollno);
	}
	
  public static void main(String args[])
{
	  Studentname obj = new Studentname("Sreedevi","civil",30);
	  Studentname obj1 = new Studentname("Sneha","B-tech",10);
	  Studentname obj2 = new Studentname("devi","Metch",22);
	  
	  obj.display();
	  obj1.display();
	  obj2.display();
}
}
