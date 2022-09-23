package leetcode_string;
import java.util.HashMap;

// Time complexity: O(n)
// Space complexity: O(1)
class Solution387 {
    public int firstUniqChar(String s) {
        if (s.length() == 1) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;

    }
}

public class _387_FirstUniqueCharacterString {
    public static void main(String[] args) {
        Solution387 slt = new Solution387();
        String s = "leetcode";
        int res = slt.firstUniqChar(s);
        System.out.println(res);

    }
}
