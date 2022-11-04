package leetcode_string.palindrome;

import java.util.HashMap;

class Solution2131 {
    public int longestPalindrome(String[] words) {
        int res = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            String key = new String(new char[]{word.charAt(1), word.charAt(0)});
            if (map.containsKey(key)) {
                res += 4;
                int count = map.get(key);
                if (count == 1) map.remove(key);
                else map.put(key, count - 1);
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (String key : map.keySet()) {
            if (key.charAt(0) == key.charAt(1)) {
                res += 2;
                break;
            }
        }

        return res;
    }
}

public class _2131_LongestPalindromeConcatenatingTwoLetterWords {
    public static void main(String[] args) {
        String[] words = {"qo", "fo", "fq", "qf", "fo", "ff", "qq", "qf", "of", "of", "oo", "of", "of", "qf", "qf", "of"};
        Solution2131 slt = new Solution2131();
        int res = slt.longestPalindrome(words);
        System.out.println(res);
    }
}
