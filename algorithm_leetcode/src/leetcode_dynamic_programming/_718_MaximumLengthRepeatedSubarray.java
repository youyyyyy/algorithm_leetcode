package leetcode_dynamic_programming;


// Time complexity: O(m*n)
// Space complexity: O(m*n)
class Solution718 {
    public int findLength(int[] nums1, int[] nums2) {

        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int maxLen = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] != nums2[j]) {
                    dp[i + 1][j + 1] = 0;
                } else {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                    maxLen = Math.max(maxLen, dp[i + 1][j + 1]);
                }
            }
        }
        return maxLen;
    }
}

public class _718_MaximumLengthRepeatedSubarray {
    public static void main(String[] args) {
        int[] nums1 = {0, 0, 0, 0, 0};
        int[] nums2 = {0, 0, 0, 0, 0};
        Solution718 slt = new Solution718();
        int res = slt.findLength(nums1, nums2);

        System.out.println(res);
    }
}
