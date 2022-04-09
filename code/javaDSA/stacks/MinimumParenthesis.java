package javaDSA.stacks;

import java.util.Stack;

//1249. Minimum Remove to Make Valid Parentheses
public class MinimumParenthesis {
    public static void main(String[] args) {
        String s = "leet(c(o)de)";
        System.out.println(minimumparenthesis(s));
        
    }
    //Remove unnecessary parenthesis and keep valid parenthesis
    private static String minimumparenthesis(String s){
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> stk = new Stack<>();     // Make a stack
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '('){
                stk.push(sb.charAt(i));    //Opening bracket pushed to stack
            }
            if(sb.charAt(i) == ')'){
                if(!stk.empty()){  //If stack is not empty, remove the opening bracket
                    stk.pop();
                }else{            //Stack is empty, so the closing bracket is unnecessary, so replace with star
                    sb.setCharAt(i, '*');
                }
            }
        }
            while(!stk.empty()){    // After full iteration, if any opening brackets are there, then remove and replace with * 
                stk.pop();
                sb.setCharAt(stk.pop(), '*');
            }   
            return sb.toString().replaceAll("\\*", ""); //replace *s with empty string 
    }
    
}
