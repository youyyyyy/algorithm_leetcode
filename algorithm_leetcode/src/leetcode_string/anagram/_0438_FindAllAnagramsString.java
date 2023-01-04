package leetcode_string.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution0438 {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();
        int lenS = s.length(), lenP = p.length();
        if (lenS < lenP) return res;

        int[] occurrenceS = new int[26];
        int[] occurrenceP = new int[26];
        for (char ch : p.toCharArray()) occurrenceP[ch - 'a']++;

        int left = 0, right = 0;
        for (; right < lenS; right++) {
            occurrenceS[s.charAt(right) - 'a']++;
            if (right - left + 1 > lenP) occurrenceS[s.charAt(left++) - 'a']--;
            if (Arrays.equals(occurrenceS, occurrenceP)) res.add(left);
        }

        return res;
    }
}


public class _0438_FindAllAnagramsString {
    public static void main(String[] args) {
        Solution0438 slt = new Solution0438();
        System.out.println(slt.findAnagrams("cbaebabacd", "abc"));  // [0, 6]
        System.out.println(slt.findAnagrams("abab", "ab"));  // [0, 1, 2]
    }
}
