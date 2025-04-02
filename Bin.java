
import java.util.Scanner;

public class Bin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = "";
        int number = decimal;
        if (number == 0) {
            binary = "0";
        } else {
            while (number > 0) {
                int rem = number % 10;
                binary = rem + binary;
                number = number / 2;
            }
            System.out.println("The binary equivalent of " + decimal + " is " + binary + '.');
        }
    }
}
