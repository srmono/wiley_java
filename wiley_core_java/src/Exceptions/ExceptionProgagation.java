package Exceptions;

// In java , uncaught exceptions occur whne an exception is thrown with in a method and
// there is no code in place to catch and handle the exception. When this happens, the exception is
// propagated up the call stack until it is caught by an appropriate exception handler or
// until it reached the top of the call stack and is terminated

public class ExceptionProgagation {
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught " + e.getMessage());
		}
	}

	public static void method1() throws Exception {
		// TODO Auto-generated method stub
		method2();
	}

	public static void method2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Expection occured in the method2");
	}

}
