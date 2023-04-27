package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
	public static void main(String[] args) {
//		. , \w, \W, \s, \S, \d, \D
		
//		String re = "..";
		//String re = "\\w\\w\\w\\W."; //(a-z A-Z, 0-9,_)
		//String re = "\\S\\s";
		String re = "\\d\\d\\D";
		String text = "99@";
		
		Pattern pattern = Pattern.compile(re);
		
		Matcher mt = pattern.matcher(text);
		
		 boolean res = mt.matches();
		 System.out.println(res);
	}
}
