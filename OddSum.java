
public class OddSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The first 50 natural number sum is: " + sum);
    }
}
