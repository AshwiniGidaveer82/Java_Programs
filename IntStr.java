
import java.util.Scanner;

public class IntStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "" + num;
        System.out.println("Integer to String is: " + str);
    }
}
