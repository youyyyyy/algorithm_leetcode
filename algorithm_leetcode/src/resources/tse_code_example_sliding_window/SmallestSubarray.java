/*
 * Code example from Ryan Schachte
 * url = https://www.youtube.com/watch?v=MK-NZ4hN7rs
 * */

package resources.tse_code_example_sliding_window;

public class SmallestSubarray {

    public static int smallestSubarray(int[] arr, int target) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];
            while (currentWindowSum >= target) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }


    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 2, 7, 8, 1, 2, 8, 10};
        int targetSum = 8;
        int res = smallestSubarray(input, targetSum);
        System.out.println(res);
    }
}
