
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[5];
            for (int i = 0; i < 5; i++) {
                array[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum = sum + array[i];
            }
            System.out.print("Array: [");
            for (int i = 0; i < 5; i++) {
                System.out.print(array[i]);
                if (i < 4) {
                    System.out.print(", ");
                }
                System.out.print("]");
                System.out.println("Sum: " + sum);
            }
        }
    }
}
