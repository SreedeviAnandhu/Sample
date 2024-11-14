package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<String>();
		s1.add("ammu");
		s1.add("achu");
		s1.add("anu");
		s1.add("sree");
		s1.add("richu");
		//s1.add("anu");
		System.out.println(s1);
		
		Set s2 = new HashSet();
		s2.add("10");
		s2.add("s");
		s2.add("new");
		System.out.println(s2);
		
		System.out.println();
		System.out.println("HashSet generic");
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(45);
		h1.add(23);
		h1.add(32);
		System.out.println(h1);
		
		System.out.println();
		System.out.println("HashSet-Nongeneric");
		HashSet h2=new HashSet();
		h2.add("sdhu");
		h2.add('g');
		h2.add("33");
		System.out.println(h2);
		
		h2.remove('g');
		System.out.println(h2);
		h2.addAll(h1);
		System.out.println(h2);
		h2.removeAll(h1);
		System.out.println(h2);
		System.out.println(h2.size());
		
		Iterator <String> it = s1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		it.remove();
		System.out.println(s1);
		System.out.println(s1.contains("ammu"));
		

	}

}
