import java.util.Scanner;
public class CharAt {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        if (i >= 0 && i < s.length()) {
            System.out.println("Charcater at index " + i + " is " + s.charAt(i)+ ".");
        }
        else {
            System.out.println("Invalid Input...");
        }
    }
}
