package leetcode_binary_search;

/*
Solution 1:

interface ArrayReader {
    public int get(int index);
}

class Solution0702 {
    public int search(ArrayReader reader, int target) {

        int lo = 0, hi = 9999;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (reader.get(mid) == target) return mid;
            else if (reader.get(mid) > target) hi = mid - 1;
            else lo = mid + 1;

        }

        return -1;
    }

}
*/

interface ArrayReader {
    public int get(int index);
}

class Solution0702 {
    public int search(ArrayReader reader, int target) {

        // narrow the range of lo and hi
        int lo = 0, hi = 1;
        while (reader.get(hi) < target) {
            lo = hi;
            hi <<= 1;
        }

        // binary search in this range
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (reader.get(mid) == target) return mid;
            else if (reader.get(mid) > target) hi = mid - 1;
            else lo = mid + 1;
        }

        return -1;
    }

}

public class _0702_SearchSortedArrayUnknownSize {
}
