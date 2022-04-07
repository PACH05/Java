package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Features {
    public static void main(String[] args) {
        int arr[] = {1,5,6,8,9,3};
        List al = new ArrayList(Arrays.asList(arr));
        Collections.sort(al);
        al.forEach(System.out::println);
    }
}
