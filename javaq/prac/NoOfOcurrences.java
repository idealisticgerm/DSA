package javaq.prac;

public class NoOfOcurrences {

    static int occurences(int[] arr, int target){
        int count = 0;
        for(int j:arr){
            if(j == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = ArrayUtility.InputArray();
        int target = 5;

        System.out.println("The element " + target + " has occurred " + occurences(arr,target) + " times");
    }
}
