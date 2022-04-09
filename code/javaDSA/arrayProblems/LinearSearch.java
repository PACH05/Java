package javaDSA.arrayProblems;

import java.util.Scanner;

// Thi program deals with the concept of Linear Search in an array
public class LinearSearch {

    public static void main(String[] args) {
        int size, key, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : \n");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements :");
        // Input in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched : \n");
        key = sc.nextInt();
        // Linear Search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                k = i + 1;
                System.out.println("Element found at position " + k + "\n");
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Element not found !");
            }
        }
        sc.close();
    }
}
