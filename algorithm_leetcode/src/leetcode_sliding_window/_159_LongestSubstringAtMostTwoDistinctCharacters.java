package leetcode_sliding_window;

import java.util.HashMap;

class Solution159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int maxLen = Integer.MIN_VALUE;
        for (; end < s.length(); end++) {
            char chEnd = s.charAt(end);
            map.put(chEnd, map.getOrDefault(chEnd, 0) + 1);
            while (map.size() > 2) {
                char chStart = s.charAt(start);
                int count = map.get(chStart);
                map.put(chStart, --count);
                if (count == 0) map.remove(chStart);
                start++;
            }
            maxLen = Math.max(end - start + 1, maxLen);
        }
        return maxLen;
    }
}

public class _159_LongestSubstringAtMostTwoDistinctCharacters {
    public static void main(String[] args) {
        Solution159 slt = new Solution159();
        String s = "eaeba";
        int res = slt.lengthOfLongestSubstringTwoDistinct(s);
        System.out.println(res);
    }
}
