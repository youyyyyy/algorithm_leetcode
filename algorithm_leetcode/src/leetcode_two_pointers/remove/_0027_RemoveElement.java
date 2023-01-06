package leetcode_two_pointers.remove;

// Time complexity: O(n)
// Space complexity: O(1)
class Solution0027 {
    public int removeElement(int[] nums, int val) {

        int left = 0, right = 0;
        for (; right < nums.length; right++) {
            if (nums[right] != val) nums[left++] = nums[right];
        }

        return left;
    }
}

public class _0027_RemoveElement {
    public static void main(String[] args) {
        Solution0027 slt = new Solution0027();
        System.out.println(slt.removeElement(new int[]{3, 2, 2, 3}, 3));  // 2
        System.out.println(slt.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));  // 5
    }
}
