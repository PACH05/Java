package javaDSA.otherAlgorithms.sortingAlgorithms;

import java.util.*;

public class InsertionSort {
    static int[] arr = {5,3,4,2,1};
    public static void main(String[] args) {
        SortingArray sort = new SortingArray();
        sort.insertion(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}

class SortingArray{
    public void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]< arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else break;
            }
        }
    }
}


