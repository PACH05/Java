package javaDSA.otherAlgorithms.binarySearch;

// The rows and colums are sorted in the matrix, find the target element in the matrix
// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.

public class SearchInA2DMatrix {
    public static void main(String[] args) {
        int grid[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 17;
        System.out.println(searchElement(grid, target));

    }

    private static boolean searchElement(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;// If element is not present
    }
}
