package leetcode_string;

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
        String s = "leetcode";
        String t = "coats";

        Solution2186 slt = new Solution2186();
        int res = slt.minSteps(s, t);
        System.out.println(res);
    }
}
