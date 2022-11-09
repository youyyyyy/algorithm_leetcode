package leetcode_math;

import java.util.Arrays;

class Solution0899 {
    public String orderlyQueue(String s, int k) {
        String smallest = s;

        if (k == 1) {
            for (int i = 0; i < s.length() - 1; i++) {
                s = s.substring(1) + s.charAt(0);
                if (s.compareTo(smallest) < 0) smallest = s;
            }
        } else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            smallest = String.valueOf(arr);
        }

        return smallest;
    }
}

public class _0899_OrderlyQueue {
    public static void main(String[] args) {

        String s = "baaca";
        int k = 3;
        Solution0899 slt = new Solution0899();
        String res = slt.orderlyQueue(s, k);
        System.out.println(res);

    }
}
