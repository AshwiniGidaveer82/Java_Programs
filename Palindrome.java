
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String reversed = new StringBuilder(str).reverse().toString();

            if (str.equals(reversed)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
