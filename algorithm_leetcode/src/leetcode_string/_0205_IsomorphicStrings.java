package leetcode_string;

import java.util.Arrays;

class Solution0205 {
    public boolean isIsomorphic(String s, String t) {

        int[] dictionaryS = new int[256];
        int[] dictionaryT = new int[256];
        Arrays.fill(dictionaryS, -1);
        Arrays.fill(dictionaryT, -1);

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            int indexS = dictionaryS[charS];
            int indexT = dictionaryT[charT];

            if (indexS != indexT) return false;

            if (indexS == -1) dictionaryS[charS] = i;
            if (indexT == -1) dictionaryT[charT] = i;

        }

        return true;
    }
}

public class _0205_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        Solution0205 slt = new Solution0205();
        boolean res = slt.isIsomorphic(s, t);
        System.out.println(res);
    }
}
