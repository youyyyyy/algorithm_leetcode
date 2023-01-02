package leetcode_string.mapping;

import java.util.Arrays;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution0205 {
    public boolean isIsomorphic(String s, String t) {

        // 1. create bidirectional dictionaries, because mapping is two directional
        int[] dictionaryS = new int[256];
        int[] dictionaryT = new int[256];
        Arrays.fill(dictionaryS, -1);
        Arrays.fill(dictionaryT, -1);

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // 2. if no mapping exists, add mapping to both  directions
            if (dictionaryS[charS] == -1 && dictionaryT[charT] == -1) {
                dictionaryS[charS] = charT;
                dictionaryT[charT] = charS;
            } else if (dictionaryS[charS] != charT || dictionaryT[charT] != charS) {
                // 3. if mapping exists, but mapping is incorrect in any directions, return false
                return false;
            }
        }

        return true;
    }
}

public class _0205_IsomorphicStrings {
    public static void main(String[] args) {
        Solution0205 slt = new Solution0205();
        System.out.println(slt.isIsomorphic("egg", "add"));  // true
        System.out.println(slt.isIsomorphic("foo", "bar"));  // false
        System.out.println(slt.isIsomorphic("paper", "title"));  // true
        System.out.println(slt.isIsomorphic("ab", "aa")); // false
        System.out.println(slt.isIsomorphic("abab", "baba"));  // true
        System.out.println(slt.isIsomorphic("badc", "baba"));  // false
    }
}
