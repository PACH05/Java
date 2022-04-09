package javaDSA.array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int Bsearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        // if we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String[] args) {
        int x, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        x = sc.nextInt();
        // Array should be sorted to implement Binary Search
        Arrays.sort(arr);
        int ele = Bsearch(arr, x);
        if (ele == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + ele);
        }
        sc.close();
    }
}
