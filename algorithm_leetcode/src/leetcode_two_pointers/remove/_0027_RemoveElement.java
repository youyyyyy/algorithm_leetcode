package leetcode_two_pointers.remove;

/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
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
        int[] arr = {3, 2, 2, 3};
        int val = 3;

        int res = slt.removeElement(arr, val);
        System.out.println(res);
    }
}
