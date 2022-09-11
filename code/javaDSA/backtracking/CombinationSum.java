package javaDSA.backtracking;

import java.util.ArrayList;
import java.util.List;

// Leetcode question Combination Sum

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        combinationSum(candidates, target);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0, candidates, target, result, list);
        return result;
    }
    
    private static void helper(int index, int[] arr, int target,List<List<Integer>> result, List<Integer> list){
        //base
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        if(index == arr.length){
            return;
        }

        if(arr[index]<=target){
            list.add(arr[index]);
            helper(index, arr, target-arr[index],result, list);  //Index Picked 
            list.remove(list.size()-1); // Backtracking Step
        }

        helper(index+1,arr,target,result,list); // Not Pick
    }
}
