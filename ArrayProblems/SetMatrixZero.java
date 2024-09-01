package ArrayProblems;
//Leetcode 73
//Input: matrix = [[0,1,2,0],
//                 [3,4,5,2],
//                 [1,3,1,5]]
//Output: [[0,0,0,0],
//         [0,4,5,0],
//         [0,3,1,0]]

public class SetMatrixZero {
    // Brute force TC: (nxm)(n+m)(nxm) approx n^3
    // for row
    public static void markRow(int[][] arr, int i, int m) {
        for (int col = 0; col < m; col++) {
            if (arr[i][col] != 0) {
                arr[i][col] = -1;
            }
        }
    }
    //    for col
    public static void markCol(int[][] arr, int j, int n) {
        for (int row = 0; row < n; row++) {
            if (arr[row][j] != 0) {
                arr[row][j] = -1;
            }
        }
    }
    // set zero function
    public static void setZeroBrute(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i, m);
                    markCol(arr, j, n);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static  void print(int[][] arr, int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Better solution
    public static  void setZeroBetter(int[][] arr,int n,int m){
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                   arr[i][j] = 0;
                }
            }
        }
    } // TC somewhwere about power of 2 and SC = O(n) + O(m)
    public static  void setZeroOptimal(int[][] arr,int n,int m){
        int col0 = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    if(j!= 0){
                        arr[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(arr[0][j] == 0 || arr[i][0] == 0){
                   arr[i][j] = 0;
                }
            }
        }
//        for hash row and col
        if(arr[0][0] == 0){
            for(int j = 0; j < m; j++){
                arr[0][j] = 0;
            }
        }
        if(col0 == 0){
            for (int i = 0; i < n; i++){
                arr[i][0] = 0;
            }
        }
    }



    // main Driver Code
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int n = matrix.length;
        int m = matrix[0].length;

        print(matrix,n,m);
        System.out.println("After setting");
//        setZeroBrute(matrix, n, m); // Function to set zero
//        setZeroBetter(matrix, n, m); // Function to set zero
        setZeroOptimal(matrix, n, m); // Function to set zero
        print(matrix,n,m);

    }
}
