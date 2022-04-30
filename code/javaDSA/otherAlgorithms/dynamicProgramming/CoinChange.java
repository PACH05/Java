package javaDSA.otherAlgorithms.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {
    
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int[] coin = {1,3,5};
        int target= 12;
        // coinchange(ans, res, coin, target, 0);
        coinchangedp(ans, res, coin, target, 0);
        for (List<Integer>  i : ans) {
            System.out.println(i);
            
        }
    }
  // Recursive Approach (Backtracking)
    private static void coinchange( List<List<Integer>> ans, List<Integer> res, int[] coin, int target, int index) {
        if(target==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(index == coin.length) return;

        if(coin[index]<=target){
            res.add(coin[index]);
            coinchange(ans, res, coin, target-coin[index], index);
            res.remove(res.size()-1);
        }
        coinchange(ans, res, coin, target, index+1);

        return;
    }
    //Dynamic Programming(Tabulation)
    private static void coinchangedp( List<List<Integer>> ans, List<Integer> res, int[] coin, int target, int index){
        int dp[][] = new int [coin.length+1][target+1];
        
        
    }


}
