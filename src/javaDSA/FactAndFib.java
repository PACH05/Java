package javaDSA;

import java.util.Scanner;
// This deals with the the concept of Recursion

public class FactAndFib {

    public static int fact(int n) {
        int factorial = 1;
        if (n == 0 || n == 1)
            return 1;

        factorial = n * fact(n - 1);
        return factorial;
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int ch, result;

        System.out.println("Enter Choice :");
        System.out.println("1.Factorial\n2.Fibonacci");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch (ch) {
        case 1:
            System.out.println("Enter the number :");
            int numb = sc.nextInt();
            result = fact(numb);
            System.out.println("Factorial = " + result + "\n");
            break;
        case 2:
            System.out.println("Enter number of elements in the series :");
            int num = sc.nextInt();
            int rfib = fib(num);
            System.out.println("Result = " + rfib);
            break;

        default:
            break;
        }
        sc.close();

    }

}
