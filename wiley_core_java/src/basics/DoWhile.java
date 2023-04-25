package basics;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		    Scanner scanner = new Scanner(System.in);
		    int num;

		    do {
		      System.out.print("Enter a number between 1 and 10: ");
		      num = scanner.nextInt();
		    } while (num < 1 || num > 10);

		    System.out.println("The number you entered is: " + num);
		    
//		    In this example, we use a do-while loop to repeatedly prompt the user to enter a number between 1 and 10 until they enter a valid number. We start by importing the Scanner class to read input from the user.
//
//		    We declare a variable num and initialize it to 0. The do-while loop executes the code inside the curly braces {} at least once, regardless of whether the condition num < 1 || num > 10 is true or false.
//
//		    Inside the loop, we prompt the user to enter a number between 1 and 10 using System.out.print() and then read the input using scanner.nextInt(). If the user enters a number outside of the valid range, the loop will continue to execute until a valid number is entered.
//
//		    Once the loop is finished, we print out the valid number that was entered using System.out.println().

	}
}
