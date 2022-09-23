package leetcode_string;

import java.util.HashMap;

class Solution792 {
    public int numMatchingSubseq(String s, String[] words) {
        int counter = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : map.keySet()) {
            int pos = s.indexOf(word.charAt(0));
            if (pos == -1) continue;
            int i = pos;
            int j = 0;
            while (i < s.length() && j < word.length()) {
                if (s.charAt(i) == word.charAt(j)) {
                    i++;
                    j++;
                    if (j == word.length()) {
                        counter += map.get(word);
                        break;
                    }
                } else {
                    i++;
                }

            }
        }
        return counter;
    }
}


public class _792_NumberMatchingSubsequences {
    public static void main(String[] args) {
        Solution792 slt = new Solution792();
        String s = "qlhxagxdqh";
        String[] words = {"qlhxagxdq", "qlhxagxdq", "lhyiftwtut", "yfzwraahab"};
        int res = slt.numMatchingSubseq(s, words);
        System.out.println(res);
    }

}





