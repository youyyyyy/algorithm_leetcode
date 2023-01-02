package leetcode_string.anagram;

import java.util.*;



// Time complexity: O(n * klogk)
// Space complexity: O(nk)

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
}

/*
StringJoiner:
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
*/


/*
StringBuilder:
class Solution0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] occurrence = new int[26];
            for (char ch : str.toCharArray()) occurrence[ch - 'a']++;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < occurrence.length; i++) sb.append(occurrence[i]).append('#');
            String key = sb.toString();

            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

*/

public class _0049_GroupAnagrams {
    public static void main(String[] args) {
        Solution0049 slt = new Solution0049();
        System.out.println(slt.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));  // [[eat, tea, ate], [bat], [tan, nat]]
        System.out.println(slt.groupAnagrams(new String[]{""}));  // [[]]
        System.out.println(slt.groupAnagrams(new String[]{"a"}));  // [[a]]
    }
}
