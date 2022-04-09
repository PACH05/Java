package javaDSA.array_problems;

import java.util.Arrays;

public class KLargestElement {

    static int[] klargest(int arr[], int n, int k) {
        int ans[] = new int[k];
        Arrays.sort(arr);
        for (int i = 1; i < k; i++) {
            ans[i] = arr[n - i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 787, 1, 23 };
        int[] a;
        int n = arr.length, k = 2;
        a = klargest(arr, n, k);
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
