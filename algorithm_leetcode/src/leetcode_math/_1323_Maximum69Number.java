package leetcode_math;

class Solution1323 {
    public int maximum69Number(int num) {
        String s = "" + num;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}

public class _1323_Maximum69Number {
    public static void main(String[] args) {
        int num = 9669;
        Solution1323 slt = new Solution1323();
        int res = slt.maximum69Number(num);
        System.out.println(res);
    }
}
