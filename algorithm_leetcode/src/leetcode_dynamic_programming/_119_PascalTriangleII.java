package leetcode_dynamic_programming;


import java.util.ArrayList;
import java.util.List;


// Time complexity: O(k^2)
// Space complexity: O(k)
class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        if (rowIndex == 0) return res;

        for (int i = 1; i <= rowIndex; i++) {
            res.add(0);
            for (int j = i; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }
}

/*
// Time complexity: O(k^2)
// Space complexity: O(k)
class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(res.get(j - 1) + res.get(j));
            }
            if (i > 0) temp.add(1);
            res = temp;
        }

        return res;
    }
}
*/

public class _119_PascalTriangleII {
    public static void main(String[] args) {
        Solution119 slt = new Solution119();
        int rowIndex = 1;

        List<Integer> res = slt.getRow(rowIndex);
        System.out.println(res);

    }
}
