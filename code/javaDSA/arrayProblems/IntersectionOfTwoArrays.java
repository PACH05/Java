package javaDSA.arrayProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int num1[] = {9,4,9,8,4};
        int num2[] = {4,9,5};
        System.out.println(Arrays.toString(intersection(num1, num2)));
        
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                set.add(nums2[j]);
                i++;
                j++;
            }
        }
        int count = 0;
        int ans[] = new int[set.size()];
        for (Integer k : set) {
            ans[count++] = k;
        }
        return ans;
    }
    
}
