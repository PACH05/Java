package javaDSA.otherAlgorithms.dynamicProgramming;

import java.util.Arrays;

//Longest Increasing Subsequence

public class LIS {
    public static void main(String[] args) {
        int arr[] = {1,7,8,4,5,6,-1,9};
        int ans = longestIncreasingSubsequence(arr);
        int tab = lisTabulation(arr);
        System.out.println(ans);
        System.out.println(tab);
    }   
    public static int longestIncreasingSubsequence(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n+1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return solver(arr, -1, 0, dp);
        
	}

    //Memoization
    private static int solver(int[] arr, int prev, int index, int dp[][]){
        if(index == arr.length) return 0;
        if(dp[index][prev+1] != -1) return dp[index][prev+1];
        int l = 0 + solver(arr, prev, index + 1, dp); // not pick
        if(prev == -1 || arr[index] > arr[prev]){
            l = Math.max(1+solver(arr,index,index+1, dp), l); //pick
        }
        
        return dp[index][prev+1] = l;
    }

    
    //Tabulation
    public static int lisTabulation(int arr[]) {		
        int n = arr.length;
        int dp[][] = new int[n+1][n+1];
        for(int[] a : dp){
            Arrays.fill(a, 0);
        }
        for(int i = n - 1; i>= 0; i--){
            for(int j = i - 1; j >= -1; j--){
                 int l = 0 + dp[i+1][j+1]; // not pick
                 if(j == -1 || arr[i] > arr[j]){
                     l = Math.max(1+dp[i+1][i+1], l); //pick
                 }
                dp[i][j+1] = l;
             }
         }
        return dp[0][-1+1];
	}
 
}
