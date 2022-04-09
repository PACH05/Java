package javaBasics;

import java.util.Scanner; //A package is imported 


//Basic I/O operations in Java

/* Every Java Program needs to be inside a public class and the name of the public class should be same as
the name of the Java file.*/

public class FirstJavaProgram{
    public static void main(String args[]) {  //Main Method(Function)
        System.out.println("Hello World"); //System.out.println() is used to print something to the output screen
        Scanner sc = new Scanner(System.in);  // sc is an object of Scanner class. It is used to take input fro user.
        int a = 0;           // A variable "a" is a variable
        a = sc.nextInt();  // nextInt() is method of Scanner class to take integer inputs. 
        System.out.println(a); // Value of a is printed..
        sc.close();    // Scanning is stopped as the method close is invoked
    }
}
