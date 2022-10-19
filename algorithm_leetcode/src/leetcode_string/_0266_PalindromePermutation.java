package leetcode_string;

class Solution0266 {
    public boolean canPermutePalindrome(String s) {
        int[] occurrence = new int[26];
        for (char ch : s.toCharArray()) occurrence[ch - 'a']++;

        int count = 0;
        for (int i : occurrence) {
            count += i % 2;
            if (count > 1) return false;
        }

        return true;
    }
}

public class _0266_PalindromePermutation {
    public static void main(String[] args) {
        String s = "carerac";
        Solution0266 slt = new Solution0266();
        boolean res = slt.canPermutePalindrome(s);
        System.out.println(res);
    }
}
