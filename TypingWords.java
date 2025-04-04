
public class TypingWords {

    public static int countFullyTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.chars().noneMatch(ch -> brokenLetters.indexOf(ch) != -1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countFullyTypedWords("hello world", "ad"));  // Output: 1
        System.out.println(countFullyTypedWords("leet code", "lt"));   // Output: 1
        System.out.println(countFullyTypedWords("leet code", "e"));    // Output: 0
    }
}
