
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
