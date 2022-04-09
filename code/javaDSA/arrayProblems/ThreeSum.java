package javaDSA.arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Leetcode question 3Sum
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if(n < 3) return list;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j=i+1, k=n-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                } else if(sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return list;
    }
}
