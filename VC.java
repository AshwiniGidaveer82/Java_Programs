import java.util.Scanner;
public class VC {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.print("Enter a character: ");
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' && ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch + " is Consonant");
            }
        } 
        else {
            System.out.println(ch + " is invalid");
        }
    }
}
