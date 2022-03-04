package javaDSA;

//Save Ironman

public class StringOps {
    
    public static void main(String[] args) {
        String s="Ab?/Ba";
        int len=s.length();
        char st[]= new char[len];
        String rev="";
        boolean b=false;
        int start=0,end=len-1;
        st=s.toCharArray();
        // s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.replaceAll("//s","");
        System.out.println(s);
        while (start < end)
        {
            // XOR for swapping the variable
            st[start] ^= st[end];
            st[end] ^= st[start];
            st[start] ^= st[end];
     
            ++start;
            --end;
        }
        
      System.out.println(rev);
       if(s.equalsIgnoreCase(rev)){
         System.out.println("true");
       }
       else{
           System.out.println("False");
       }
       System.out.println(b);
    }
}

