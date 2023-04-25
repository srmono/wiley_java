package basics;

// In Java, nonaccess modifiers are keywords that define additional 
// properties of class members, such as fields and methods. 
// Nonaccess modifiers can be used to control the behavior of 
// class members without affecting their access level. 
// There are several nonaccess modifiers in Java:

//static: When a field or method is marked as static, 
		//it belongs to the class itself rather than to any specific 
		//instance of the class. This means that the field or method 
		//can be accessed without creating an object of the class.
//
//final: When a field or method is marked as final, 
		//its value cannot be changed once it has been initialized. 
		//For a field, this means it cannot be reassigned a new value. 
		//For a method, this means it cannot be overridden in a subclass.
//
//abstract: When a method is marked as abstract, 
//			it is declared but does not have an implementation. 
//			Abstract methods must be implemented in any non-abstract subclass.
//
//synchronized: When a method is marked as synchronized, 
//			it can only be accessed by one thread at a time. 
//			This is useful for preventing multiple threads from accessing 
//			the same method simultaneously and causing race conditions.
//
//transient: When a field is marked as transient, 
		//it is excluded from the serialization process. 
		//This means that the field's value is not saved when an object 
		//is serialized and can only be set when the object is deserialized.
//
//volatile: When a field is marked as volatile, 
//		it is accessed directly from memory rather than from a cache. 
//		This can be useful for ensuring that the most up-to-date value 
//		of the field is always used.

public class Counter {

	    private static int count = 0;
	    private final String name;

	    public Counter(String name) {
	        this.name = name;
	    }

	    public synchronized void increment() {
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }

}

//In this example, we have a Counter class with two fields: count and name. The count field is marked as static, which means it belongs to the class itself rather than to any specific instance of the class. The name field is marked as final, which means its value cannot be changed once it has been initialized.
//
//The Counter class also has a increment() method, which is marked as synchronized. This means that only one thread can access the method at a time, which helps prevent race conditions.
//
//Finally, the Counter class has a getCount() method, which simply returns the current value of the count field.
//
//Using nonaccess modifiers in Java can help us control the behavior of our code and ensure that our objects behave correctly in various situations.
