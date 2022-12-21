/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 * leetcode = https://leetcode.com/problems/combination-sum-iv/
 * */

package resources.fcc_code_example_dynamic_programming.memo;

import java.util.HashMap;


// Time complexity: O(n*m^2)
// Space complexity: O(m^2)
class Solution07 {
    public int countConstruct(String s, String[] wordDict) {
        HashMap<String, Integer> map = new HashMap<>();
        return helper(s, wordDict, map);
    }

    private int helper(String s, String[] wordDict, HashMap<String, Integer> map) {
        if (map.containsKey(s)) return map.get(s);
        if (s.equals("")) return 1;

        int count = 0;
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                count += helper(s.substring(word.length()), wordDict, map);
            }
        }
        map.put(s, count);
        return map.get(s);
    }
}

public class _07_countConstruct {
    public static void main(String[] args) {

        // test cases
        Solution07 slt = new Solution07();
        System.out.println(slt.countConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(slt.countConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
        System.out.println(slt.countConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(slt.countConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(slt.countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));

    }
}
