package leetcode_string;

// Time complexity: O(n)
// Space complexity: O(1)
class Solution0387 {
    public int firstUniqChar(String s) {

        int[] occurrence = new int[26];

        for (int i = 0; i < s.length(); i++) occurrence[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            if (occurrence[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;

    }
}

public class _0387_FirstUniqueCharacterString {
    public static void main(String[] args) {
        Solution0387 slt = new Solution0387();
        String s = "leetcode";
        int res = slt.firstUniqChar(s);
        System.out.println(res);

    }
}
