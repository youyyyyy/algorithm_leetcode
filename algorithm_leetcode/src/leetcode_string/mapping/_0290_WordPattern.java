package leetcode_string.mapping;

import java.util.HashMap;


// Time complexity: O(n)
// Space complexity: O(m)
class Solution0290 {
    public boolean wordPattern(String pattern, String s) {
        // 1. check length of pattern and s
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        // 2. create bidirectional dictionaries, because mapping is two directional
        HashMap<Character, String> dictionaryP = new HashMap<>();
        HashMap<String, Character> dictionaryS = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // 3. if mapping in both direction exist, check if match
            if (dictionaryP.containsKey(ch) && dictionaryS.containsKey(word)) {
                if (!dictionaryP.get(ch).equals(word) || dictionaryS.get(word) != ch) return false;
            } else if (dictionaryP.containsKey(ch) || dictionaryS.containsKey(word)) {
                return false;
            } else {
                dictionaryP.put(ch, word);
                dictionaryS.put(word, ch);
            }
        }

        return true;
    }
}

public class _0290_WordPattern {
    public static void main(String[] args) {
        Solution0290 slt = new Solution0290();
        System.out.println(slt.wordPattern("abba", "dog cat cat dog"));  // true
        System.out.println(slt.wordPattern("abba", "dog cat cat fish"));  // false
        System.out.println(slt.wordPattern("aaaa", "dog cat cat dog"));  // false
        System.out.println(slt.wordPattern("abc", "dog cat dog"));  // false
    }
}
