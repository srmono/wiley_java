package RandomConcepts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberClass {
	public static void main(String[] args) {
		BigDecimal num1 = new BigDecimal("10.5");
		BigDecimal num2 = new BigDecimal("3");
		
		BigDecimal res = num1.divide(num2, 2, RoundingMode.HALF_UP);
		
		System.out.println(res);
		
		String str = "123";
		int number = Integer.parseInt(str);
		
		System.out.println(number);
		
	}
}
