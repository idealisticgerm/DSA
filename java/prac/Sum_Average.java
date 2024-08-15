public class Sum_Average {
    static long sum(int[] arr){
//        int n = arr.length;
        int sum =0;
        for (int j : arr) {
            sum += j;

        }

        return sum;
    }
 static double average(int[] arr){
        double Sum = sum(arr);
        return (Sum/arr.length);
 }

    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum and Average");
        System.out.println("----------------------------------------------------");

    int[] arr = ArrayUtility.InputArray();

        System.out.println("Sum of the given elements is: "+sum(arr));
        System.out.println("Average of the given elements is: "+average(arr));


    }
}
