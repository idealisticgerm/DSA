import java.util.ArrayList;


public class Fibonacci {
static int f(int n,ArrayList<Integer> dp){
    if(n<=1){
        return n;
    }

    if(dp.get(n)!= -1 ){
        return dp.get(n); // Check whether the problem already exists
    }

    int result = f(n-1,dp) + f(n-2,dp);
    dp.set(n,result); //Store computed result in dp array

    return result;
}

    public static void main(String[] args) {
    int n = 6;
        ArrayList<Integer> dp = new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            dp.add(-1);
        }
        System.out.println(f(n,dp));
    }
}


//Step 1:Declare a dp array with all elements as -1

//Step 2:Store computed result on dp array
//int result = f(n-1,dp) + f(n-2,dp);
//    dp.set(n,result);

//Step 3 : Check whether the problem already exists in dp array if so then don't compute return it