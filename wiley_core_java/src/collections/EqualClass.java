package collections;

public class EqualClass {
	public static void main(String[] args) {
//		int int1 = 4;
//		int int2 = 4;
//		
//		if(int1 == int2) {
//			System.out.println("The numbers are equal");
//		} else {
//			System.out.println("The numbers are not equal");
//		}
		
		// when use use string class it checks memory address
		String str1 = new String("Wiley");
		String str2 = new String("Wiley");
		
//		String str1 = "Wiley";
//		String str2 = "Wiley";
		
		if(str1.equals(str2)) {
			System.out.println("The Strings are equal");
		} else {
			System.out.println("The Strings are not equal");
		}
		
		
		Dog myDog = new Dog();
		Dog yourDog = new Dog();
		
		if(myDog.equals(yourDog)) {
			System.out.println("The dogs are equal");
		} else {
			System.out.println("The dogs are not equal");
		}
		
	}
}












