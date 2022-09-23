package leetcode_hashmap;

import java.util.HashSet;


// Time complexity: O(n)
// Space complexity: O(n)
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }
}

public class _217_ContainsDuplicate {
    public static void main(String[] args) {
        Solution217 slt = new Solution217();
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean res = slt.containsDuplicate(arr);
        System.out.println(res);
    }
}
