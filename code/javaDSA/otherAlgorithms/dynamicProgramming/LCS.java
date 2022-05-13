package javaDSA.otherAlgorithms.dynamicProgramming;

import java.util.Arrays;

public class LCS {

    static String str = "Prasanta";
    static String t = "rsPta";
    public static void main(String[] args) {
        int arr[][] = new int[str.length()+1][t.length()+1];
        for (int[] is : arr) {
            Arrays.fill(is, -1);
        }
        int ans = longestsubsequence(str,t, 0,0,arr);
        System.out.println(ans);
    }

    //Using Recursion
    private static int longestsubsequence(String str, String t, int i, int j) {
        if(i==str.length()|| j==t.length()){
            return 0;
        }
        else if(str.charAt(i) == t.charAt(j)){
            return 1+longestsubsequence(str, t, i+1, j+1);
        }
        else {
            return Math.max(longestsubsequence(str, t, i+1, j), longestsubsequence(str, t, i, j+1));
        }
    }   

    //Using Memoization
    private static int longestsubsequence(String str, String t, int i, int j,int arr[][]){
        if(i==str.length()|| j==t.length()){
            return 0; 
         }
         if(arr[i][j] != -1) return arr[i][j];

        else if(str.charAt(i) == t.charAt(j)){
               return arr[i][j] = 1+longestsubsequence(str, t, i+1, j+1,arr);
            }
        else{
            return arr[i][j] = Math.max(longestsubsequence(str, t, i+1, j,arr), longestsubsequence(str, t, i, j+1,arr));
        }
    }
}
