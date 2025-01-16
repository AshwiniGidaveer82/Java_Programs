import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factors of " + number + " are: ");
        @SuppressWarnings("unused")
        int factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
            factorial++;
        }
    }
    System.out.println();
    }   
}
