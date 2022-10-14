package leetcode_string;


class Solution2124 {
    public boolean checkString(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) - s.charAt(i) < 0) return false;
        }

        return true;
    }
}

public class _2124_CheckAllAsAppearsBeforeAllBs {
    public static void main(String[] args) {
        String s = "aba";
        Solution2124 slt = new Solution2124();
        boolean res = slt.checkString(s);
        System.out.println(res);
    }
}
