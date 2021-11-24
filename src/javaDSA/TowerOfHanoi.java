package javaDSA;

import java.util.Scanner;

//This program deals with the concept of the Tower of Hanoi problem
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n, from = 1, to = 3, aux = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the discs :");
        n = sc.nextInt();
        TOH(n, from, aux, to);
        sc.close();
    }

    static void TOH(int n, int from, int aux, int to) {

        if (n > 0) {
            TOH(n - 1, from, to, aux);
            System.out.println("Move disc from " + from + " to " + to);
            TOH(n - 1, aux, from, to);
        }
    }

}
