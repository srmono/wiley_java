package Wiley_core_java;

abstract class Test1{
	
	{
		System.out.println("Test1 instance block");
	}
	
	static {
		System.out.println("Test1 static block");
	}
	
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	
	public static void main(String[] args) {
		System.out.println("This is test1 main method from abstract class");
	}
	
	public Test1() {
		System.out.println("Test 1 constructor");
	}
	
	static {
		System.out.println("Test2 static block");
	}
}


class Test2 extends Test1{
	{
		System.out.println("Test2 instance block");
	}
	
	@Override
	public void m1() {
		System.out.println("Test 2 m1 method");
		
	}
	
	public Test2() {
		System.out.println("Test 2 constructor");
	}
	
}

public class AbstractionClass {
	
	public static void main(String[] args) {
		System.out.println("main class");
		
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
		
		t2.m1();
		t2.m2();
		
		Test1.main(args);
		
		

	}
}
