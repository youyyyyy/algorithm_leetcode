package leetcode_sliding_window;

class Solution1176 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {

        int res = 0;
        int sum = 0;

        for (int right = 0; right < calories.length; right++) {
            sum += calories[right];
            if (right >= k - 1) {
                if (right > k - 1) sum -= calories[right - k];
                if (sum < lower) res--;
                if (sum > upper) res++;
            }
        }

        return res;
    }
}

public class _1176_DietPlanPerformance {
    public static void main(String[] args) {
        int[] calories = {3, 2};
        int k = 2, lower = 0, upper = 1;
        Solution1176 slt = new Solution1176();
        int res = slt.dietPlanPerformance(calories, k, lower, upper);
        System.out.println(res);
    }
}
