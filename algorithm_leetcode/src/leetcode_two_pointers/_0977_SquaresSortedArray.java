package leetcode_two_pointers;

// Time complexity: O(n)
// Space complexity: O(n)
class Solution0977 {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int i = 0, j = len - 1, k = len - 1;

        while (i <= j) {
            int temp1 = nums[i] * nums[i];
            int temp2 = nums[j] * nums[j];
            if (temp1 <= temp2) {
                res[k--] = temp2;
                j--;
            } else {
                res[k--] = temp1;
                i++;
            }
        }

        return res;
    }
}


public class _0977_SquaresSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        Solution0977 slt = new Solution0977();
        int[] res = slt.sortedSquares(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
