
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource" })
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println("Original String: " + str);
        System.out.println("Character: " + ch);
       int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (ch)) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);
    }
}
