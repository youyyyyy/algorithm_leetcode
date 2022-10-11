package leetcode_two_pointers;

// Time complexity : O(n)
// Space complexity: O(1)

class Solution0167 {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int temp = numbers[i] + numbers[j];
            if (temp == target) return new int[]{i + 1, j + 1};
            else if (temp < target) i++;
            else j--;
        }

        return null;
    }
}


public class _0167_TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        Solution0167 slt = new Solution0167();
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] res = slt.twoSum(arr, target);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
