package javaDSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        System.out.println("Original array :" + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting :" + Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            swap(arr, i, min_idx);
        }
    }

    static void swap(int[] arr, int first, int end) {

        arr[first] = arr[first] ^ arr[end];
        arr[end] = arr[first] ^ arr[end];
        arr[first] = arr[first] ^ arr[end];
    }

}
