package leetcode_array;

import java.util.Arrays;

class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {

        if (arr.length < 3) return true;

        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) return false;
        }

        return true;
    }
}

public class _1502_CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        Solution1502 slt = new Solution1502();
        boolean res = slt.canMakeArithmeticProgression(arr);
        System.out.println(res);
    }
}
