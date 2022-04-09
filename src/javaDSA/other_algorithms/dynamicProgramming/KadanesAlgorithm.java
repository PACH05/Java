package javaDSA.other_algorithms.dynamicProgramming;

import java.io.*;
import java.util.Scanner;

//Maximum Contiguous Subarray Problem
public class KadanesAlgorithm {

    public static void main(String[] args) throws IOException {
        // size of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements :");
        // adding elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution1 obj = new Solution1();
        int sum = obj.maxSubarraySum(arr,0);
        // calling maxSubarraySum() function
        System.out.println(sum);
        sc.close();
    }
}
// } Driver Code Ends
class Solution1 {
    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    public int maxSubarraySum(int arr[], int n) {

        // Your code here
        int meh = 0, msf = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            meh += arr[i];

            if (meh < arr[i]) {
                meh = arr[i];
            }
            if (msf < meh) {
                msf = meh;
            }

        }
        return msf;

    }

}
