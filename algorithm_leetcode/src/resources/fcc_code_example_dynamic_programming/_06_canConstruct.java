/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 * https://leetcode.com/problems/word-break/
 * */

package resources.fcc_code_example_dynamic_programming;

import java.util.HashMap;


// Time complexity: O(n*m^2)
// Space complexity: O(m^2)
class Solution06 {
    public boolean canConstruct(String s, String[] wordDict) {
        HashMap<String, Boolean> map = new HashMap<>();
        return helper(s, wordDict, map);
    }

    private boolean helper(String s, String[] wordDict, HashMap<String, Boolean> map) {
        if (map.containsKey(s)) return map.get(s);
        if (s == "") return true;

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (helper(s.substring(word.length()), wordDict, map) == true) {
                    map.put(s, true);
                    return true;
                }
            }
        }

        map.put(s, false);
        return false;
    }
}

public class _06_canConstruct {
    public static void main(String[] args) {
        // test cases
        Solution06 slt = new Solution06();
        System.out.println(slt.canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(slt.canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(slt.canConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(slt.canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
    }
}
