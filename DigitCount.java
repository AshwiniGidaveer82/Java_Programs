import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0; 
        int k = number;
        while(number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println("The number " + k + " has " + count + " digits.");
    }
}
