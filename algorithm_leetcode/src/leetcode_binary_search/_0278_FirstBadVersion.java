package leetcode_binary_search;


class VersionControl {
    boolean isBadVersion(int version) {
        return true;
    }
}


/*
 * Time complexity: O(logN)
 * Space complexity: O(1)
 * */
class Solution0278 extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1, hi = n;

        while (lo < hi) { // this will not check the last element
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) hi = mid;
            else lo = mid + 1;
        }

        return lo;
    }
}

public class _0278_FirstBadVersion {
    public static void main(String[] args) {
    }
}
