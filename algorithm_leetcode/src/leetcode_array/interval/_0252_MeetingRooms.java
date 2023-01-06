package leetcode_array.interval;

import java.util.Arrays;

// Time complexity: O(nlogn)
// Space complexity: O(1)
class Solution0252 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) return false;
        }
        return true;
    }
}

public class _0252_MeetingRooms {
    public static void main(String[] args) {
        Solution0252 slt = new Solution0252();
        System.out.println(slt.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}}));  // false
        System.out.println(slt.canAttendMeetings(new int[][]{{7, 10}, {2, 4}})); // true
        System.out.println(slt.canAttendMeetings(new int[][]{{13, 15}, {1, 13}})); // true
    }
}
