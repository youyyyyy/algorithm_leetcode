package leetcode_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int n = 0;
        for (; n < nums.length - 2; n++) {
            if (n > 0 && nums[n] == nums[n - 1]) continue;
            int target = -nums[n];
            int i = n + 1;
            int j = nums.length - 1;
            while (i < j) {
                if (nums[i] + nums[j] > target) {
                    j--;
                } else if (nums[i] + nums[j] < target) {
                    i++;
                } else {
                    List<Integer> temp = List.of(nums[n], nums[i], nums[j]);
                    res.add(temp);
                    while (i < j && nums[i + 1] == nums[i]) i++;
                    i++;
                    j--;
                }
            }
        }

        return res;

    }
}

public class _15_3Sum {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0};
        Solution15 slt = new Solution15();
        List<List<Integer>> res = slt.threeSum(nums);
        System.out.println(res);

    }
}
