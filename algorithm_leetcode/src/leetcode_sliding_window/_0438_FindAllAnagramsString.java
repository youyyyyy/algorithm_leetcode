package leetcode_sliding_window;

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
        while (right < lenS) {
            int dist = right - left + 1;
            occurrenceS[s.charAt(right) - 'a']++;
            if (dist >= lenP) {
                if (Arrays.equals(occurrenceS, occurrenceP)) res.add(left);
                occurrenceS[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }

        return res;

    }
}


public class _0438_FindAllAnagramsString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        Solution0438 slt = new Solution0438();
        List<Integer> res = slt.findAnagrams(s, p);
        System.out.println(res);
    }
}
