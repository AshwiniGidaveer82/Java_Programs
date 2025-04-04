
import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 34, 43, 54, 21, 23};
        Arrays.sort(arr);
        System.out.println("Second Largest Number is: " + arr[arr.length - 2]);
    }
}