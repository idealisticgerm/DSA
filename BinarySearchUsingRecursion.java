


public class BinarySearchUsingRecursion {
    public static int search(int[] arr, int start,int end,int target){
        int mid = start + (end - start) /2;

//        Base Condition
        if(start > end){
            return -1;
        }

        if(arr[mid] == target){
            return mid;
        }
        else if (arr[mid] < target) {
            return search(arr,mid+1,end,target);
        }
        else {
            return search(arr,start,mid-1,target);
        }



    }
    public static void main(String[] args){

        int[] arr = {11,23,58,65,75,98,102};
        int target = 65;
        System.out.println(search(arr,0,arr.length -1,target));
    }
}


