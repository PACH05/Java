package javaBasics;

import java.util.*;

//Basic I/O operations in Java
public class FirstJavaProgram{

    public static void main(String args[]) {
        System.out.println("Hello World");
        //String st;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println(System.identityHashCode(a));

        sc.close();
    }
}
