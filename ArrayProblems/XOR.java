package ArrayProblems;

import java.util.Scanner;

//public class XOR {
//    static int sum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the max value of x: ");
//        int x = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter the array elements:");
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int max_sum = 0;
//
//        for (int i = 0; i <= x; i++) {
//            int res = 0;
//           for(int j = 0; j<arr.length; j++){
//                res = res + (i ^ arr[j]);
//           }
//           if(res > max_sum){
//               max_sum = res;
//           }
//        }
//
//        return max_sum;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum());
//    }
//}



public class XOR {
    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the max value of x: ");
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = 0;
        int bestX = 0;

        // Iterate through each bit position from most significant (31st) to least significant (0th)
        for (int bit = 31; bit >= 0; bit--) {
            // Create a temporary x by setting the current bit in bestX
            int tempX = bestX | (1 << bit);

            // Ensure that tempX does not exceed k
            if (tempX > k) {
                continue;
            }

            // Calculate the potential new Xor-sum with this bit set
            int tempSum = 0;
            for (int value : arr) {
                tempSum += (tempX ^ value);
            }

            // Debug print
            System.out.println("Bit: " + bit + ", tempX: " + tempX + ", tempSum: " + tempSum);

            // If this new Xor-sum is greater than the current maxSum, update maxSum and bestX
            if (tempSum > maxSum) {
                maxSum = tempSum;
                bestX = tempX;
            }
        }

        // Final Debug print
        System.out.println("BestX: " + bestX + ", MaxSum: " + maxSum);

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}

