package Exceptions;

public class FinalBlock {

	public static void main(String[] args) {
		try {
			System.out.println("111111");
			System.out.println("wiley");
			System.out.println(10/0);
			
//			try {
//				System.out.println(10/0);
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			} finally {
//				System.out.println("nested close connection");
//			}
			
			//System.exit(0);
			System.out.println("edge");
			
		} catch (Exception e) { 
			System.out.println("catch block");
			
			try {
				System.out.println("try catch block inside catch block");
				System.out.println(10/0);
			} catch (Exception ee) {
				// TODO: handle exception
				ee.printStackTrace();
			} finally {
				System.out.println("nested close connection inside the catch");
			}
			
			//System.exit(0);
//			System.out.println(10/0);
			
			e.printStackTrace();
		} finally {
			//System.out.println(10/0);
			
			try {
				System.out.println("try catch block inside finally block");
				System.out.println(10/0);
			} catch (Exception ee) {
				// TODO: handle exception
				ee.printStackTrace();
			} finally {
				System.out.println("nested close connection inside the finally");
			}
			
			System.out.println("Clone connection");
		}
		
		System.out.println("last statement");
	}
}
