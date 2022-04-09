package javaDSA.array_problems;

public class MedianOfTwoSortedArray {
    static double Medianofarrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            }

            else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        if ((m + n) % 2 == 0) {
            int x = (m + n) / 2;
            double p = arr[x];
            double q = arr[x - 1];
            return (p + q) / 2;

        } else {
            return arr[(m + n) / 2];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        int brr[] = { 3, 4 };
        double r = Medianofarrays(arr, brr);
        System.out.println(r);
    }
}
