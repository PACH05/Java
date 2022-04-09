package javaDSA.stacks;

import java.util.Stack;

// Leetcode question Valid Parenthesis
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] str = s.toCharArray();
        for (char c : str) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                char ob = stack.pop();
                if ((ob == '(' && c == ')') || (ob == '{' && c == '}') || (ob == '[' && c == ']'))
                    continue;
                else
                    return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
