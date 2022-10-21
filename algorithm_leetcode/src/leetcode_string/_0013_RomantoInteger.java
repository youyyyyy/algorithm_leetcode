package leetcode_string;

import java.util.HashMap;

class Solution0013 {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            int cur = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));
            res += cur < next ? -cur : cur;
        }

        return res + map.get(s.charAt(s.length() - 1));
    }
}

public class _0013_RomantoInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        Solution0013 slt = new Solution0013();
        int res = slt.romanToInt(s);
        System.out.println(res);
    }
}
