package javaDSA.graphs;

public class RottenOranges {
    public static void main(String[] args) {
        int matrix[][] = { { 2, 1, 1 },
                { 1, 1, 0},
                { 0, 1, 1},};
        //2 -> Rotten, 1->Fresh, 0 -> Empty cell
        int time = rottenOranges(matrix,0,0);
        
    }

    private static int rottenOranges(int[][] matrix, int i, int j) {
        int vis[][] = new int[matrix.length][matrix[0].length];
        int countFr = 0;
        return 0;
    }
}
