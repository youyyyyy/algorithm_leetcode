package leetcode_prefix_sum;

import java.util.HashMap;

class Solution0560 {
    public int subarraySum(int[] nums, int k) {

        int res = 0,  sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);

        for (int num: nums) {
            sum += num;
            int target = sum - k;
            if (map.containsKey(target)) res += map.get(target);
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return res;

    }
}

public class _0560_SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        Solution0560 slt = new Solution0560();
        int res = slt.subarraySum(nums, k);
        System.out.println(res);
    }
}
