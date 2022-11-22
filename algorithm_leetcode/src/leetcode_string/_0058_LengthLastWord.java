package leetcode_string;

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
        String s = "   fly me   to   the moon  ";
        Solution0058 slt = new Solution0058();
        int res = slt.lengthOfLastWord(s);
        System.out.println(res);
    }
}
