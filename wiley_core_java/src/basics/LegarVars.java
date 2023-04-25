package basics;

//In Java, a legal identifier is a name used to identify a variable, method, class, or any other programming element. Identifiers are case-sensitive and must adhere to the following rules:
//
//- An identifier must begin with a letter (A-Z or a-z), underscore (_), or dollar sign ($).
//- After the first character, an identifier can contain any combination of letters, digits (0-9), underscores, or dollar signs.
//- Identifiers cannot be a keyword or reserved word in Java.
//- Identifiers can be of any length.
//Here are some examples of legal identifiers in Java:
	
public class LegarVars {
	public static void main(String[] args) {
		// In this example, age, firstName, $salary, 
		// and is_active are all legal identifiers because they begin with a letter, 
		// underscore, or dollar sign and contain only letters, digits, 
		// underscores, or dollar signs. MAX_COUNT is also a legal identifier, 
		// even though it contains uppercase letters, 
		// because it adheres to the other rules for legal identifiers.
		
		// syntax: data_type variable_name [= initial_value];
		
		int age;
		String firstName;
		double $salary;
		boolean is_active;
		final int MAX_COUNT;
		
		//int 123;         // Cannot begin with a digit
		//String first-name; // Cannot use hyphens
		//double class;     // Cannot use a reserved keyword

		// In general, it's a good practice to choose meaningful and 
		// descriptive names for our identifiers that reflect their purpose and 
		// functionality in our code. This can help make our code more readable and 
		// understandable to other developers.
	}

}
