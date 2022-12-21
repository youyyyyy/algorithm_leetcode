/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 * leetcode = https://leetcode.com/problems/word-break-ii/
 * */

package resources.fcc_code_example_dynamic_programming.memo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


// Time complexity: O(n^m)
// Space complexity: O(m)
class Solution08 {
    public List<List<String>> allConstruct(String s, String[] wordDict) {
        HashMap<String, List<List<String>>> map = new HashMap<>();
        return helper(s, wordDict, map);
    }

    private List<List<String>> helper(String s, String[] wordDict, HashMap<String, List<List<String>>> map) {
        if (map.containsKey(s)) return map.get(s);
        if (s.equals("")) return new ArrayList<>(Arrays.asList(new ArrayList<String>()));

        List<List<String>> res = new ArrayList<>();
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<List<String>> subs = helper(s.substring(word.length()), wordDict, map);
                for (List<String> sub : subs) {
                    List<String> newSub = new ArrayList<>(sub);
                    newSub.add(word);
                    res.add(newSub);
                }
            }
        }

        map.put(s, res);
        return map.get(s);
    }
}

public class _08_allConstruct {
    public static void main(String[] args) {

        // test cases
        Solution08 slt = new Solution08();
        System.out.println(slt.allConstruct("purple", new String[]{"purp", "le", "p", "ur", "purpl"}));  // [[le, purp], [le, p, ur, p]]
        System.out.println(slt.allConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}));  // [[ef, cd, ab], [def, c, ab], [def, abc], [ef, abcd]]
        System.out.println(slt.allConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));  // []
        System.out.println(slt.allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[]{"a", "aa", "aaa", "aaaa", "aaaaa"}));  // []
        System.out.println(slt.allConstruct("catsanddog", new String[]{"cat", "cats", "and", "sand", "dog"}));  // [[dog, sand, cat], [dog, and, cats]]
        System.out.println(slt.allConstruct("pineapplepenapple", new String[]{"apple", "pen", "applepen", "pine", "pineapple"})); // [[apple, pen, apple, pine], [apple, applepen, pine], [apple, pen, pineapple]]
        System.out.println(slt.allConstruct("catsandog", new String[]{"cats", "dog", "sand", "and", "cat"}));  // []

    }
}
