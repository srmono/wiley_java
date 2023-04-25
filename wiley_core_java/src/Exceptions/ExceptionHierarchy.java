package Exceptions;

//In Java, exceptions are represented by a hierarchy of classes 
	//that extend the Throwable class. This hierarchy is divided into 
	//two main branches: checked exceptions and unchecked exceptions.
//
//Checked exceptions are those that must be declared in the method 
	//signature or caught using a try-catch block. 
	//Examples of checked exceptions include IOException, SQLException, and 
	//ClassNotFoundException.
//
//Unchecked exceptions, on the other hand, do not need to be declared or 
	//	caught. They are typically caused by programming errors such as 
	//	null pointer exceptions or array index out of bounds exceptions. 
	//	Examples of unchecked exceptions include NullPointerException, 
	//	ArrayIndexOutOfBoundsException, and ArithmeticException.

//Throwable
//|
//+-- Error
//|     |
//|     +-- VirtualMachineError
//|     |     |
//|     |     +-- OutOfMemoryError
//|     |     +-- StackOverflowError
//|     |     +-- ...
//|     |
//|     +-- AssertionError
//|
//+-- Exception
//      |
//      +-- RuntimeException
//      |     |
//      |     +-- NullPointerException
//      |     +-- ArrayIndexOutOfBoundsException
//      |     +-- ArithmeticException
//      |     +-- ...
//      |
//      +-- IOException
//      |     |
//      |     +-- FileNotFoundException
//      |     +-- EOFException
//      |     +-- ...
//      |
//      +-- SQLException
//      |     |
//      |     +-- SQLSyntaxErrorException
//      |     +-- SQLDataException
//      |     +-- ...
//      |
//      +-- ...
//


//The Throwable class is the superclass of all errors and exceptions in Java. 
		//The Error class represents serious problems that a reasonable application 
		//should not try to catch. The Exception class represents less serious 
		//problems that can be handled by an application. The RuntimeException class and 
		//its subclasses represent unchecked exceptions.
//
//Each exception class in the hierarchy has its own set of properties and 
		//methods that can be used to handle and manage the exception. 
		//It's important to understand the exception hierarchy in order to 
		//effectively handle exceptions in Java.


public class ExceptionHierarchy {

}
