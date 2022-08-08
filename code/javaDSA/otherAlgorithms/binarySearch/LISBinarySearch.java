package javaDSA.otherAlgorithms.binarySearch;

import java.util.ArrayList;
//Longest Increasing Subsequence using Binary Search
public class LISBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,7,8,4,5,6,-1,9};
        int ans = longestIncreasingSubsequence(arr);
        System.out.println(ans);
    }

        public static int longestIncreasingSubsequence(int arr[]) {
             ArrayList<Integer> ans = new ArrayList<>();
            ans.add(arr[0]);
            int len = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > ans.get(ans.size() - 1)) {
                    ans.add(arr[i]);
                    len++;
                } else {
                    int indx = binarySearch(ans, arr[i]);
                    ans.set(indx, arr[i]);
                }
            }
            return len;
        }
        
         static int binarySearch(ArrayList<Integer> ans, int key) {
            int low = 0;
            int high = ans.size() - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (ans.get(mid) == key) return mid;
                else if (ans.get(mid) < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return high + 1;
    }
}
