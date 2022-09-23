package leetcode_string;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if (arr[index] == 0) return false;
            else arr[index]--;
        }
        return true;
    }
}

public class _383_RansomNote {
    public static void main(String[] args) {
        Solution383 slt = new Solution383();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean res = slt.canConstruct(ransomNote, magazine);
        System.out.println(res);
    }
}
