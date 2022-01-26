package javaDSA;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter 2 integer :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = findgcd(a,b);
        System.out.println("GCD : " + ans);
    }

    private static int findgcd(int a,int b){
        if(b==0) return a;
        
        return findgcd(b, a%b);
    }
}
