package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {
	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new ConcurrentHashMap<>();
		
		myMap.put(1, "java");
		myMap.put(2, "python");
		//myMap.put(2, "python");
		
		Iterator it = myMap.keySet().iterator();
		
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key + " : " + myMap.get(key));
			myMap.put(3, "React");
		}
	}

}
