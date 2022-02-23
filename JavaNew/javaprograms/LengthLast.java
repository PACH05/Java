public class LengthLast {
    public static void main(String[] args) {
     String s = "a";
     s=s.trim();     // removing leading and trailing zeroes
     int a = lastlength(s);
        System.out.println("Length of last word is : " + a);
    }

    public static int lastlength(String s){
        s=s.trim();  // removing leading and trailing zeroes
        int length = 0;
        char[] str = s.toCharArray();

        for(int i = str.length-1; i>=0; i--){
            if(str[i]!= ' '){
                length++;
            }
            else{
                break;
            }
        }
        //returning the answer
        return length;
    }
}
