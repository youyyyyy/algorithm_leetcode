package leetcode_dynamic_programming;

import java.util.ArrayList;
import java.util.List;


// Time complexity: O(m^2)
// Space complexity: O(1)
class Solution0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            row.add(1);
            res.add(row);
        }

        return res;
    }
}

public class _0118_PascalTriangle {
    public static void main(String[] args) {
        Solution0118 slt = new Solution0118();
        System.out.println(slt.generate(5));  // [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
        System.out.println(slt.generate(1));  // [[1]]
    }
}
