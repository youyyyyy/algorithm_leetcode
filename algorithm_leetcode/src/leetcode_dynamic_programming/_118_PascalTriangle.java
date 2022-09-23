package leetcode_dynamic_programming;

import java.util.ArrayList;
import java.util.List;


// Time complexity: O(m^2)
// Space complexity: O(1)
class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());
        res.get(0).add(1);
        if (numRows == 1) return res;

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(res.get(i - 1).get((j - 1)) + res.get(i - 1).get(j));
            }
            temp.add(1);
            res.add(temp);
        }

        return res;
    }
}

public class _118_PascalTriangle {
    public static void main(String[] args) {
        Solution118 slt = new Solution118();
        int rowNum = 5;

        List<List<Integer>> res = slt.generate(rowNum);
        System.out.println(res);

    }
}
