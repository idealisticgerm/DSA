package javaq.Recursion;

public class Palindrome {
    static boolean palin(String s) {
        return helper(0, s.length() - 1, s);
    }

    static boolean helper(int l, int r, String s) {
        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        } else {
            return helper(l + 1, r - 1, s);
        }


    }

    public static void main(String[] args) {
        String s = "mada";
        System.out.println(palin(s));
    }
}
