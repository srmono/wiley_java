package data_structures;

// Recursion is the technique of function call itself
// why?

// factorial
//5 * 5-1 (4)
//20 * 4-1 (3)

// n ==1


public class RecursiveClass {
	
	static int factorial(int n) {
		if(n ==1) {
			return 1;
		}else {
			return (n * factorial(n -1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("factorial of 5 is: " + factorial(6));
	}
}
