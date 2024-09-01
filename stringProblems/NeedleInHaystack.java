package stringProblems;

public class NeedleInHaystack {
    public static int find(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();

        if (hlen == 0) return -1;
        if (nlen == 0) return 0;

        for (int i = 0; i < hlen; i++) {
            if (i + nlen > hlen) break;

            for (int j = 0; j < nlen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                else if (j == nlen - 1) {
                    return i;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        find("sadbutsad", "sad");
    }
}
