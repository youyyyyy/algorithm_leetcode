package leetcode_string;


// Time complexity: O(m*n)
// Space complexity: O(1)
class Solution0014 {
    public String longestCommonPrefix(String[] strs) {

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];

    }
}

public class _0014_LongestCommonPrefix {
    public static void main(String[] args) {
        Solution0014 slt = new Solution0014();
        System.out.println(slt.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));  // fl
        System.out.println(slt.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(slt.longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));  // aa
    }
}
