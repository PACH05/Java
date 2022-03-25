/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t != 0){
	       int bike = sc.nextInt();
	       int car = sc.nextInt();
	       int tc=4*car;
	       int tb=2*bike;
	       System.out.println(tc+tb);
	       t--;
	  }
	}
}
