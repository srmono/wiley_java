import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num; 

        do {
            System.out.println("Enter a number between 1 and 10: ");
            num = scan.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("The number entered by you is: " + num);
    }
}
