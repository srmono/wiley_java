package StringClasses;

import java.util.StringTokenizer;

public class StringTokenClass {
	public static void main(String[] args) {
		
		String input = "We , love , java , programming";
		StringTokenizer st = new StringTokenizer(input, ",");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken().trim());
		}
		
		//System.out.println(st.nextToken());
		
	}
}
