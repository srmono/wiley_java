package optimization;

//Compile time evaluation
public class CompileTimeEvaluation {
	
	public static final int MAX_SIZE = 100;
	public static final int SUM = 10 + 20;//
	
	public static void main(String[] args) {
	 	int[]  array  = new int[MAX_SIZE];//MAX_SIZE is known at compile-time
	 	
	 	System.out.println(SUM);//SUM  is known at compile-time
	}
}
