package leetcode_string;

import java.util.ArrayList;
import java.util.List;

// Time complexity: O(n)
// Space complexity: O(n)
class Solution06 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int i = 0;
        int order = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) order = -order;
            i += order;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}

public class _06_ZigzagConversion {
    public static void main(String[] args) {
        Solution06 slt = new Solution06();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String res = slt.convert(s, numRows);
        System.out.println(res);
    }
}
