public class Recursion {

    //    Factorial using Recursion
    public static int factorial(int n) {
//        BaseCase
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

//    --------------------------------------------------------------------------------------------

    //    Sum Of digits  1324 => 1+3+2+4 = 10
    public static int SumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + SumOfDigits(n / 10);
    }

    //    Reverse  the number
    public static int Reverse(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    public static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        return (n%10) * (int)(Math.pow(10,digits - 1) ) + helper(n/10 , digits - 1);
    }

    //    Main Method
    public static void main(String[] args) {
//        int x = factorial(5);
//        System.out.println(x);
//
//        System.out.println(SumOfDigits(1342));
        System.out.println(Reverse(1234));

    }
}
