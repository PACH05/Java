package javaDSA.otherAlgorithms.sortingAlgorithms;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 4, 1, 8, 9,6,7};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] arr, int[] arr2) {
        int[] mergedarr = new int[arr.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                mergedarr[k] = arr[i];
                i++;
            } else {
                mergedarr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr.length) {
            mergedarr[k] = arr[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            mergedarr[k] = arr2[j];
            j++;
            k++;
        }
        return mergedarr;
    }
}
