package leetcode_stack;

import java.util.Stack;

// Time complexity: O(n)
// Space complexity: O(n)
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            if (stack.isEmpty() && (ch == ']' || ch == ')' || ch == '}')) return false;
            if (ch == ')' && stack.pop() != '(' || ch == '}' && stack.pop() != '{' || ch == ']' && stack.pop() != '[') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

public class _20_ValidParentheses {
    public static void main(String[] args) {
        Solution20 slt = new Solution20();
        String s = "]";
        boolean res = slt.isValid(s);
        System.out.println(res);
    }
}
