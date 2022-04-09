package javaDSA.other_algorithms.recursion;

//Easy Recursion problems 
public class RecursionI {

    public static void main(String[] args) {
        
        int[] arr = { 1, 0, 2, 5, 4, 9, 8 };
        int len = lengthofarr(arr, 0);
        System.out.println("Length of array " + len);

        boolean ans = issorted(arr, 0);
        System.out.println(ans);

        boolean flag = poweroftwo(32);
        System.out.println(flag);
    }

    // Method to check whether a number is a power of two using recursion
    private static boolean poweroftwo(int n) {
        if (n == 1)
            return true;
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return poweroftwo(n / 2);
    }

    // Method to find the length of an array using recursion
    private static int lengthofarr(int[] arr, int i) {
        if (i >= arr.length)
            return 0;
        int a = 1 + lengthofarr(arr, i + 1);
        return a;
    }

    // Method to check whether the array is sorted ot not
    public static boolean issorted(int arr[], int i) {
        boolean a = false;
        int n = arr.length;
        if (i == n - 2) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            i++;
            a = issorted(arr, i);
        }
        return a;
    }

}
