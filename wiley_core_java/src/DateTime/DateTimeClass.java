package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
	public static void main(String[] args) {

		// Current date
		LocalDate myDate = LocalDate.now();

		System.out.println(myDate);

		// Current time
		LocalTime myTime = LocalTime.now();

		System.out.println(myTime);

		// Current date and time
		LocalDateTime myDateTime = LocalDateTime.now();

		System.out.println("Before format : " + myDateTime);
		
		DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String modDateTime = myDateTime.format(myDateFormat);		
		System.out.println("After format : " + modDateTime);
		
//		yyyy-MM-dd 
//		dd/MM/yyyy
//		dd-MMM-yyyy
//		E, MMM dd yyyy
		
		String dateStr = "26/04/2023";
		
		LocalDate date = LocalDate.parse(dateStr, format);
		
		System.out.println(date);
		
		
	}
}
