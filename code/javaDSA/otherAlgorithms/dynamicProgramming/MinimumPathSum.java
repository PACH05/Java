package javaDSA.otherAlgorithms.dynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        
    }
    public int minPathSum(int[][] arr) {
        int t[][] = new int[arr.length + 1][arr[0].length + 1];
        for (int e[] : t) Arrays.fill(e, -1);
        return solve(arr, 0, 0, t);
    }
    private int solve(int arr[][], int i, int j, int t[][]) {
        if (i >= arr.length || j >= arr[0].length) {
            return Integer.MAX_VALUE - 100000;
        }
        if (t[i][j] != -1) {
            return t[i][j];
        }
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }
        int bottom = arr[i][j] + solve(arr, i + 1, j, t);
        int right = arr[i][j] + solve(arr, i, j + 1, t);
        return t[i][j] = Math.min(bottom, right);
    }
}
    
