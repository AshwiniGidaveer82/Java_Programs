public class SumOfSquare {
    public static void main(String[] args) {
        int sum = 0;
        for (int i  = 1; i <= 10; i++) {
            sum = sum + (i*i);
        }
        System.out.println("Sum of Square is: " + sum);
    }
}