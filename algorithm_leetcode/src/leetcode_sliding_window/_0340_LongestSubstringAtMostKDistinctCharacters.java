package leetcode_sliding_window;

import java.util.HashMap;

class Solution0340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        for (; right < s.length(); right++) {
            char chRight = s.charAt(right);
            map.put(chRight, map.getOrDefault(chRight, 0) + 1);

            while (map.size() > k) {
                char chLeft = s.charAt(left);
                int count = map.get(chLeft);
                if (count == 1) map.remove(chLeft);
                else map.put(chLeft, --count);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}

public class _0340_LongestSubstringAtMostKDistinctCharacters {
    public static void main(String[] args) {
        Solution0340 slt = new Solution0340();
        System.out.println(slt.lengthOfLongestSubstringKDistinct("eceba", 2));  // 3
        System.out.println(slt.lengthOfLongestSubstringKDistinct("aa", 1));  // 2
    }
}
