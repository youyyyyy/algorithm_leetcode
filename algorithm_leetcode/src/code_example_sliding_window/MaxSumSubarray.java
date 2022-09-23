/*
 * Code example from Ryan Schachte
 * url = https://www.youtube.com/watch?v=MK-NZ4hN7rs
 * */


/* sliding window
 *  (1) fixed size window
 *  (2) dynamically resizable window
 *
 *  for contiguous sequence of elements
 *  (1) Strings, arrays, linked list
 *  (2) max, min, longest, shortest, contained
 * */


// Find the max sum subarray of a fixed size K

package code_example_sliding_window;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k = 3;
        int res = findMaxSumSubarray(arr, 3);
        System.out.println(res);
    }

    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i];
            if (i >= k - 1) {
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum -= arr[i - (k - 1)];
            }
        }
        return maxValue;

    }
}
