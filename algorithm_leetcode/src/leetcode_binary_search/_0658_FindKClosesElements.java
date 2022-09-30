package leetcode_binary_search;

import java.util.ArrayList;
import java.util.List;

class Solution0658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();

        // 1. use binary search to find the closest element to x
        int lo = 0, hi = arr.length - 1;
        int loc;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        loc = lo;

        if (loc == 0) {
            for (int i = 0; i < k; i++) res.add(arr[i]);
        } else if (loc == arr.length) {
            for (int i = 0; i < k; i++) res.add(arr[arr.length - k + i]);
        } else {
            int i = loc, j = loc;
            while (j - i - 1 < k) {
                if (i >= 0 && j <= arr.length - 1) {
                    if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) i--;
                    else j++;
                } else if (i < 0) {
                    j++;
                } else {
                    i--;
                }
            }

            for (int n = i + 1; n < j; n++) res.add(arr[n]);
        }

        return res;

    }
}

public class _0658_FindKClosesElements {
    public static void main(String[] args) {
        Solution0658 slt = new Solution0658();
        int[] arr = {3, 5, 8, 10};
        int k = 2;
        int x = 15;
        List<Integer> res = slt.findClosestElements(arr, k, x);
        System.out.println(res);

    }
}
