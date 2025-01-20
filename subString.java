import java.util.Scanner;
public class subString {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        if (i2 <= s.length()) {
            System.out.println("The substring is: " + s.substring(i1, i2) + ".");
        } else {
            System.out.println("Invalid Input!");
        }
    }
}
