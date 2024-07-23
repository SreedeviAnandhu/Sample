package Aggregation;

public class Book {
	
	int bookNo;
	String bookName;
	String bookAuthor;
	
	Author arr;
	
public Book(int bookNo,String bookName,String bookAuthor,Author arr) {
		
		this.bookNo=bookNo;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.arr=arr;
		
	}
	
	public void display() {
		System.out.println(bookNo);
		System.out.println(bookName);
		System.out.println(bookAuthor);
		System.out.println(arr.Name);
		System.out.println(arr.age);
		System.out.println(arr.city);
		
	}
	

	public static void main(String[] args) {
		
		Author obj =  new Author("Albert",56,"erklm");
		Book obj1 = new Book(12,"apple","Sree",obj);
		obj1.display();
		
		

	}

}
