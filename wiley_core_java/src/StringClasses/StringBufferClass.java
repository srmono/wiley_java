package StringClasses;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley");
		StringBuffer sb2 = new StringBuffer("Wiley");
		
		
		String ss = "Wiley";
		
		System.out.println(ss.equals(sb1));
		System.out.println(ss.equals(sb1.toString()));
		
		System.out.println(sb);
		
		//sb.append(" Edge");
		
		System.out.println(sb);
		
		sb.insert(5, " Edge");
		System.out.println(sb);
		
		System.out.println(sb.delete(5,9));
		System.out.println(sb.reverse());
		
	}
}
