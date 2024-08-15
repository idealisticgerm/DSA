public class array {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 50, 87, 25, 27, 15, 3, 2, 4 };
        display(arr);

    }
}
