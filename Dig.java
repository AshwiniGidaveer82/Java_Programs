
import java.util.Scanner;

public class Dig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int k = num;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("The number " + k + " has " + count + " digits.");
    }
}
