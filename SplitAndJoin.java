import java.util.Scanner;
public class SplitAndJoin {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String[] words = s.split(" ");
        System.out.println("Split words: ");
        for (String word : words) {
            System.out.print(word);
        }
        String k = String.join(s1, words);
        System.out.println("Joined Sentence: " + k);
        sc.close();
    }
}
