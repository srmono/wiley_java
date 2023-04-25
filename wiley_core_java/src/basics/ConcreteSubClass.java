package basics;


// In Java, a concrete subclass is a class that extends another 
// class and provides a concrete implementation of its inherited methods. 
// A concrete subclass is also known as a "concrete implementation" or 
// "concrete type" of its superclass.

class Animal {
    public void move() {
        System.out.println("Moving...");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Running on four legs...");
    }
}


//In this example, we have a superclass called Animal and a concrete subclass called Dog. The Animal class defines a method called move(), which simply prints out a message saying "Moving...". The Dog class extends the Animal class and overrides the move() method to provide a concrete implementation of how a dog moves.
////
////When we create an instance of the Dog class and call the move() method, the Dog class's implementation of move() will be called, and the output will be "Running on four legs...". This demonstrates how a concrete subclass can provide a specialized implementation of an inherited method to meet its specific requirements.


public class ConcreteSubClass {
	public static void main(String[] args) {
		
	}
}
