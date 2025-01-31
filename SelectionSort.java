import java.util.Scanner;
public class SelectionSort {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] =sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        int missingNumber = n;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                missingNumber = i;
                break;
            }
        }
        System.out.println(missingNumber);
        sc.close();
    }
}

