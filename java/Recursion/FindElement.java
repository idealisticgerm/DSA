public class FindElement {

    public static int find(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
          return find(arr,target,index + 1);
        }
    }





    public static void main(String[] args) {
        int[] arr = {1,5,7,2,6,8};

        System.out.println(find(arr,9,0));
    }
}
