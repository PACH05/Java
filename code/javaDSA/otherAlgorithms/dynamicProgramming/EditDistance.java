package javaDSA.otherAlgorithms.dynamicProgramming;

import java.util.Arrays;

/*Problem Statement :
Given two strings, convert the first string into second string in minimum number of steps
Steps allowed : INSERT, DELETE, REPLACE
The string contains only lowercase alphabets */

public class EditDistance {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int l1 = word1.length(), l2 = word2.length();
        int ans = editDistance(word1, word2, l1 - 1, l2 - 1);
        System.out.println("Recursion Answer : " + ans);
        int dp[][] = new int[l1][l2];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
        System.out.println("Memoization Answer : " + editDisMemo(word1, word2, l1 - 1, l2 - 1, dp));
        int t[][] = new int[l1 + 1][l2 + 1];
        System.out.println("Tabulation Answer : " + editDisTab(word1, word2, t));
    }

    // Recursion
    private static int editDistance(String word1, String word2, int i, int j) {
        if (i < 0)
            return j + 1; // Insertion needed in the remaining part of word1
        if (j < 0)
            return i + 1; // Deletion needed in the remaining part of word1

        if (word1.charAt(i) == word2.charAt(j)) {
            return editDistance(word1, word2, i - 1, j - 1); // if both are same then continue
        }

        return 1 + Math.min(editDistance(word1, word2, i, j - 1),
                Math.min(editDistance(word1, word2, i - 1, j), editDistance(word1, word2, i - 1, j - 1)));
    }

    // Memoization
    private static int editDisMemo(String word1, String word2, int i, int j, int dp[][]) {
        if (i == -1)
            return j + 1; // Insertion needed in the remaining part of word1
        if (j == -1)
            return i + 1; // Deletion needed in the remaining part of word1

        if (dp[i][j] != -1)
            return dp[i][j]; // If answer is already stored

        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = editDistance(word1, word2, i - 1, j - 1); // if both are same then continue
        }
        return dp[i][j] = 1 + Math.min(editDistance(word1, word2, i, j - 1),
                Math.min(editDistance(word1, word2, i - 1, j),
                        editDistance(word1, word2, i - 1, j - 1)));
    }

    // Tabulation
    private static int editDisTab(String word1, String word2, int dp[][]) {

        int l1 = word1.length();
        int l2 = word2.length();
        for (int i = 0; i <= l1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= l2; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else
                    dp[i][j] = 1 + Math.min(dp[i][j - 1],
                            Math.min(dp[i - 1][j],
                                    dp[i - 1][j - 1]));
            }
        }
        return dp[l1][l2];
    }
}