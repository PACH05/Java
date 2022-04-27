package javaDSA.stackQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//Find the element that is the nearest greatest element to the right of the number in a given array

public class NextLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        List<Integer> list = new ArrayList<>();
        int[] ans = next_largest_element(arr);
        list = next_largest_element_optimized(arr);
        Collections.reverse(list);
        System.out.println(Arrays.toString(ans));
        for (Integer i : list) {
            System.out.print(i+ " ");
        }
    }

    // Brute Force Approach O(N²)
    private static int[] next_largest_element(int[] arr) {
        int[] ans = new int[arr.length];
        if(arr.length==0) return ans; 
        for (int i = 0; i < ans.length; i++) {
            for (int j = i; j < ans.length; j++) {
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                }
            }
        }
        return ans;
    }
     
    // Optimizing the time complexity using a stack O(N)
    private static List<Integer> next_largest_element_optimized(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        if(arr.length==0) return ans;
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if(stk.isEmpty()){
                ans.add(-1);
                stk.push(arr[i]);
            }
            else if(stk.peek()>arr[i]){
                    ans.add(stk.peek());
                    stk.push(arr[i]);
                }
            else{
            while (stk.size()!=0 && stk.peek()<=arr[i]) {
                stk.pop();
            }
            ans.add(stk.peek());
            stk.push(arr[i]);
            }
            
        }
        return ans;
    }
}
