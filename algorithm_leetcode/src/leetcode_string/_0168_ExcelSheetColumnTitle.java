package leetcode_string;

class Solution0168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            sb.insert(0, (char) ('A' + (columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1) / 26;
        }

        return sb.toString();
    }
}

public class _0168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int n = 52;
        Solution0168 slt = new Solution0168();
        String res = slt.convertToTitle(n);
        System.out.println(res);
    }
}
