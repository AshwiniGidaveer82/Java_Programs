import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = "";
        int number = decimal;
        if (number == 0) {
            binary = "0";
        } else {
            while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
    }
    System.out.println("The binary number of " + decimal + " is " + binary + ".");
    }
}
