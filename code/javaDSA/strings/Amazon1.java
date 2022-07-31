package javaDSA.strings;

//In the given string, count the occurences of each alphabet until another alphabet is encountered.
public class Amazon1 {
    public static void main(String[] args) {
        String st = "aaabbbbbcccaaa";
        // O/P -> a3b5c3a3

        //Solution
        StringBuilder sb = new StringBuilder();
        char curr = st.charAt(0);
        int count = 1;
        int i = 1;
        for (i = 1; i < st.length(); i++) {     
            if(st.charAt(i) != curr){
                sb.append(st.charAt(i-1));
                sb.append(Integer.toString(count));
                curr = st.charAt(i);
                count = 1;
            }else{
                count++;
            }
        }
        sb.append(st.charAt(i-1));
        sb.append(Integer.toString(count));
        System.out.println(sb.toString());
    }
}
