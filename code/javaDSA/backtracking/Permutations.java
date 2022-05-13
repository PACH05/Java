package javaDSA.backtracking;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        allPermutation(str, "");
    }

    private static void allPermutation(String str, String perm) {
        if(str.length()==0){
            System.out.println(perm);
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String substr = str.substring(0, i)+str.substring(i+1);
            allPermutation(substr, perm+curr);            
        }
    }
}
