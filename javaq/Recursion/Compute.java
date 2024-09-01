package javaq.Recursion;

class Compute {
    public static void main(String[] args) {
        Compute compute = new Compute();
        long arr[] = {4, 7, 3, 6, 7};
        long n = arr.length;
        long result[] = compute.getTriangle(arr, n);

        System.out.println("Output: ");
        for (long num : result) {
            System.out.print(num + " ");
        }
    }

    public long[] getTriangle(long arr[], long n) {
        long triangle[][] = new long[(int)n][(int)n];
        for (int i = 0; i < n; i++) {
            triangle[(int)n - 1][i] = arr[i];
        }

        constructTriangle(triangle, (int)n - 2);

        long result[] = new long[(int)n * ((int)n + 1) / 2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[k++] = triangle[i][j];
            }
        }

        return result;
    }

    private void constructTriangle(long triangle[][], int row) {
        if (row < 0) {
            return;
        }

        for (int i = 0; i <= row; i++) {
            triangle[row][i] = triangle[row + 1][i] + triangle[row + 1][i + 1];
        }

        constructTriangle(triangle, row - 1);
    }
}
