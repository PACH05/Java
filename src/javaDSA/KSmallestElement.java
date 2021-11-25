package javaDSA;

import java.util.Arrays;

public class KSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        int ans = arr[k - 1];
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 20, 15 };
        int n = arr.length;
        int l = 0;
        int k = 4;
        int r = kthSmallest(arr, l, n - 1, k);
        System.out.println(r);

    }

}
