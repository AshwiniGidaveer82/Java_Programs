
import java.util.HashSet;

public class GreatestLetterFinder {

    public static String greatestLetter(String s) {
        HashSet<Character> upperSet = new HashSet<>();
        HashSet<Character> lowerSet = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperSet.add(ch);
            } else if (Character.isLowerCase(ch)) {
                lowerSet.add(Character.toUpperCase(ch));
            }
        }

        char result = 0;
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            if (upperSet.contains(ch) && lowerSet.contains(ch)) {
                result = ch;
                break;
            }
        }

        return result == 0 ? "" : String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(greatestLetter("lEeTcOdE"));     // Output: "E"
        System.out.println(greatestLetter("arRAzFif"));     // Output: "R"
        System.out.println(greatestLetter("AbCdEfGhIjK"));  // Output: ""
    }
}
