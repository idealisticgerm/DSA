package hashmap;

import java.util.*;

/**
 * FreqOfCharacters
 */
public class FreqOfCharacters {
    private static String sortedString(String s) {
        LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }
        String rev = "";

        List<Map.Entry<Character, Integer>> ls = new ArrayList<>(freq.entrySet());
        ls.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
        Collections.reverse(ls);

        for (Map.Entry<Character, Integer> m : ls) {
            // System.out.println(m.getKey() + ": " + m.getValue());
            int count = m.getValue();
            for(int i = 0; i < count; i++){
                rev = rev + m.getKey();
            }

        }

        // for (Character key : freq.descendingKeySet()) {
        // int count = freq.get(key);
        // for(int i=0;i<count;i++){
        // rev = rev + key;
        // }
        // }

        // for(Character key:freq.keySet()){
        // System.out.println(key + ": " + freq.get(key));
        // }
        // System.out.println(rev);

        return rev;
    }

    public static void main(String[] args) {
        String s = "Aabb";

        System.out.println(sortedString(s));

    }
}