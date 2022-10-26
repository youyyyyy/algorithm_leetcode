package leetcode_stack;


import java.util.Stack;

class Solution0844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!stackS.isEmpty()) stackS.pop();
            } else {
                stackS.push(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                if (!stackT.isEmpty()) stackT.pop();
            } else {
                stackT.push(ch);
            }
        }

        if (stackS.size() != stackT.size()) return false;
        while (!stackS.isEmpty()) {
            if (stackS.pop() != stackT.pop()) return false;
        }

        return true;
    }
}

public class _0844_BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        Solution0844 slt = new Solution0844();
        boolean res = slt.backspaceCompare(s, t);
        System.out.println(res);
    }
}
