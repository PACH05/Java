package javaDSA;

import java.util.Arrays;

public class QuickSort {
    static int arr[] = { 5, 6, 1, 2, 3, 4 };

    public static void main(String[] args) {
        int low = 0;
        int high = arr.length - 1;

        System.out.println(Arrays.toString(arr));
        quicksort(low, high);
        System.out.println(Arrays.toString(arr));

    }

    public static void quicksort(int lo, int high) {
        if (lo < high) {
            int j = partition(lo, high);
            quicksort(lo, j-1);
            quicksort(j + 1, high);
        }
    }

    public static int partition(int low, int high) {
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = low-1;

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
