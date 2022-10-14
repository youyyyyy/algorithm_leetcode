package leetcode_binary_search;

import java.util.Arrays;

class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < len - 1; i++) {
            int lo = 0, hi = len - 1;
            while (lo <= hi) {
                int target = arr[i] * 2;
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target && mid != i) return true;
                else if (arr[mid] > target) hi = mid - 1;
                else lo = mid + 1;
            }
        }

        return false;

    }
}

public class _1346_CheckIfNItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {-10, 12, -20, -8, 15};
        Solution1346 slt = new Solution1346();
        boolean res = slt.checkIfExist(arr);
        System.out.println(res);
    }
}
