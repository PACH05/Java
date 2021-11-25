package javaBasic2;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int[] ar = new int[10];
        System.out.println("Enter array elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Original array");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        Arrays.sort(ar);
        System.out.println("Sorted Array");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
            sc.close();
        }
    }
}
