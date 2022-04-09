package javaBasics;

import java.util.*;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        // Scanner class is used to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        sum = a + b;
        System.out.println("Sum of two numbers is " + sum); // Plus sign used to concatenate the output
        sc.close();
    }
}
