package leetcode_string.anagram;


class Solution2186 {
    public int minSteps(String s, String t) {

        int res = 0;
        int[] occurrence = new int[26];

        for (char ch : s.toCharArray()) occurrence[ch - 'a']++;
        for (char ch : t.toCharArray()) occurrence[ch - 'a']--;

        for (int i : occurrence) res += Math.abs(i);

        return res;
    }

}

public class _2186_MinimumNumberStepsMakeTwoStringsAnagramII {
    public static void main(String[] args) {
        Solution2186 slt = new Solution2186();
        System.out.println(slt.minSteps("leetcode", "coats"));  // 7
        System.out.println(slt.minSteps("night", "thing"));  // 0
    }
}
