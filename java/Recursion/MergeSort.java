package Recursion;

public class MergeSort {


    public static void merge(int[] arr, int low, int high, int mid) {
        int left = low;
        int right = mid + 1;
        // ArrayList<Integer> temp = new ArrayList<>();
        int[] temp = new int[high - low + 1];
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                k++;
                left++;
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];

        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void MS(int[] arr, int low, int high) {
        if (low >= high) return; // Base case

        int mid = low + (high - low) / 2;

        MS(arr, low, mid); // Left part
        MS(arr, mid + 1, high); // Right part
        merge(arr, low, high, mid); // merge left and right part
    }


    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 6, 2, 5, 7};
        int n = arr.length;

        System.out.println("Before Sorting :");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        MS(arr, 0, n - 1);


        System.out.println("\n After Sorting :");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

