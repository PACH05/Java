package javaOOP;

import java.util.Arrays;

public class Comparator {
  public static void main(String[] args) {
      Integer arr[] = {1,3,5,2,7};  // Here array of Integer is used instead of int because comparators work only with objects
      Arrays.sort(arr); // Sorting in Ascending Order 
      System.out.println(Arrays.toString(arr)); //Prints array in ascending order
      Arrays.sort(arr, (a,b) -> b-a); // Sorting in Descending Order (By using Comparator)
      System.out.println(Arrays.toString(arr));  // Prints array in Descending Order
  }    
}

