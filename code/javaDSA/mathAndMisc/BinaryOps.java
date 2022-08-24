package javaDSA.mathAndMisc;

import java.util.Stack;

public interface BinaryOps {
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        int ans = solve(str);
        System.out.println(ans);
    }

    //1C0C1C1A0B1
    public static int solve(String str) {
        Stack<Integer> stk = new Stack<>();
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A'){
                if(!stk.isEmpty()){
                    ans = stk.pop() & Character.getNumericValue(str.charAt(i));
                    stk.push(ans);
                }
                else{
                    ans = str.charAt(i - 1) & str.charAt(i + 1);
                    stk.push(ans);
                }
            }
            else if(str.charAt(i) == 'C'){
                if(!stk.isEmpty()){
                    ans = stk.pop() ^ Character.getNumericValue(str.charAt(i));
                    stk.push(ans);
                }
                else{
                    ans = str.charAt(i - 1) ^ str.charAt(i + 1);
                    stk.push(ans);
                }
            }
            else if(str.charAt(i) == 'B'){
                if(!stk.isEmpty()){
                    ans = stk.pop() | Character.getNumericValue(str.charAt(i));
                    stk.push(ans);
                }
                else{
                    ans = str.charAt(i - 1) | str.charAt(i + 1);
                    stk.push(ans);
                }
            }
        }
        return stk.pop();
    }
}
