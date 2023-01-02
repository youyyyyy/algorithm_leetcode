package leetcode_string;

// Time complexity: O(n)
// Space complexity: O(1)
class Solution0520 {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        boolean startWithCapital = Character.isUpperCase(word.charAt(0));

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) count++;
        }

        if (startWithCapital) {
            if (count == len) return true;  // 1. All letters in this word are capitals
            else return count == 1; // 2. Only the first letter in this word is capital
        } else {
            return count == 0; // 3. All letters in this word are not capitals
        }
    }
}

public class _0520_DetectCapital {
    public static void main(String[] args) {
        Solution0520 slt = new Solution0520();
        System.out.println(slt.detectCapitalUse("USA"));  // true
        System.out.println(slt.detectCapitalUse("FlaG"));  // false
    }
}
