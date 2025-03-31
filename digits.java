
public class digits {

    public static void main(String[] args) {
        int num = 9999380;
        int count = String.valueOf(Math.abs(num)).length();
        System.out.println("Digit Count: " + count);
    }
}
