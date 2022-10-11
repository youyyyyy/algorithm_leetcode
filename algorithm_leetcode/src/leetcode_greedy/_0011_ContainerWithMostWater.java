package leetcode_greedy;


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */

class Solution0011 {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int width = right - left;
            // the height is determined by Math.min(height[i], height[j])
            // if narrow the width by moving longer height, the amount must decrease
            // if narrow the width by moving shorter height, the amount might increase
            if (height[left] >= height[right]) res = Math.max(res, width * height[right--]);
            else res = Math.max(res, width * height[left++]);
        }

        return res;
    }
}

public class _0011_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 25, 7};
        Solution0011 slt = new Solution0011();
        int res = slt.maxArea(height);
        System.out.println(res);

    }
}
