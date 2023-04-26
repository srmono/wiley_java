package RandomConcepts;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {
	public static void main(String[] args) {

		
		//Currency usd = Currency.getInstance("USD");
		NumberFormat frm = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedVal = frm.format(108.5);
		
		System.out.println(formattedVal);
		
		//Formatting currency with Locale along with NumberFormat class
		double price = 2000.25;
		Locale local = new Locale("en", "US");
		NumberFormat currencyForatter = NumberFormat.getCurrencyInstance(local);
		String finalPrice = currencyForatter.format(price);
		System.out.println(finalPrice);
		
		
		//Custom format
		DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
		decimalFormatter.setPositivePrefix("$");
		String resVal = decimalFormatter.format(price);
		
		System.out.println("custom format: - " + resVal);
		
		Currency cur = Currency.getInstance("USD");
		String symbol = cur.getSymbol();
		String code = cur.getCurrencyCode();
		
		System.out.println(symbol);
		System.out.println(code);
		
		//Exchange Rate provider 
		// 100$ --> rupees and Euros
		
		
	}
}
