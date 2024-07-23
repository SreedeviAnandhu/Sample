package Aggregation;

public class Student {
	
	String Name;
	int RollNo;
	int age;
	
	Address add;
	
	public Student(String Name,int RollNo,int age,Address add) {
		
		this.Name=Name;
		this.RollNo=RollNo;
		this.age=age;
		this.add=add;
		
		
	}
	
	public void display() {
		System.out.println(Name);
		System.out.println(RollNo);
		System.out.println(age);
		System.out.println(add.houseName);
		System.out.println(add.pincode);
		System.out.println(add.houseNo);
		System.out.println(add.city);
		
	}

	public static void main(String[] args) {
		
		Address obj = new Address("Ayodhya",3456,34,"Tvm");
		Student obj1 = new Student("Sreedevi",33,23,obj);
		obj1.display();
		
		
		

	}

}
