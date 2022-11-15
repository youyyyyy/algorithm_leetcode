package leetcode_stack.monotonic_stack;

import java.util.HashMap;
import java.util.Stack;

class Solution0496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && num >= stack.peek()) stack.pop();
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }

        int[] res = new int[nums1.length];
        int i = 0;
        for (int num : nums1) res[i++] = map.get(num);

        return res;
    }
}

public class _0496_NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        Solution0496 slt = new Solution0496();
        int[] res = slt.nextGreaterElement(nums1, nums2);
        for (int i : res) System.out.print(i + " ");
    }
}
