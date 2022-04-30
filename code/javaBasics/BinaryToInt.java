package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToInt {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //Binary to integer(hard coding)
        binaryToInt();
        // Binary to Integer Using Wrapper class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine(),2); // Takes the binary number as input
        System.out.println(a); // Gives corresponding integer value as output
    }

    private static void binaryToInt() {
        int i = 0B1010;
        System.out.println(i);
    }
    
}
