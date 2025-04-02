
import java.util.Scanner;

public class NthTerm {

    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("The " + n + "th term of the series is " + sum + ".");
    }
}
