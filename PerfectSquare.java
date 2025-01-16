import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double sqroot = Math.sqrt(number);
        double roundvalue =  Math.floor(sqroot);
        if (sqroot == roundvalue) {
            System.out.println(number + " is erfect square.");
        } else {
            System.out.println(number + " is not perfect square.");
        }
    }
}
