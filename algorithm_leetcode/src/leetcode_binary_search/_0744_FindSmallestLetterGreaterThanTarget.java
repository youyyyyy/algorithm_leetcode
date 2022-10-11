package leetcode_binary_search;

class Solution0744 {
    public char nextGreatestLetter(char[] letters, char target) {

        int lo = 0, hi = letters.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (letters[mid] <= target) lo = mid + 1;
            else hi = mid;

        }

        return letters[lo % letters.length];
    }
}

public class _0744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';
        Solution0744 slt = new Solution0744();
        char res = slt.nextGreatestLetter(letters, target);
        System.out.println(res);
    }
}
