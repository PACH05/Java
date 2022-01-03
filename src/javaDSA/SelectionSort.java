package javaDSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println("Original array :" + Arrays .toString(arr));
          select(arr);
        }
    
    public static void select(int[] ar){
            for (int i = 0; i < ar.length; i++) {
               int last = ar.length-i-1;
               int maxind = getmax(ar, 0, last);
               swap(ar, maxind, last);
            }
          System.out.println("After Sorting : " + Arrays.toString(ar));
    }
    static void swap(int[] arr, int first, int end){
                int temp = arr[first];
                arr[first]=arr[end];
                arr[end]=temp;

                // arr[first]^=arr[end];
                // arr[end]^=arr[first];
                // arr[first]^=arr[end];
    }
    private static int getmax(int[] ar, int start, int last) {
            int max=start;
            for (int i = start; i <= last; i++) {
                if(ar[max] < ar[i]){
                    max=i;
                }
            }
                return max;
            }
           
    }

