package collections;

class Student{}
class Book{}

public class CollectionNeed {
	public static void main(String[] args) {
		//limitation of array
		//1. fixed in size
		//2. Arrays can hold only homogeneous data elements
		
		Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
		//students[2] = new Book();
		//students.length;
		
		Object[] objects = new Object[10];
		objects[0] = new Student();
		objects[1] = new Book();
		
		//3. ready made API's support is not available in array
		
	}
}
