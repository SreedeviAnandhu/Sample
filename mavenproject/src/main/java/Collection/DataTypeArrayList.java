package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DataTypeArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		ArrayList<Character> a2 = new ArrayList<Character>();
		a2.add('s');
		a2.add('p');
		a2.add('a');
		a2.add('r');
		a2.add('g');
		
		ArrayList<Float> a3 = new ArrayList<Float>();
		a3.add(2.5f);
		a3.add(3.4f);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.remove(3);
	//	a2.remove('a');
		
		System.out.println(a1);
		//System.out.println(a2);
		
		Iterator <Integer> d = a1.iterator();
		
		while(d.hasNext())
		{
			System.out.println(d.next());
		}
		
		d.remove();
		System.out.println(a1);
		
		ArrayList <String> list1 = new ArrayList <String>();
		list1.add("richu");
		list1.add("krish");
		list1.add("Anandhu");
		list1.add("sree");
		
		ArrayList <String> list2 = new ArrayList <String>();
		list2.add("richu");
		list2.add("Gokul");
		list2.add("avinash");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		list1.removeAll(list2);
		
		System.out.println(list1);
		
		Collections.sort(list1);	
		
		System.out.println(list1);
		
		list1.set(2, "anu");
		
		System.out.println(list1);
	}

}
