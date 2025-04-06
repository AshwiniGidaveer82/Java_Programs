
// import java.util.HashSet;
import java.util.LinkedHashSet;
// import java.util.Set;

public class Union {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        System.out.println("Union: " + set);
    }
}
