package javaDSA;
import java.util.*;
public class Arrayrev {
    public static void main(String[] args) {
        Integer arr[] = {1,5,8,9,15,25};
        System.out.println(Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr)); 
        System.out.println(Arrays.toString(arr));
    }

}

