package javaBasics.codechefProblems;

import java.util.Scanner;

public class CpPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int pa = sc.nextInt();
            int pb = sc.nextInt();
            int qa = sc.nextInt();
            int qb = sc.nextInt();
            int aa = Math.max(pa, pb);
            int ab = Math.max(qa, qb);
            if(aa<ab){
                System.out.println("P");
            }
            else if(aa>ab){
                System.out.println("Q");
            }
            else {
                System.out.println("TIE");
            }
        }
    }
    
}
