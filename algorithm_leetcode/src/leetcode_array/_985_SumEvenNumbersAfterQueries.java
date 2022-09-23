package leetcode_array;



// Time complexity: O(n+q)
// Space complexity: O(q)
class Solution985 {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int len = queries.length;
        int[] res = new int[len];

        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) sum += num;
        }

        for (int i = 0; i < len; i++) {
            int temp = queries[i][1];
            if (nums[temp] % 2 == 0) sum -= nums[temp];
            nums[temp] += queries[i][0];
            if (nums[temp] % 2 == 0) {
                sum += nums[temp];
            }
            res[i] = sum;

        }

        return res;
    }
}

public class _985_SumEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        Solution985 slt = new Solution985();
        int[] res = slt.sumEvenAfterQueries(nums, queries);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
