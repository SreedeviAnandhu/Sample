package Abstraction;

public class video extends google {
	
	public void search() {
		System.out.println("Searching video");
	}
	
	public void print() {
		System.out.println("hello hello");
	}

	public static void main(String[] args) {
		video v = new video();
		v.search();
		v.print();
		

	}

}
