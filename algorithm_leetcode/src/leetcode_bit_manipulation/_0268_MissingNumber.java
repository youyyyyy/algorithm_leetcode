package leetcode_bit_manipulation;

class Solution0268 {
    public int missingNumber(int[] nums) {

        int len = nums.length;

        int res = len;
        for (int i = 0; i < len; i++) res ^= i ^ nums[i];

        return res;

    }
}

public class _0268_MissingNumber {
    public static void main(String[] args) {
        Solution0268 slt = new Solution0268();
        System.out.println(slt.missingNumber(new int[]{3, 0, 1}));  // 2
        System.out.println(slt.missingNumber(new int[]{0, 1}));  // 2
        System.out.println(slt.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));  // 8
    }
}
