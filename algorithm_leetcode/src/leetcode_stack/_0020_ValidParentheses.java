package leetcode_stack;

import java.util.Stack;

// Time complexity: O(n)
// Space complexity: O(n)
class Solution0020 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') { // if ch is opening parentheses
                stack.push(ch);
            } else { // else ch is closing parentheses
                if (stack.isEmpty()) return false;
                else if (ch == ')' && stack.pop() != '(') return false;
                else if (ch == ']' && stack.pop() != '[') return false;
                else if (ch == '}' && stack.pop() != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}

public class _0020_ValidParentheses {
    public static void main(String[] args) {
        Solution0020 slt = new Solution0020();
        String s = "]";
        boolean res = slt.isValid(s);
        System.out.println(res);
    }
}
