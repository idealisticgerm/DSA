package BitManipulation;

public class Dec2Bin {
    static String convert(int n){
        String res = "";

        while(n>=1){
            if(n%2 == 1){
                res += '1';
            }
            else {
                res += '0';
            }

            n = n/2;
        }

        // reverse
        String rev = "";
        char ch;

        for (int i = 0; i <res.length() ; i++) {
         ch = res.charAt(i);
         rev = ch+rev;
        }

        return rev;

    }



    public static void main(String[] args) {
        System.out.println(convert(32));
    }
}
