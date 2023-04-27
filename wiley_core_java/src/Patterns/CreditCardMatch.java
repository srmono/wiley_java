package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {
	public static void main(String[] args) {
		
//		4520 4678 5623 0200
//		xxxx xxxx xxxx 0200
		
		String cardNumber = "4520-4678-5623-0200";
		
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(cardNumber);
		
		String maskedCard = matcher.replaceAll("xxxx-xxxx-xxxx-");
		
		System.out.println(maskedCard);
		
		
	}
}
