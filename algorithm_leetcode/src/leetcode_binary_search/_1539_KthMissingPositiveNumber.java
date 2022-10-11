package leetcode_binary_search;


class Solution1539 {
    public int findKthPositive(int[] arr, int k) {

        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            while (res != arr[i]) {
                k--;
                if (k == 0) return res;
                res++;
            }
            res++;
        }

        return res + k - 1;
    }
}

public class _1539_KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        Solution1539 slt = new Solution1539();
        int res = slt.findKthPositive(arr, k);
        System.out.println(res);

    }
}
