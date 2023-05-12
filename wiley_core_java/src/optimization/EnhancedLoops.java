package optimization;

public class EnhancedLoops {
	public static void main(String[] args) {
		//Inefficient way using regular for loop
		int[] array = {1,2,3,4,5};
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//Efficient way using regular for loop
		int[] array1 = {1,2,3,4,5};
		for(int num: array) {
			System.out.println(num);
		}
	}
}
