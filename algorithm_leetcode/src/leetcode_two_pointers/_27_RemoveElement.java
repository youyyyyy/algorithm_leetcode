package leetcode_two_pointers;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int left = 0, right = 0;
        for (; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
            }
        }
        return left;
    }
}

public class _27_RemoveElement {
    public static void main(String[] args) {
        Solution27 slt = new Solution27();
        int[] arr = {3, 2, 2, 3};
        int val = 3;

        int res = slt.removeElement(arr, val);
        System.out.println(res);
    }
}
