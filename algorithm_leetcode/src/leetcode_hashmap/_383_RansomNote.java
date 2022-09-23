package leetcode_hashmap;

import java.util.HashMap;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (!map.containsKey(ch) || map.get(ch) == 0) return false;
            else map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}

public class _383_RansomNote {
    public static void main(String[] args) {
        Solution383 slt = new Solution383();
        String ransomNote = "aa";
        String magazine = "ab";
        boolean res = slt.canConstruct(ransomNote, magazine);
        System.out.println(res);
    }
}
