package javaDSA.otherAlgorithms.sortingAlgorithms;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr  = {5,4,1,2,3,9,7,6,8,10,12,11,13,15,14};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        cyclesort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
   //This Cycle sort works for only on non zero element, for array with zero remove -1 from line 16
    private static void cyclesort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
    }
}
