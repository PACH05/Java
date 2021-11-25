package javaBasic;

import java.util.*;

//Basic I/O operations in Java
public class Name {

    public static void main(String args[]) {
        System.out.println("Hello");
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        st = sc.next();
        System.out.println("Hi " + st + "\n");
        sc.close();
    }
}
