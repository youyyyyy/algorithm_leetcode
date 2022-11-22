package leetcode_math;

class Solution0223 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int areaA = (ay2 - ay1) * (ax2 - ax1);
        int areaB = (by2 - by1) * (bx2 - bx1);
        int areaTotal = areaA + areaB;
        if (ay1 >= by2 || by1 >= ay2 || ax1 >= bx2 || bx1 >= ax2) return areaTotal;

        int widthOfOverlap = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int heightOfOverlap = Math.min(ay2, by2) - Math.max(ay1, by1);

        return areaTotal - widthOfOverlap * heightOfOverlap;
    }
}

public class _0223_RectangleArea {

    public static void main(String[] args) {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        Solution0223 slt = new Solution0223();
        int res = slt.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        System.out.println(res);
    }
}
