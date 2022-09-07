package javaDSA.backtracking;

import java.util.ArrayList;
import java.util.List;

// Rat in a Maze
public class RatInAMaze {
    public static void main(String[] args) {
        
        int matrix[][] = { { 1, 0, 0, 0 },
                           { 1, 1, 0, 1 },
                           { 1, 1, 0, 0 },
                           { 0, 1, 1, 1 } };
        String str = "";
        List<String> list = new ArrayList<>();
        solveMaze(matrix, 0,0,str, list);
        System.out.println(list);
    }

    private static void solveMaze(int[][] matrix, int i, int j, String path, List<String> ans) {
         if(i < 0 || j < 0 || i == matrix.length || j == matrix[0].length || matrix[i][j] == 0){
            return;
         }
         if(i == matrix.length - 1 && j == matrix[0].length - 1){
            ans.add(path);
            return;
         }
         matrix[i][j] = 0;
         solveMaze(matrix, i+1, j, path + "D", ans);
         solveMaze(matrix, i-1, j, path + "U", ans);
         solveMaze(matrix, i, j+1, path + "R", ans);
         solveMaze(matrix, i, j-1, path + "L", ans);
         matrix[i][j] = 1;
         
    }
}
