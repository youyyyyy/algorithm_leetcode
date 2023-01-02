package leetcode_string.occurrence;

import java.util.*;

class Solution1657 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] occurrence1 = new int[26];
        int[] occurrence2 = new int[26];

        for (int i = 0; i < word1.length(); i++) occurrence1[word1.charAt(i) - 'a']++;
        for (int i = 0; i < word2.length(); i++) occurrence2[word2.charAt(i) - 'a']++;

        // all the characters appear in word1 must appear in word2
        for (int i = 0; i < occurrence1.length; i++) {
            if (occurrence1[i] == 0 && occurrence2[i] != 0 || occurrence2[i] == 0 && occurrence1[i] != 0) {
                return false;
            }
        }

        Arrays.sort(occurrence1);
        Arrays.sort(occurrence2);

        return Arrays.equals(occurrence1, occurrence2);
    }
}

public class _1657_DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        Solution1657 slt = new Solution1657();
        System.out.println(slt.closeStrings("abc", "bca"));  // true
        System.out.println(slt.closeStrings("a", "aa"));  // false
        System.out.println(slt.closeStrings("cabbba", "abbccc"));  // true
        System.out.println(slt.closeStrings("uau", "ssx"));  // false
        System.out.println(slt.closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));  // false
    }
}
