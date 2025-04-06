
public class MinEle {

    public static void main(String[] args) {
        int[] arr = {10, 2, 0, 89, 33};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum Number is: " + min);
    }
}
