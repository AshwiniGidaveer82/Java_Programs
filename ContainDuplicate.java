
public class ContainDuplicate {

    public static boolean hasDuplicate(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 2, 3};
        System.out.println(hasDuplicate(number));
    }
}
