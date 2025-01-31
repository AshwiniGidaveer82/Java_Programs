public class LinearSearch {
    public static void main(String[] args) {
        int[] number = {12,32,33,21,67,54,87,43};
        int target = 87;
        int result  = linearSearch(number, target);
        if (result == -1) {
            System.out.println("Element " + target + " is not found");
        } else {
            System.out.println("Element " + target + " found at index:" + result);
        }
    }
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    } 
}