public class Alphabet {
    public static void main(String[] args) {
        for (int i = 'A'; i <= 'D'; i++) {
            for (int j = 'A'; j <= i; j++) {
                System.out.print((char)i);
            }
            System.out.println();
        }
        for (int i = 'C'; i >= 'A'; i--) {
            for (int j = 'A'; j <= i; j++) {
                System.out.print((char)i);
            }
            System.out.println();
       }
    }
}