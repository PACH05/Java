package javaDSA.arrayProblems;

import java.util.ArrayList;

//GFG question Find duplicates in an array
public class DuplicatesInArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=0; i<n; i++)
            arr[arr[i] % n] += n;
    
        for(int i=0; i<n; i++)
            if(arr[i] / n > 1)
                al.add(i);

        if(al.size() == 0){
            al.add(-1);
            return al;
        }
        return al;
    }
}
