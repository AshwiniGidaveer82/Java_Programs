package DSA;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i] = array[size-1-i];
        }
        System.out.print("Original Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Reversed Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArray[i]);
            if (i < size-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

