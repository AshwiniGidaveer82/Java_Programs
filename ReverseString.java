
// import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int number = 12345;
        int reverseNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number is: " + reverseNumber);
    }
}
