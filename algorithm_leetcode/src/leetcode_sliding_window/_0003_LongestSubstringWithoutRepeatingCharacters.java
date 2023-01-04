package leetcode_sliding_window;


class Solution0003 {
    public int lengthOfLongestSubstring(String s) {

        // 1. s only consists of English letters, digits, symbols and spaces
        int maxLen = 0;
        int[] chars = new int[128];
        int left = 0, right = 0;

        for (; right < s.length(); right++) {
            char ch = s.charAt(right);
            // 2. extends window using "right" pointer
            chars[ch]++;

            // 3. if there is duplicate in the window, narrow window using "left" pointer
            while (chars[ch] > 1) chars[s.charAt(left++)]--;

            // 4. store the max value
            maxLen = Math.max((maxLen), right - left + 1);
        }
        return maxLen;
    }
}

public class _0003_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution0003 slt = new Solution0003();
        System.out.println(slt.lengthOfLongestSubstring("abcabcbb"));  // 3
        System.out.println(slt.lengthOfLongestSubstring("bbbbb"));  // 1
        System.out.println(slt.lengthOfLongestSubstring("pwwkew"));  // 3
    }
}
