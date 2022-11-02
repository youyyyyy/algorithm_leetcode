package leetcode_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];
            if (right - left == 1) res.add(true);
            else {
                int[] temp = Arrays.copyOfRange(nums, left, right + 1);
                Arrays.sort(temp);
                res.add(isArithmeticSubarray(temp));
            }
        }

        return res;
    }

    private Boolean isArithmeticSubarray(int[] temp) {
        int diff = temp[1] - temp[0];
        for (int i = 2; i < temp.length; i++) {
            if (temp[i] - temp[i - 1] != diff) return false;
        }

        return true;
    }
}

public class _1630_ArithmeticSubarrays {
    public static void main(String[] args) {
        int[] nums = {4, 6, 5, 9, 3, 7};
        int[] l = {0, 0, 2};
        int[] r = {2, 3, 5};

        Solution1630 slt = new Solution1630();
        List<Boolean> res = slt.checkArithmeticSubarrays(nums, l, r);
        System.out.println(res);
    }
}
