
public class ThirdLarge {

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 9, 1};
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num == first || num == sec || num == third) {
                continue;
            }
            if (num > first) {
                third = sec;
                sec = first;
                first = num;
            } else if (num > sec) {
                third = sec;
                sec = num;
            } else if (num > third) {
                third = num;
            }
            if (third == Integer.MIN_VALUE) {
                System.out.println("Third maximum number is: " + third);
            } else {
                System.out.println("There is no maximum number.");
            }
        }
    }
}
