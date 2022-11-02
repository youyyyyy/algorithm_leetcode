package leetcode_binary_search;

class Solution2439 {
    public int minimizeArrayValue(int[] nums) {

        int lo = 0, hi = 1000000000;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(nums, mid)) hi = mid;
            else lo = mid + 1;
        }

        return lo;
    }

    private boolean check(int[] nums, int mid) {
        long sum = 0;
        for (int num : nums) {
            if (num <= mid) sum += mid - num;
            else {
                if (sum < num - mid) return false;
                else sum -= num - mid;
            }
        }

        return true;
    }
}

public class _2439_MinimizeMaximumArray {
    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 6};
        Solution2439 slt = new Solution2439();
        int res = slt.minimizeArrayValue(nums);
        System.out.println(res);

    }
}
