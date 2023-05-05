package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class GeniusStudent implements Comparable<GeniusStudent> {
	private int id;
	private String name;

	public GeniusStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeniusStudent other = (GeniusStudent) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GeniusStudent [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(GeniusStudent o) {
		// TODO Auto-generated method stub

		if (id == o.id) {
			return 0;
		} else if (id > o.id) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		List<GeniusStudent> setStudents = new ArrayList();
		
		GeniusStudent gst1 = new GeniusStudent(101, "Rishav");
		GeniusStudent gst2 = new GeniusStudent(109, "Sachin");
		GeniusStudent gst3 = new GeniusStudent(102, "Steve");
		GeniusStudent gst4 = new GeniusStudent(105, "Anjali");
		GeniusStudent gst5 = new GeniusStudent(105, "Ajali");
		
		setStudents.add(gst1);
		setStudents.add(gst2);
		setStudents.add(gst3);
		setStudents.add(gst4);
		setStudents.add(gst5);
		
		Collections.sort(setStudents, new NameComparator());
		
		System.out.println(setStudents);
	}

}
