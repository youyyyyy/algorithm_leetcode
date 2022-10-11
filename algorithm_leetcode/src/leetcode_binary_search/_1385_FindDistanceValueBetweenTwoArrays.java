package leetcode_binary_search;

import java.util.Arrays;

class Solution1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int res = 0;
        Arrays.sort(arr2);

        for (int num : arr1) {
            if (inRange(arr2, num - d, num + d)) res++;
        }

        return res;

    }

    // if any element in the range [num-d, num+d], return false
    public boolean inRange(int[] arr, int leftBound, int rightBound) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= leftBound && arr[mid] <= rightBound) return false;
            else if (arr[mid] > rightBound) hi = mid - 1;
            else lo = mid + 1;
        }
        return true;
    }
}

public class _1385_FindDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;
        Solution1385 slt = new Solution1385();
        int res = slt.findTheDistanceValue(arr1, arr2, d);
        System.out.println(res);

    }
}
