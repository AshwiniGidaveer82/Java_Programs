public class Starry_Path {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 1 || i == 5 || k == 1 || k == 5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}