package InfosysProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RPG {
    public static int count(){
        Scanner sc  = new Scanner(System.in);

        int numberofmonsters = sc.nextInt();
        int exp = sc.nextInt();

        int[][] monsterarr = new int[numberofmonsters][2];

        for(int i= 0; i<numberofmonsters; i++){
            monsterarr[i][0] = sc.nextInt();
            monsterarr[i][1] = sc.nextInt();
        }

        Arrays.sort(monsterarr,(a,b) -> Integer.compare(a[0],b[0]));

        int defeatedCount = 0;

        for(int i = 0; i<numberofmonsters; i++){
            if(exp>=monsterarr[i][0]){
                exp += monsterarr[i][1];
                defeatedCount++;
            }
            else{
                break;
            }
        }

        return defeatedCount;

    }




    public static void main(String[] args) {
        System.out.println(count());

    }
}
