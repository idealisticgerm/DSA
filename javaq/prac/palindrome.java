package javaq.prac;

public class palindrome {
    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            char lc = Character.toLowerCase(s.charAt(low));
            char rc = Character.toLowerCase(s.charAt(high));

            if (!Character.isLetterOrDigit(lc)) {
                low++;
            }

            else if (!Character.isLetterOrDigit(rc)) {
                high--;
            } else {
                if (lc != rc) {
                    return false;
                }
                low++;
                high--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}
