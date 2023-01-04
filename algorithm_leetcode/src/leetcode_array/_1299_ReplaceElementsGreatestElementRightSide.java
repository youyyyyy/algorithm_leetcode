package leetcode_array;

import java.util.Arrays;

class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}

public class _1299_ReplaceElementsGreatestElementRightSide {
    public static void main(String[] args) {
        Solution1299 slt = new Solution1299();
        System.out.println(Arrays.toString(slt.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(Arrays.toString(slt.replaceElements(new int[]{400})));
    }
}
