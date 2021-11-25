package javaPractice;

import java.util.*;

public class SumofTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = 0; i < b; i++) {
            c = a * a;
        }
        System.out.println("Sum of two numbers is " + c);
        sc.close();
    }
}
