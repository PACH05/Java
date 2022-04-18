package javaBasics;

import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double a = sc.nextDouble();
        double sqrt = Math.sqrt(a);
        System.out.println("Sqaure Root of the given number is : "+sqrt);
        sc.close();
    }
}
