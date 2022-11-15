package leetcode_two_pointers.remove;

class Solution1047 {
    public String removeDuplicates(String s) {

        if (s.length() == 1) return s;

        // using two pointers to simulate stack
        int i = 1, j = 1;
        char[] chs = s.toCharArray();

        for (; j < chs.length; j++) {
            if (i < 1 || chs[i - 1] != chs[j]) chs[i++] = chs[j]; // stack is empty or different ch, add to stack
            else if (chs[i - 1] == chs[j]) i--; // has duplicates, remove from stack
        }

        return new String(chs, 0, i);
    }
}

public class _1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "a";
        Solution1047 slt = new Solution1047();
        String res = slt.removeDuplicates(s);
        System.out.println(res);
    }
}
