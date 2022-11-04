package leetcode_string.anagram;

class Solution1347 {
    public int minSteps(String s, String t) {

        int res = 0;
        int[] occurrence = new int[26];

        for (int i = 0; i < s.length(); i++) {
            occurrence[s.charAt(i) - 'a']++;
            occurrence[t.charAt(i) - 'a']--;
        }

        for (int i : occurrence) if (i > 0) res += i;

        return res;
    }
}

public class _1347_MinimumNumberStepsMakeTwoStringsAnagram {
    public static void main(String[] args) {
        String s = "bab";
        String t = "aba";
        Solution1347 slt = new Solution1347();
        int res = slt.minSteps(s, t);
        System.out.println(res);
    }
}
