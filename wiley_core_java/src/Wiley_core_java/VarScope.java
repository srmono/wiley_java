package Wiley_core_java;

public class VarScope {
	
	int ins = 20;
	int val = 18;
	int val1 = 12;
	static String name = "Venkat";
	
	public void sum() {
		int val  = 10;
		int val1 = 25;
		
		System.out.println("sum methods: - " + (this.val + this.val1));
	}

	public static void main(String[] args) {
		int val = 18;
		int loc = 10;
		
		VarScope vso = new VarScope();
		
		//System.out.println("local val: -"+ this.val);
		
		System.out.println("Local variable loc : " + loc);
		
		System.out.println("instance variable ins : " + vso.ins);
		
		System.out.println("Static variable name : " + name);
		
		vso.sum();
		
	}
}


