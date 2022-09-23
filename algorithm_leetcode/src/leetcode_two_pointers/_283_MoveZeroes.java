package leetcode_two_pointers;


/*
// Time complexity: O(n)
// Space complexity: O(1)
class Solution283 {
    public void moveZeroes(int[] nums) {

        int left = 0, right = 0;
        for (; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
        }
        while (left < right) nums[left++] = 0;
    }
}
*/

// solution above is also working, this is the better solution
// Time complexity: O(n)
// Space complexity: O(1)
class Solution283 {
    public void moveZeroes(int[] nums) {

        int left = 0, right = 0;
        for (; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}


public class _283_MoveZeroes {
    public static void main(String[] args) {
        Solution283 slt = new Solution283();
        int[] arr = {1, 0, 1};

        System.out.println("Before: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        slt.moveZeroes(arr);

        System.out.println("\nAfter: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
