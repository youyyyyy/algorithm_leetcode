package leetcode_two_pointers;

// Time complexity: O(M+N)
// Space complexity: O(1)
class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int i = m - 1, j = n - 1, k = m + n - 1;
        while (k >= 0) {
            if (j < 0) break;
            if (i < 0 || nums1[i] <= nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

    }
}

public class _88_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 0};
        int[] arr2 = {1};
        int m = 1;
        int n = 1;
        Solution88 slt = new Solution88();
        slt.merge(arr1, m, arr2, n);
    }

}
