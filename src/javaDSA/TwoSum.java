package javaDSA;

import java.util.Arrays;
import java.util.HashMap;

//This is the solution of a Leetcode question "Two Sum"
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,1,8,3,5,6};
        int target = 10;
        System.out.println(Arrays.toString(twosum_naive(arr,target)));
        System.out.println(Arrays.toString(twosum_optimized(arr,target)));
    }

    //This is the Brute Force approach having time complexity O(N²)
    private static int[] twosum_naive(int[] arr, int target) {
        int[] res =  new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
    //This is an optimized approach using Hashmap having a time complexity of O(N) as lookup time is O(1)
    private static int[] twosum_optimized(int[] arr, int target) {
        int[] res =  new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            if(map.containsKey(target - arr[i])){
                res[0] = i;
                res[1]=map.get(target - arr[i]);
            }
            map.put(arr[i], i);
        }
        return res;
    }
}
