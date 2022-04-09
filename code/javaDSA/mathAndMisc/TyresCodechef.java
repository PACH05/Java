package javaDSA.math_and_misc;

import java.util.*;
public class TyresCodechef
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
	  sc.close();
	}
}
