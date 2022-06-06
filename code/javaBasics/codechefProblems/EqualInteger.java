package javaBasics.codechefProblems;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class EqualInteger {
    public static void main(String[] args) {
        int t = 0;
        Scanner sc = new Scanner(System.in);
        
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == y){
                System.out.println(0);
            }
            else if(y>x){
                System.out.println(y-x);
            }
            else{
                if(x%2 == 0){
                    if(y%2==0){
                        System.out.println((x-y)/2);
                    }else{
                        System.out.println(((x+1-y)/2)+1);
                    }
                }
                else{
                    if(y%2 == 0){
                        System.out.println(((x+1-y)/2)+1);
                    }
                    else{
                        System.out.println((x-y)/2);
                    }
                }
            }
        }
    }
}
