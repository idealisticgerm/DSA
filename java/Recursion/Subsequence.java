package Recursion;

import java.util.ArrayList;

public class Subsequence {
//static void subseq(int index, ArrayList<Integer> ds,int sum,int given_sum,int[] arr){
//    if(index == arr.length){
//        if(sum == given_sum){
//            System.out.println(ds);
//        }return;
//    }
//
//    ds.add(arr[index]);
//    sum += arr[index];
//    subseq(index + 1,ds,sum,given_sum,arr);
//
//    sum-= arr[index];
//    ds.remove(ds.size() -1);
//    subseq(index + 1,ds,sum,given_sum,arr);
//
//}


    // If want to print only one subsequence
//static boolean subseq(int index, ArrayList<Integer> ds,int sum,int given_sum,int[] arr){
//    if(index == arr.length){
//        if(sum == given_sum){
//            System.out.println(ds);
//            return true;
//        }
//
//        else{return false;}
//    }
//
//    ds.add(arr[index]);
//    sum += arr[index];
//    if(subseq(index + 1,ds,sum,given_sum,arr) == true){
//        return true;
//    };
//
//    sum-= arr[index];
//    ds.remove(ds.size() -1);
//    if(subseq(index + 1,ds,sum,given_sum,arr) == true){
//        return true;
//    };



    // If want to return count of subsequences

//    int f(){
//        if base condition satisfies return 1;
//        else return 0;
//
//        l = f();
//        r = f();
//
//        return l +r;
//    }
    static int subseq(int index, ArrayList<Integer> ds,int sum,int given_sum,int[] arr){
    if(index == arr.length){
        if(sum == given_sum){
            System.out.println(ds);
            return 1;
        }

        else{return 0;}
    }

    ds.add(arr[index]);
    sum += arr[index];
    int l = subseq(index + 1,ds,sum,given_sum,arr);


    sum-= arr[index];
    ds.remove(ds.size() -1);
       int r= subseq(index + 1,ds,sum,given_sum,arr);

    return l + r;

}
    public static void main(String[] args) {
    int[] arr = {1,2,1};
    ArrayList<Integer> ds = new ArrayList<>();
        System.out.println(subseq(0,ds,0,2,arr));;
    }
}
