/**
 * quicksort
 */
public class quicksort {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }

    }

    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        for (int i : arr) {
            System.out.print(i + " ");
        }

        qs(arr, 0, arr.length - 1);
        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}