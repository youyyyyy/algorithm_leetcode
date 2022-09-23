package leetcode_array;

import java.util.Arrays;

class Solution1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int sumUnit = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            truckSize -= boxTypes[i][0];
            if (truckSize < 0) {
                sumUnit += (boxTypes[i][0] + truckSize) * boxTypes[i][1];
                break;
            } else {
                sumUnit += boxTypes[i][0] * boxTypes[i][1];
            }
        }
        return sumUnit;
    }


}

public class _1710_MaximumUnitsTruck {
    public static void main(String[] args) {
        Solution1710 slt = new Solution1710();
        int[][] arr1 = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int[][] arr2 = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize1 = 10;
        int truckSize2 = 4;
        int res1 = slt.maximumUnits(arr1, truckSize1);
        int res2 = slt.maximumUnits(arr2, truckSize2);

        System.out.println(res1);
        System.out.println(res2);
    }
}
