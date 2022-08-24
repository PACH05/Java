package javaBasics.questions;

import java.io.*;

import java.util.*;

public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while (n-- > 0) {
			String s = sc.next();
			if (s.length() > 10) {
				System.out.println(s.charAt(0) + "" + (s.length() - 2) + "" + s.charAt(s.length() - 1));
			} else {
				System.out.println(s);
			}
		}
        sc.close();
	}
}
