package leetcode_string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}

public class _2273_FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        Solution2273 slt = new Solution2273();
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        List<String> res = slt.removeAnagrams(words);
        System.out.println(res);
    }
}
