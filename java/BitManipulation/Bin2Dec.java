package BitManipulation;


public class Bin2Dec {
    static int convert(String s) {

        int len = s.length();
        int power2 = 1;
        int num = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                num = num + power2;
            }
            power2 = power2 * 2;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(convert("1101"));
    }
}
