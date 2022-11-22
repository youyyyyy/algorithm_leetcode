package leetcode_binary_search;

import java.util.ArrayList;
import java.util.List;

class Solution0658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();

        int len = arr.length;
        if (x < arr[0]) {
            for (int i = 0; i < k; i++) res.add(arr[i]);
        } else if (x > arr[len - 1]) {
            for (int i = 0; i < k; i++) res.add(arr[len - k + i]);
        } else {
            int pos = findInsertionPosition(arr, 0, len - 1, x);
            int left = pos, right = pos;
            while (right - left <= k) {
                if (left >= 0 && right < len) {
                    if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) left--;
                    else right++;
                } else if (left < 0) {
                    right++;
                } else {
                    left--;
                }
            }




            for (int i = left + 1; i < right; i++) res.add(arr[i]);
        }

        return res;
    }

    private int findInsertionPosition(int[] arr, int lo, int hi, int target) {
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) lo = mid + 1;
            else hi = mid;
        }

        return lo;
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
