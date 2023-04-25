package basics;

public class Conditions {
	public static void main(String[] args) {
		
		// In this example, the if statement checks if the age variable is greater than or equal to 18. If it is, then the code inside the curly braces {} is executed, which prints out "You are an adult." If the condition is not true, meaning the age variable is less than 18, then the code inside the else block is executed, which prints out "You are not yet an adult."
		int age = 25;

		if (age >= 18) {
		  System.out.println("You are an adult.");
		} else {
		  System.out.println("You are not yet an adult.");
		}

		
	}
}
