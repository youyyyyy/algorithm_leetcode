package leetcode_hashmap;


import java.util.HashSet;

class Solution2442 {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(reverseInt(num));
        }
        return set.size();
    }

    private int reverseInt(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum * 10 + num % 10;
            num /= 10;
        }
        return sum;
    }
}

public class _2442_Count_Number_Distinct_Integers_After_Reverse_Operations {
    public static void main(String[] args) {
        int[] nums = {1, 13, 10, 12, 31};
        Solution2442 slt = new Solution2442();
        int res = slt.countDistinctIntegers(nums);
        System.out.println(res);
    }
}
