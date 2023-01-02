package leetcode_string.anagram;


// Time complexity: O(n)
// Space complexity: O(1)

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
        Solution0242 slt = new Solution0242();
        System.out.println(slt.isAnagram("anagram", "nagaram"));  // true
        System.out.println(slt.isAnagram("rat", "car"));  // false
    }
}
