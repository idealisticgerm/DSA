package javaq.prac;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] InputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element no " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
