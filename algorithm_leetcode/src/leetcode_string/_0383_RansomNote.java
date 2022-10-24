package leetcode_string;

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
        String ransomNote = "a", magazine = "b";
        Solution0383 slt = new Solution0383();
        boolean res = slt.canConstruct(ransomNote, magazine);
        System.out.println(res);
    }
}
