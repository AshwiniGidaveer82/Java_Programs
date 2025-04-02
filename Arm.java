
import java.util.Scanner;

public class Arm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int count = 0;
        int k = number;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        number = k;
        while (k > 0) {
            int digit = k % 10;
            sum += Math.pow(digit, count);
            k /= 10;
        }
        if (number == sum) {
            System.out.println(number + "is Anagram");
        } else {
            System.out.println(number + " is not a Anagram");
        }
    }
}
