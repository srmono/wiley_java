package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		HashSet<String>  hs = new HashSet<>();
		Set<String> ts = new TreeSet<>();
		
		hs.add("Java");
		hs.add("java");
		hs.add("java");
		hs.add("python");
		hs.add("javaScript");
		hs.add("mysql");
		
		System.out.println(hs);
		
		
		// Array list of event names -->  get unique values
		//hs.addAll(array List)
		
//		LinkedHashSet --> insertion order
		
		
		
	}
}
