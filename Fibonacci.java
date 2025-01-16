import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int maxNumber = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series up to " + maxNumber + ": " +  a);
        while (b <= maxNumber) {
            System.out.print(" " + b);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
