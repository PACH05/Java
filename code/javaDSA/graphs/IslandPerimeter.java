package javaDSA.graphs;

//LeetCode Question island perimeter, solved without DFS
public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int ans = findPerimeter(matrix);
        System.out.println(ans);
    }

    private static int findPerimeter(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1){
                    result += 4;
                    if(i>0 && matrix[i - 1][j] == 1) result -= 2;
                    if(j>0 && matrix[i][j - 1] == 1) result -= 2;
                }   
            }
        }
        return result;
    }
}
