package leetcode_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

/*
Time complexity: O(n * klogk)
Space complexity: O(nk)

class Solution0049 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> res = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!res.containsKey(key)) res.put(key, new ArrayList<>());
            res.get(key).add(str);
        }

        return new ArrayList<>(res.values());
    }
}*/



class Solution0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        for (String str : strs) {
            int[] occurrence = new int[26];
            for (int i = 0; i < str.length(); i++) {
                occurrence[str.charAt(i) - 'a']++;
            }

            StringJoiner sj = new StringJoiner("#");
            for (int i : occurrence) sj.add(String.valueOf(i));
            String key = sj.toString();

            if (!res.containsKey(key)) res.put(key, new ArrayList<>());
            res.get(key).add(str);
        }

        return new ArrayList<>(res.values());
    }
}

public class _0049_GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution0049 slt = new Solution0049();
        List<List<String>> res = slt.groupAnagrams(strs);
        System.out.println(res);
    }
}
