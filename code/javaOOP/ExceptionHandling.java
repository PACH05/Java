package javaOOP;

import java.io.IOException;

// Java program to demonstrate
// control flow of try-catch-finally clause
// when exception occur in try block
// and handled in catch block
public class ExceptionHandling {
    public static void main(String[] args) throws IOException {

        // array of size 4.
        int[] arr = new int[3];

        try {
            @SuppressWarnings("unused")
            int i = arr[4];

            // this statement will never execute
            // as exception is raised by above statement
            // System.out.println("Inside try block");
        }

        catch (ArrayIndexOutOfBoundsException ex) {
            throw new ArrayIndexOutOfBoundsException();
            // System.out.println("Exception caught in catch block");
        }

        finally {
            System.out.println("finally block executed");
        }

        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}
