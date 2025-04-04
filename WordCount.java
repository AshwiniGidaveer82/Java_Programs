
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        System.out.println("Count Word: " + words.length);
    }
}
