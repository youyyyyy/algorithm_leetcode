package leetcode_hashmap;

import java.util.HashSet;

class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) return true;
            else set.add(num);
        }

        return false;

    }
}

public class _1346_CheckIfNItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {-10, 12, -20, -8, 15};
        Solution1346 slt = new Solution1346();
        boolean res = slt.checkIfExist(arr);
        System.out.println(res);
    }
}
