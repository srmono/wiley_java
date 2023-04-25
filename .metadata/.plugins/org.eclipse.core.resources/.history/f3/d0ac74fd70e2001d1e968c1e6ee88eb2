package Exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("First statement");
		
		int arr[] = {1,2,3,4};
		
		//System.out.println(arr[4]);
		
		try {
			System.out.println(arr[1]);
			System.out.println(arr[4]);
			
			System.out.println("simple statement 2");
			
			String str = "Venkat";
			
			System.out.println(str.charAt(8));
			
			System.out.println(12/0);
			
			System.out.println("simple statement");
			System.out.println("simple statement");
			
		} catch(ArrayIndexOutOfBoundsException e) { //exception is the parent of all types of exceptions
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		} catch(IndexOutOfBoundsException e) {
			System.out.println("catch block 2");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("catch block 3");
			e.printStackTrace();
		}
		
		System.out.println("another statement");

	}

}
