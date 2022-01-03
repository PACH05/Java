package javaDSA;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = { 4, 5, 1, 2, 3 };
        System.out.println("Original Array : " + Arrays.toString(ar));
        inserti(ar);
        System.out.println("After Sorting :" + Arrays.toString(ar));
    }

    public static int[] inserti(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return a;
    }

    static void swap(int[] arr, int first, int end) {
        // int temp = arr[first];
        // arr[first]=arr[end];
        // arr[end]=temp;
        arr[first] = arr[first] ^ arr[end];
        arr[end] = arr[first] ^ arr[end];
        arr[first] = arr[first] ^ arr[end];

    }

}
