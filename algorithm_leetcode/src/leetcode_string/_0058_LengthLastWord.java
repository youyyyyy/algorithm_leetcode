package leetcode_string;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution0058 {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        while (s.charAt(right) == ' ') right--;

        int temp = right;
        while (right >= 0 && s.charAt(right) != ' ') right--;

        return temp - right;
    }
}

public class _0058_LengthLastWord {
    public static void main(String[] args) {
        Solution0058 slt = new Solution0058();
        System.out.println(slt.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(slt.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(slt.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
