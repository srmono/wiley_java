package Exceptions;

import java.io.IOException;
import java.sql.SQLException;

//In Java, it's possible to handle an entire class hierarchy of exceptions 
	//using a single catch block. This can be useful when you want to handle 
	//all exceptions in a particular hierarchy in the same way, 
	//without having to write separate catch blocks for each exception class.
//
//To handle an entire class hierarchy of exceptions, 
	//you can catch the superclass of the exception hierarchy, 
	//rather than catching each individual exception class

//try {
//	  // some code that might throw an exception
//	} catch (IOException e) {
//	  // handle IOException
//	} catch (SQLException e1) {
//	  // handle SQLException
//	} catch (Exception e11) {
//	  // handle any other exception in the hierarchy
//	}

//In this example, we're catching IOException and SQLException separately, and then catching the superclass Exception to handle any other exception in the hierarchy that wasn't caught by the previous catch blocks.
//
//Note that it's important to catch the most specific exceptions first, before catching the superclass. This is because if a specific exception is caught first, the subsequent catch blocks will not be executed.
//
//Also, be careful not to catch exceptions that you don't know how to handle. It's better to let those exceptions propagate up the call stack to a higher-level error handler, rather than catching them and potentially masking the underlying problem.
//
//By using this approach of catching an entire class hierarchy of exceptions, you can simplify your code and avoid duplicating exception handling logic for each individual exception class.


public class EntireClass {
		public static void main(String[] args) {
		}
}
