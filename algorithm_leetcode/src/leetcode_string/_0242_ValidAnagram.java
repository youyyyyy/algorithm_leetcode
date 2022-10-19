package leetcode_string;


/*
* Time complexity: O(n)
* Space complexity: O(1)
* */
class Solution0242 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] occurrence = new int[26];

        for (int i = 0; i < s.length(); i++) {
            occurrence[s.charAt(i) - 'a']++;
            occurrence[t.charAt(i) - 'a']--;
        }

        for (int i : occurrence) if (i != 0) return false;

        return true;
    }
}

public class _0242_ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        Solution0242 slt = new Solution0242();
        boolean res = slt.isAnagram(s, t);
        System.out.println(res);
    }
}
