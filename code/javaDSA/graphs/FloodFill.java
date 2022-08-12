package javaDSA.graphs;

import java.util.Arrays;

// Famous graph question 
public class FloodFill {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;         //Output = {{2,2,2},{2,2,0},{2,0,1}}
        int ans[][] = floodFill(matrix, sr, sc, newColor);
        for (int[] is : ans) {
            System.out.println(Arrays.toString(is));
        }
    }
    private static int[][] floodFill(int[][] matrix, int sr, int sc, int newColor) {
        int initCol = matrix[sr][sc];
        int ans[][] = matrix;
        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,1,0,-1};
        dfs(sr, sc, ans,matrix, newColor, delRow, delCol, initCol);
        return ans;
    }

    private static void dfs(int sr, int sc, int[][] ans, int[][] matrix, int newColor, int[] delRow, int[] delCol, int initCol) {
        ans[sr][sc] = newColor;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = sr + delRow[i];
            int ncol = sc + delCol[i];

            if(nrow >= 0 && nrow<n && ncol >=0 && ncol <m && 
            matrix[nrow][ncol] == initCol && matrix[nrow][ncol] != newColor){
                dfs(nrow, ncol, ans, matrix, newColor, delRow, delCol, initCol);
            }
        }
    
    }
}
