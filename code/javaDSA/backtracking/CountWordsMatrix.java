package javaDSA.backtracking;

public class CountWordsMatrix {
    public static void main(String[] args) {
        char[][] arr = { { 'S', 'N', 'B', 'S', 'N' },
                { 'B', 'A', 'K', 'E', 'A' },
                { 'B', 'K', 'B', 'B', 'K' },
                { 'S', 'E', 'B', 'S', 'E' } };
        String target = "SNAKES";
        int ans = wordPath(arr, target);
        System.out.println(ans);
    }

    private static int wordPath(char[][] arr, String target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == target.charAt(0))
                ans = ans + helper(i, j, arr, target, 0);
            }
        }
        return ans;
    }

    private static int helper(int i, int j, char[][] arr, String target, int k) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == '#')
            return 0;

        if (arr[i][j] != target.charAt(k))
            return 0;

        if (k == target.length() - 1) {
            return 1;
        }
        arr[i][j] = '#';

        int ans = helper(i, j + 1, arr, target, k + 1) +
                helper(i + 1, j, arr, target, k + 1) +
                helper(i - 1, j, arr, target, k + 1) +
                helper(i, j - 1, arr, target, k + 1);

        arr[i][j] = target.charAt(k);
        return ans;
    }



}
