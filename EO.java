
// public class EO {
//     public static void main(String[] args) {
//         int[] arr = {10, 24, 35, 80, 65};
//         System.out.println("Enter a number");
//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 System.out.println("Number is Even");
//             }
//         }
//         for (int num : arr) {
//             if (num % 2 != 0) {
//                 System.out.println("Number is Odd");
//             }
//         }
//     }
// }
public class EO {

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 60, 30};

        System.out.print("Even Numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd Numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
