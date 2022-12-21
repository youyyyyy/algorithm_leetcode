package leetcode_bit_manipulation;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution0136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) res ^= num;
        return res;
    }
}

public class _0136_SingleNumber {
    public static void main(String[] args) {
        Solution0136 slt = new Solution0136();
        System.out.println(slt.singleNumber(new int[]{2, 2, 1}));  // 1
        System.out.println(slt.singleNumber(new int[]{4, 1, 2, 1, 2}));  // 4
        System.out.println(slt.singleNumber(new int[]{1}));  // 1
    }
}
