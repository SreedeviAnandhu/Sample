package Collection;

import java.util.ArrayList;
import java.util.List;


public class SampleArraylist {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add('c');
		l.add("sree");
		l.add(300);
		System.out.println(l);
		
		ArrayList a1 = new ArrayList();
		a1.add("NewData");
		a1.add(200);
		System.out.println(a1);
		
		ArrayList <String> list1 = new ArrayList <String>();
		list1.add("richu");
		list1.add("Anandhu");
		list1.add(2,"sree");
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		
		list1.remove("richu");
		list1.remove(1);
		System.out.println(list1);
		
		list1.add("richu");
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		System.out.println(list1.contains("richu"));
		
		for(int i=0;i<list1.size();i++) {
			
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		System.out.println("Using ForEach");
		for (String s : list1) {
			System.out.println(s);
		}
		
		//ArrayList <int> list2 = new ArrayList<int>(); //error

	}

}
