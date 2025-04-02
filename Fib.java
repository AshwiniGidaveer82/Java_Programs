
import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, next;
        System.out.println("Fibonacci number of " + a + "and" + b);
        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
    }
}
