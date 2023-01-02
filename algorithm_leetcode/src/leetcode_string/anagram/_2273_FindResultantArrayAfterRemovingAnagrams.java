package leetcode_string.anagram;

import java.util.ArrayList;
import java.util.List;

/*
class Solution2273 {
    public List<String> removeAnagrams(String[] words) {

        List<String> list = new ArrayList<>();
        String prev = "";
        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String cur = String.valueOf(ch);
            if (!cur.equals(prev)) {
                list.add(words[i]);
                prev = cur;
            }
        }
        return list;
    }
}*/


class Solution2273 {
    public List<String> removeAnagrams(String[] words) {

        List<String> res = new ArrayList<>();

        String prev = "";
        for (String word : words) {
            if (!isAnagram(prev, word)) {
                res.add(word);
                prev = word;
            }
        }

        return res;
    }

    private boolean isAnagram(String s, String t) {
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

public class _2273_FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        Solution2273 slt = new Solution2273();
        System.out.println(slt.removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"}));  // [abba, cd]
        System.out.println(slt.removeAnagrams(new String[]{"a", "b", "c", "d", "e"}));  // [a, b, c, d, e]
    }
}
