import java.util.Scanner;
public class SingleDigitSum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = number;
        while (result >= 10) {
            result = SumOfDigits(result);
        }
        System.out.println("Single digit sum of " + number + " is: " + result);
    }
    public static int SumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
