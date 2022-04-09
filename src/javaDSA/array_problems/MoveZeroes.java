package javaDSA.array_problems;
import java.util.ArrayList;


public class MoveZeroes {
    public static void main(String[] args){

        int arr[] = {1,8,0,9,7,0,8,3,0,5};
        
        moveZeroes(arr);
    }

    //Move zeroes to the end of the array
    public static void moveZeroes(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int pos = arr.length-1;
        int num_zeros=0;

        for (int i = 0; i < pos; i++) {
            if (arr[i]==0){
              num_zeros++;
            }
        }
        for (int nums: arr) {    //Adding NonZero elements in the list
            if (arr[nums]!=0){
                ans.add(arr[nums]);
            }
        }
        while(num_zeros!=0){
            ans.add(0);
            num_zeros--;
        }
        
        for (Integer an : ans) {
            System.out.println(an);
        }
    }
}
