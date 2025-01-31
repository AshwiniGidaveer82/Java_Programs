
public class Duplicate {

    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = duplicate.removeDuplicates(nums);

        System.out.println("Unique Count: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
