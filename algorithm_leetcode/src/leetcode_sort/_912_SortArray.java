package leetcode_sort;

// merge sort
class Solution912 {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        if (nums.length == 1) return nums;

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            mergeSort(nums, lo, mid);
            mergeSort(nums, mid + 1, hi);
            merge(nums, lo, mid, hi);
        }
    }

    public void merge(int[] nums, int lo, int mid, int hi) {
        int[] temp = new int[hi - lo + 1];
        int i = lo, j = mid + 1, k = 0;

        while (i <= mid && j <= hi) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= hi) {
            temp[k++] = nums[j++];
        }

        // copy sorted array back
        for (i = lo; i <= hi; i++) {
            nums[i] = temp[i - lo];
        }
    }
}


public class _912_SortArray {
    public static void main(String[] args) {
        Solution912 slt = new Solution912();
        int[] arr = {2, 3, 1, 44, 23, -10, 0, -200};
        slt.sortArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
