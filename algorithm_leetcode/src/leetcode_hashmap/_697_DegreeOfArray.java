package leetcode_hashmap;

import java.util.HashMap;

class Solution697 {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 1) return 1;

        // 1. key is the num in nums, value[0] is the occurrence, value[1] is the first pos
        HashMap<Integer, int[]> map = new HashMap<>();

        // 2. if there are all distinct numbers, degree and smallest length should be 1
        int degree = 1;
        int res = 1;
        for (int i = 0; i < nums.length; i++) {

            int key = nums[i];

            if (map.containsKey(key)) { // if num in the map
                int occurrence = map.get(key)[0] + 1;
                int pos = map.get(key)[1];

                // 3. if num now has the greatest degree
                if (occurrence > degree) {
                    // smallest length must be updated
                    res = i - pos + 1;
                    // degree also needs to be updated
                    degree = occurrence;
                }
                if (occurrence == degree) {
                    res = Math.min(res, i - pos + 1);
                }
                map.put(key, new int[]{occurrence, pos});

            } else { // if num is not in the map, add to the map
                map.put(key, new int[]{1, i});
            }
        }
        return res;
    }
}

public class _697_DegreeOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        Solution697 slt = new Solution697();
        int res = slt.findShortestSubArray(nums);
        System.out.println(res);

    }

}
