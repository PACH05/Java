package javaBasics.questions;

// Paul has n numbers and she wants to create groups using those numbers. 
// The size of the group can be one or two and the sum of numbers in the group cannot exceed x.
// Help Paul find the minimum number of groups she can make.

// Input
// The first input line contains two integers n and x: the count of numbers and the maximum allowed sum.
// The next line contains integers p[1],p[2],…,p[n]: the value of the numbers.

// Constraints
// 1 <= n <= 200000
// 1 <= x, p[i] <= 1000000000
// p[i] <= x for all i

// Output
// Print one integer the minimum number of groups.

// Example
// Sample Input
// 4 10
// 7 2 3 9

// Sample Output
// 3

// Explanation
// Possible Groups: (2, 3), (3, 7), (2, 7)

import java.util.*;

public class Zomato1 {

    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(7);
         list.add(2);
         list.add(3);
         list.add(9);

         int x = 10;

         int ans = solver(list, x);
         System.out.println(ans);
    }

    private static int solver(ArrayList<Integer> list, int x) {
        Collections.sort(list);
        int ans = 0;
        int i = 0;
        int j = list.size() - 1;

        while(j>=0 && list.get(j)>x){
            j--;
        }

        while(i < j){
            int sum = list.get(i) + list.get(j);
            if(sum > x){
                ans++;
                j--;
            }else if(sum <= x){
                i++;
                j--;
                ans++;
            }
        }
        if(i==j){
          ans++;
        }

        return ans;
    }
    
}
