package javaq.Recursion;

// Leetcode 39(https://leetcode.com/problems/combination-sum/)
// https://takeuforward.org/data-structure/combination-sum-1/
// Pick or not pick method

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void findCombination(int[] arr,int index, int target,List<List<Integer>> ans, ArrayList<Integer> ds){
    if(index == arr.length){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
        }
        return;
    }

    if(arr[index] <= target){
        ds.add(arr[index]);
        findCombination(arr,index,target-arr[index],ans,ds);
        ds.remove(ds.size()-1);
    }
    findCombination(arr,index +1,target,ans,ds);



    }

    public static  List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        findCombination(arr,0,target,ans,new ArrayList<>());

        return ans;


    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        System.out.println(combinationSum(arr,target));
    }
}
