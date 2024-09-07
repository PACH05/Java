package javaBasics.questions;

import java.util.Arrays;

//Problem Statement:
// There are several projects, and each is denoted by a one letter name. 
//Each project may depend on one or more other projects (or none). 
//For example, if project A depends on project B, then project A cannot complete before project B. 
//Suppose you are given a list L, of K such dependencies, and also a list D, of J projects that have been delayed.
// Output a list of all projects that will be delayed, in lexicographical (alphabetical) order. 
//You can assume that a project, A, will be delayed if any project A depends on is delayed. 
//The input is guaranteed to contain no circular dependencies.

public class Google1 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 0, 1};
        // int ans = countCustomers(arr);
        // System.out.println(ans);
        int an[] = interchange(arr);
        System.out.println(Arrays.toString(an));
    }

    public static int[] interchange(int[] arr) {
        int answer[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[arr[i]] = i;         
        }
        return answer;
    }


    public static int countCustomers(int[] bill) {
        int answer = 0;
        for (int i = 0; i < bill.length; i++) {
            if(Math.sqrt(bill[i]) == Math.floor(Math.sqrt(bill[i]))){
                answer++;
            }
        }
        return answer;
    }
}
