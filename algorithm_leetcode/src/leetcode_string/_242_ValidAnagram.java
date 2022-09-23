package leetcode_string;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }

        for (int i : arr) {
            if (i != 0) return false;
        }
        return true;
    }
}

public class _242_ValidAnagram {
    public static void main(String[] args) {
        Solution242 slt = new Solution242();
        String s = "anagram", t = "nngaram";
        boolean res = slt.isAnagram(s, t);
        System.out.println(res);
    }
}
