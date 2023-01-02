package leetcode_string.occurrence;

class Solution0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] occurrence = new int[26];

        for (int i = 0; i < magazine.length(); i++) occurrence[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if (occurrence[index] == 0) return false;
            else occurrence[index]--;
        }

        return true;
    }
}

public class _0383_RansomNote {
    public static void main(String[] args) {
        Solution0383 slt = new Solution0383();
        System.out.println(slt.canConstruct("a", "b"));  // false
        System.out.println(slt.canConstruct("aa", "ab"));  // false
        System.out.println(slt.canConstruct("aa", "aab"));  // true
    }
}
