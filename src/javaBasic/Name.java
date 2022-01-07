package javaBasic;

import java.util.*;

//Basic I/O operations in Java
public class Name {

    public static void main(String args[]) {
        System.out.println("Hello");
        //String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is " + sc.nextInt());
        System.out.println("Number is " + sc.next());
        sc.close();
    }
}
