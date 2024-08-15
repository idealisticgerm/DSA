import java.util.*;

public class findduplicates {

    public static ArrayList<Integer> duplicate(int[] arr) {

        HashMap<Integer, Integer> dupl = new HashMap<Integer, Integer>();
        ArrayList<Integer> dupliarr = new ArrayList<Integer>();

        for (int i : arr) {
            if (dupl.containsKey(i)) {
                dupl.put(i, dupl.get(i) + 1);
            } else {
                dupl.put(i, 1);
            }
        }
        for (int j : dupl.keySet()) {
            if (dupl.get(j) > 1) {
                dupliarr.add(j);
            }
        }
        

        return dupliarr;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(i + " ");
        // }

         System.out.println(duplicate(arr));;
    }
}
