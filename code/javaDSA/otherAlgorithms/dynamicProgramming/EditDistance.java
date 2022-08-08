package javaDSA.otherAlgorithms.dynamicProgramming;

import java.util.Arrays;

// Given two strings, convert the first string into second string in minimum number of steps
// Steps allowed : INSERT, DELETE, REPLACE
//The string contains only lowercase alphabets
public class EditDistance {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int l1 = word1.length(), l2 = word2.length();
        int ans = editDistance(word1, word2,l1-1,l2-1);
        System.out.println(ans);
        int dp[][] = new int[l1][l2];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        } 
        System.out.println("Memoization "+ editMemo(word1, word2, l1 - 1, l2 - 1, dp));
        
    }
    //Recursion
    private static int editDistance(String word1, String word2, int i, int j) {
        if(i < 0)return j+1; //Insertion needed in the remaining part of word1
        if(j < 0)return i+1; // Deletion needed in the remaining part of word1

        if(word1.charAt(i) == word2.charAt(j)){
            return editDistance(word1, word2, i - 1, j - 1); //if both are same then continue
        }

        return Math.min(1+editDistance(word1,word2, i, j-1), 
                Math.min(1+editDistance(word1, word2, i-1, j), 1+editDistance(word1, word2, i-1, j-1)));
    }

    //Memoization
    private static int editMemo(String word1, String word2, int i, int j, int dp[][]){
        if(i == -1)return j+1; //Insertion needed in the remaining part of word1
        if(j == -1)return i+1; // Deletion needed in the remaining part of word1
        if(dp[i][j] != -1) return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = editDistance(word1, word2, i - 1, j - 1); //if both are same then continue
        }
        return dp[i][j] = 1+ Math.min(1+editDistance(word1,word2, i, j-1), 
                Math.min(editDistance(word1, word2, i-1, j), 
                         editDistance(word1, word2, i-1, j-1)));
    }
}
