
public class StringRotation {

    public static boolean isRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s2).contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("listen", "ilsten"));
    }
}
