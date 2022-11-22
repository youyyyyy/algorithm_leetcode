package leetcode_math;

class Solution0836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[1] >= rec2[3] || rec2[1] >= rec1[3] || rec1[0] >= rec2[2] || rec2[0] >= rec1[2]);
    }
}

public class _0836_RectangleOverlap {
    public static void main(String[] args) {
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        Solution0836 slt = new Solution0836();
        boolean res = slt.isRectangleOverlap(rec1, rec2);
        System.out.println(res);
    }
}
