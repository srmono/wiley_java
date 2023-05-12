package optimization;

//String concatenation creates a new String object each time it is used
// which can ineffieient ofr large string operations, instead you cna use string Builder

public class StringOptimize {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		//Inefficient way using String concatenation
		String result = "";
		for(int i=0; i < 100000; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
		
		//Efficient way using String concatenation
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < 100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
	}
}
