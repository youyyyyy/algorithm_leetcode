package leetcode_hashmap.find_duplicates;

import java.util.HashSet;


// Time complexity: O(n)
// Space complexity: O(n)
class Solution0217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}

public class _0217_ContainsDuplicate {
    public static void main(String[] args) {
        Solution0217 slt = new Solution0217();
        System.out.println(slt.containsDuplicate(new int[]{1, 2, 3, 1}));  // true
        System.out.println(slt.containsDuplicate(new int[]{1, 2, 3, 4}));  // false
        System.out.println(slt.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));  // true
    }
}
