package leetcode_sliding_window;

import java.util.HashMap;

class Solution0159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {

        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;

        for (; right < s.length(); right++) {
            char chRight = s.charAt(right);
            char chLeft = s.charAt(left);
            map.put(chRight, map.getOrDefault(chRight, 0) + 1);

            while (map.size() > 2) {
                int count = map.get(chLeft);
                if (count == 1) map.remove(chLeft);
                else map.put(chLeft, --count);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

public class _0159_LongestSubstringAtMostTwoDistinctCharacters {
    public static void main(String[] args) {
        Solution0159 slt = new Solution0159();
        String s = "e";
        int res = slt.lengthOfLongestSubstringTwoDistinct(s);
        System.out.println(res);
    }
}
