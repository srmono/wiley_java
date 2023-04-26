package RandomConcepts;

import java.io.Console;

public class ConsoleClass {
	public static void main(String[] args) {
		
		Console console = System.console();
		
		if(console == null) {
			System.out.println("Console is not available");
			System.exit(1);
		}
		
		String name = console.readLine("What is your name? : ");
		char[] password = console.readPassword("Enter your password: ");
		
		console.printf("Hello, %s\n", name);
		console.printf("Your password is:, %s\n", new String(password));
	}
}
