package demo;

public class ReviewQuestion {
	
	public String display(String name) {
		
		return name;
	}
	
	public static void main(String[] args) {
		ReviewQuestion obj = new ReviewQuestion();
		String s=obj.display("Sreedevi");
		System.out.println(s);

	}

}
