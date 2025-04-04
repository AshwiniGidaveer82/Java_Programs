
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2};
        int max = arr[0];
        for (int num : arr) {
            if (num > max);
            max = num;
        }
        System.out.println("Largest Element is: " + max);
    }
}
