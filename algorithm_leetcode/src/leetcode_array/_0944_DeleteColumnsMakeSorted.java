package leetcode_array;


class Solution0944 {
    public int minDeletionSize(String[] strs) {

        int res = 0;
        int len = strs[0].length();

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    res++;
                    break;
                }
            }
        }

        return res;
    }
}

public class _0944_DeleteColumnsMakeSorted {
    public static void main(String[] args) {
        Solution0944 slt = new Solution0944();
        System.out.println(slt.minDeletionSize(new String[]{"cba", "daf", "ghi"}));  // 1
        System.out.println(slt.minDeletionSize(new String[]{"a", "b"}));  // 0
        System.out.println(slt.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));  // 3
    }
}
