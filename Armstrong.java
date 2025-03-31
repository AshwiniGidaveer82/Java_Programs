
public class Armstrong {

    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += (digit * digit * digit);
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " Number is Armstrong");
        } else {
            System.out.println(originalNum + " Number is not Armstrong");
        }
    }
}
