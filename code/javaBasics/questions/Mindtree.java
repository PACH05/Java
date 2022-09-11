package javaBasics.questions;

public class Mindtree {
    public static void main(String[] args) {
        String str = "asfhdsu23$sdhfsd#";

        int a = counter(str);
        System.out.println(a);
    }

    private static int counter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>= '1' && str.charAt(i)<='9') || 
            (str.charAt(i)>='A' && str.charAt(i)<='Z') || str.charAt(i) == ' '){
                count++;
            }
        }
        return str.length() - count;
    }
}


