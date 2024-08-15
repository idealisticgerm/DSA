package stringProblems;

public class NeedleInHaystack {
    public static  void find(String haystack,String needle){
        int i = 0;
        int j = 0;
        int hlen = haystack.length();
        int nlen = needle.length();

        while(j < nlen){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(i - nlen);
    }

    public static void main(String[] args) {
find("sadbutsad","sad");
    }
}
