public class Reverse {
    public static void main(String[] args) {
        int number = 890725332;
        int reverse_number = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse_number = reverse_number * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed number is: " + reverse_number);
    }
}
