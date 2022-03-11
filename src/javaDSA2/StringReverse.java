package javaDSA2;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";

        for (int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);  //O(n)
        }
        System.out.println(rev);
    }
}
