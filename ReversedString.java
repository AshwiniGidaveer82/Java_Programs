
public class ReversedString {

    public static void main(String[] args) {
        String str = "Hello World";
        // String reversed = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     reversed += str.charAt(i);
        // }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String: " + sb.toString());
    }
}
// public class ReversedString {

//     public static void main(String[] args) {
//         String str = "Hello Java";
//         // Using StringBuilder
//         StringBuilder sb = new StringBuilder(str);
//         sb.reverse();
//         System.out.println("Reversed String: " + sb.toString());
//     }
// }
