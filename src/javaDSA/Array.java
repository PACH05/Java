package javaDSA;

import java.util.Scanner;

//This program deals with the concepts of for-each loop and various array operations
public class Array {
    public static void insert(int[] arr) {
        // Inserting array elements
        int k;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            k = i + 1;
            System.out.println("Enter the element at position " + k);
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void print(int[] arr) {
        // Displaying array elements
        System.out.println("Array elements are :");
        for (int element : arr) {
            System.out.println(element);
        }
    }

    // Delete an element from the array
    public static void delete(int[] arr) {
        int n = arr.length;
        Scanner s = new Scanner(System.in);
        int key;
        System.out.println("Enter the element to be deleted :");
        key = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                n = n - 1;
                for (int j = i; j < n; j++) {
                    arr[j] = arr[j + 1];
                }
                System.out.println("Element deleted");
                break;
            } else {
                System.out.println("Element not found!");
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, key;
        int n = 1;
        System.out.println("Enter the size of the Array");
        size = sc.nextInt();
        int arr[] = new int[size];

        while (n != 0) {
            System.out.println(" MENU :\n 1. Insert \n 2. Print \n 3. Delete \n");
            System.out.println("Enter your choice :");
            key = sc.nextInt();
            switch (key) {
            case 1:
                insert(arr);
                break;
            case 2:
                print(arr);
                break;
            case 3:
                delete(arr);
                break;
            default:
                System.out.println("Wrong Number!!");
                break;
            }
            System.out.println("Wish to continue ? 1/0");
            n = sc.nextInt();

        }
        sc.close();

    }
}
