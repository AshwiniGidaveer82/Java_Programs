
import java.util.*;

public class removeAnagram {

    public static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]); // Always keep the first word

        for (int i = 1; i < words.length; i++) {
            String prev = result.get(result.size() - 1);
            String curr = words[i];

            if (!areAnagrams(prev, curr)) {
                result.add(curr); // Keep if not anagram of previous
            }
        }

        return result;
    }

    // Helper method to check if two words are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String[] words1 = {"abba", "baba", "bbaa", "cd", "cd"};
        System.out.println(removeAnagrams(words1)); // Output: [abba, cd]

        String[] words2 = {"a", "b", "c", "d", "e"};
        System.out.println(removeAnagrams(words2)); // Output: [a, b, c, d, e]
    }
}
