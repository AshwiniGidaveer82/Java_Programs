import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int originalnumber = number;
        int reversenumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversenumber = reversenumber * 10 + digit;
            number = number / 10;
        }
        return originalnumber == reversenumber;
    }
}
