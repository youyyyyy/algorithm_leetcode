package leetcode_array.interval;

import java.util.Arrays;


// Time complexity: O(nlogn)
// Space complexity: O(n)
class Solution0253 {
    public int minMeetingRooms(int[][] intervals) {
        int len = intervals.length;
        int[] start = new int[len];
        int[] end = new int[len];

        for (int i = 0; i < len; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int res = 0;
        int count = 0;
        int ptrStart = 0, ptrEnd = 0;
        while (ptrStart < len) {
            if (start[ptrStart] < end[ptrEnd]) {
                ptrStart++;
                count++;
            } else {
                ptrEnd++;
                count--;
            }
            res = Math.max(res, count);
        }

        return res;
    }
}

public class _0253_MeetingRoomsII {
    public static void main(String[] args) {
        Solution0253 slt = new Solution0253();
        System.out.println(slt.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));  // 2
        System.out.println(slt.minMeetingRooms(new int[][]{{7, 10}, {2, 4}}));  // 1
    }
}
