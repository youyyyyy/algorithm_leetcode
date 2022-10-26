package leetcode_array;


// Time complexity: O(m*n)
// Space complexity: O(1)
class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int res = 0;

        for (int[] account : accounts) {
            int sum = 0;
            for (int money : account) sum += money;
            res = Math.max(res, sum);
        }

        return res;
    }
}


public class _1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        Solution1672 slt = new Solution1672();
        int res = slt.maximumWealth(accounts);
        System.out.println(res);

    }
}
