package leetcode_two_pointers;

class Solution0392 {
    public boolean isSubsequence(String s, String t) {

        int indexS = 0;
        int indexT = 0;

        while (indexS < s.length() && indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) indexS++;
            indexT++;
        }

        return indexS == s.length();
    }
}

public class _0392_IsSubsequence {
    public static void main(String[] args) {
        Solution0392 slt = new Solution0392();
        System.out.println(slt.isSubsequence("abc", "ahbgdc"));  // true
        System.out.println(slt.isSubsequence("axc", "ahbgdc"));  // false
    }
}
