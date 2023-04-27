package StringClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

// standard output stream (System.out) and 
// standard error output stream (System.err) are of type PrintStream, 
// so that means you will learn how to use the System.out.format() method 
// and System.err.format() method, and also String.format() method.

//Syntax: format(String format, Object... args)

//A format String consists of static text embedded with format specifiers which must adhere to the following syntax:
//%[argument_index$][flags][width][.precision]conversion

//***The elements inside the brackets are optional. Let’s understand each element in briefs:
//The % sign indicates the beginning of a format specifier.
//The optional argument_index is a decimal integer indicating the position of the argument in the argument list. The first argument is referenced by "1$", the second by "2$", etc.
//The optional flags is a set of characters that modify the output format. The set of valid flags depends on the conversion.
//The optional width is a positive decimal integer indicating the minimum number of characters to be written to the output.
//The optional precision is a non-negative decimal integer usually used to restrict the number of characters. The specific behavior depends on the conversion.
//The required conversion is a character indicating how the argument should be formatted. The set of valid conversions for a given argument depends on the argument's data type.


//Few conversions that are widely used:
//d formats an integer value as a decimal value.
//f formats a floating point value as a decimal value.
//n outputs a platform-specific line terminator.
//s formats any value as a string.
//x formats an integer as a hexadecimal value.
//t or T are prefix date time conversions.
//tTformats a Date object as 24-hour clock time (hour:minute:second).
//tF formats a Date object as year-month-day.
//tD formats a Date object as month/day/year.


//Few flags:
//'-': The result will be left-justified
//‘+’: The result will always include a sign
//'0': The result will be zero-padded
//'  ':  The result will include a leading space for positive values
//'(': The result will enclose negative numbers in parentheses


public class StringFormat {
	public static void main(String[] args) throws FileNotFoundException {
		
		//formatting a String, an integer number and a float number with the precision of 2 numbers after the decimal point (.2f):
		String title = "Java Developer";
		float salary = 2000.3999f;
		//System.out.format("%s has %.3f USD salary%n", title, salary);
		
		// Left justification
		// using the flag ‘-‘ to left-justify the Strings with the width of 30 characters (%-30s):
		List<String> techStack = Arrays.asList(
				"Essential Java",
				"Head First Java",
				"Java Design Patterns"
				);
		
		for(String book: techStack) {
			System.out.format("%-40s - In Stock%n", book);
		}
		
		// prints numbers in both decimal format (%d) and hexadecimal format (%x and %#x):
		System.out.format("Min value of a byte: %d (%1$#x)%n", Byte.MIN_VALUE);
		System.out.format("Max value of a byte: %d (%1$#x)%n", Byte.MAX_VALUE);
		System.out.format("Min value of an int: %d (%1$x)%n", Integer.MIN_VALUE);
		System.out.format("Max value of an int: %d (%1$x)%n", Integer.MAX_VALUE);
		
		//using the t prefix with date time conversions (T, F and D) to write formatted Strings of current time and date to a text file:
		PrintWriter writer = new PrintWriter(new File("datetime.txt"));
		 
		writer.format("Now is %tT %n", new Date());
		writer.format("Today is %tF %n", new Date());
		writer.format("Today is %tD %n", new Date()); 
		 
		writer.close();
		
		// formatting a Date object to a String using locale-specific full name of the day of the week (tA), full name of month (tB), day of month (td) and 4-digit year (tY):
		
		String longDate = String.format("Today is %tA %<tB %<td, %<tY", new Date());
		System.out.println(longDate);
		
		//formatting  numbers to a specific locale (use another overload of the format() method that takes a Locale):
		// use the flag ‘,’ to include the locale-specific grouping separators. The output would be:
		long k = 1000;
		long m = 1000000;
		long t = 1000000000;
		 
		System.out.println("French locale:");
		System.out.format(Locale.FRENCH, "One thousand: %,d %n", k);
		System.out.format(Locale.FRENCH, "One million: %,d %n", m);
		System.out.format(Locale.FRENCH, "One billion: %,d %n", t);

		// formats the numbers based on the default locale:
		System.out.println("Default locale:");
		System.out.format("One thousand: %,d %n", k);
		System.out.format("One million: %,d %n", m);
		System.out.format("One billion: %,d %n", t);
		
		// formatting the output nicely to make it looks like columns:
		String specifiers = "%-30s %-20s %-5.2f%n";
		System.out.format(specifiers, "Head First Java", "Kathy Sierra", 23.99f);
		System.out.format(specifiers, "Thinking in Java", "Bruce Eckel", 25.69f);
		System.out.format(specifiers, "Effective Java", "Joshua Bloch", 27.88f);
		System.out.format(specifiers, "The Passionate Programmer", "Chad Fowler", 41.99f);
		System.out.format(specifiers, "Code Complete", "Steve McConnell", 38.42f);
		
		//formatting floating point numbers into scientific notation (using the e/E and gconversions):
//		float k = 1000f;
//		float m = 1000000f;
//		float t = 1000000000f;
//		 
//		System.out.format("One thousand: %.1e %n", k);
//		System.out.format("One million: %.1E %n", m);
//		System.out.format("One billion: %.2g %n", t);
		
		// formatting numbers with zero-padded for numbers that are less than 5 character (%05d); encloses a negative number in parenthesis (%(d); and always includes sign for numbers (%+d):
		System.out.format("%05d %n", 12);
		System.out.format("%05d %n", 2016);
		System.out.format("%05d %n", 365);
		System.out.format("%05d %n", 19001800);
		System.out.format("%(d %n", -1234);
		System.out.format("%+d %n", 567);
		System.out.format("%+d %n", -891);
		
		// If we specify the width without the flag, the output is right-justified within the specified width, as shown in the following example:
		System.out.format("%20s %s %n", "Full Name: ", "John");
		System.out.format("%20s %s %n", "E-mail Address: ", "john@gmail.com");
		System.out.format("%20s %s %n", "City: ", "New York");
		System.out.format("%20s %s %n", "Country: ", "United States");
		
	}
}
