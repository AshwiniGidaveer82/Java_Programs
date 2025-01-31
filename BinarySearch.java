public class BinarySearch {
    public static void main(String[] args) {
   
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 50; 
        int result = binarySearch(numbers, target);
        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
         
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
