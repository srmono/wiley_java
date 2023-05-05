package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomArrayList extends ArrayList {
	
	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		} else {
			return super.add(o);
		}
	}

	public static void main(String[] args) {
		
		CustomArrayList list = new CustomArrayList();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		
		System.out.println(list);
		
		//Set<GeniusStudent> setStudents = new HashSet<>();
		
		List<GeniusStudent> setStudents = new ArrayList();
		
		//Set<String> list2 = new HashSet<>();
		
		GeniusStudent gst1 = new GeniusStudent(101, "Rishav");
		GeniusStudent gst2 = new GeniusStudent(109, "Sachin");
		GeniusStudent gst3 = new GeniusStudent(102, "Steve");
		GeniusStudent gst4 = new GeniusStudent(105, "Anjali");
		
		setStudents.add(gst1);
		setStudents.add(gst2);
		setStudents.add(gst3);
		setStudents.add(gst4);
		
		Collections.sort(setStudents);
		
		System.out.println(setStudents);
	
	}
}





















