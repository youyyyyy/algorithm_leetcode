package leetcode_sliding_window;

// Time complexity: O(n)
// Space complexity: O(m)
class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0 || len == 1) return len;

        // 1. s only consists of English letters, digits, symbols and spaces
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        int maxLen = Integer.MIN_VALUE;
        for (; right < len; right++) {
            // 2. extends window using "right" pointer
            chars[s.charAt(right)]++;

            // 3. if there is duplicate in the window, narrow window using "left" pointer
            while (chars[s.charAt(right)] > 1) {
                chars[s.charAt(left)]--;
                left++;
            }

            // 4. store the max value
            maxLen = Math.max((maxLen), right - left + 1);
        }
        return maxLen;
    }
}

public class _03_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution03 slt = new Solution03();
        String s = "pwwkew";
        int res = slt.lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
