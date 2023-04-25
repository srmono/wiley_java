package Wiley_core_java;

class Animal{
	public void eat() {
		System.out.println("Eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
}

class Lion extends Animal {
	public void roar() {
		System.out.println("Lion is roaring");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Lion lion = new Lion();
		
		lion.roar();
		lion.sleep();
		lion.eat();
	}
}



