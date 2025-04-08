
// public class singleNum {
//     public static int sinNum(int[] nums) {
//         int res = 0;
//         for (int num : nums) {
//             res ^= num;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 4, 1, 2};
//         System.out.println("Single number is: " + sinNum(nums));
//     }
// }
public class singleNum {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 4, 5};
        System.out.println("Single number is: " + singleNumber(nums));
    }
}
