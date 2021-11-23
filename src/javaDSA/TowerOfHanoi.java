package javaDSA;

import java.util.Scanner;

//This program deals with the concept of the Tower of Hanoi problem
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n, A = 1, B = 2, C = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the discs :");
        n = sc.nextInt();
        TOH(n, A, B, C);
        sc.close();
    }

    static void TOH(int n, int A, int B, int C) {

        if (n > 0) {
            TOH(n - 1, A, C, B);
            System.out.println("Move disc from " + A + " to " + C);
            TOH(n - 1, B, A, C);
        }
    }

}
