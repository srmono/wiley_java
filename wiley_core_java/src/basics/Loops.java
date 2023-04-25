package basics;

public class Loops {
	public static void main(String[] args) {

		// for loop
		for (int i = 0; i < 5; i++) {
			System.out.println("The value of i is: " + i);
		}

		// nested for loop

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// while loop
		int i = 0;

		while (i < 5) {
			System.out.println("The value of i is: " + i);
			i++;
		}

		// do while loop

	}
}
