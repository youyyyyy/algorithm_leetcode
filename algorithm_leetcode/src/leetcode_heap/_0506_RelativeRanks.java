package leetcode_heap;

// import java.util.Arrays;

/*
Time complexity: O(nlogn)
Space complexity: O(n)

class Solution0506 {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        String[] res = new String[len];
        int[][] rank = new int[len][2];

        for (int i = 0; i < len; i++) {
            rank[i][0] = score[i];
            rank[i][1] = i;
        }

        Arrays.sort(rank, (a, b) -> b[0] - a[0]);  // sort by score desc

        for (int i = 0; i < rank.length; i++) {
            if (i == 0) res[rank[i][1]] = "Gold Medal";
            else if (i == 1) res[rank[i][1]] = "Silver Medal";
            else if (i == 2) res[rank[i][1]] = "Bronze Medal";
            else res[rank[i][1]] = "" + (i + 1);
        }

        return res;
    }
}
*/

import java.util.PriorityQueue;

/*
Time complexity: O(nlogn)
Space complexity: O(n)
*/
class Solution0506 {
    public String[] findRelativeRanks(int[] score) {

        int len = score.length;
        String[] res = new String[len];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b] - score[a]);

        for (int i = 0; i < len; i++) pq.add(i);

        int i = 1;
        while (!pq.isEmpty()) {
            int index = pq.poll();
            if (i == 1) res[index] = "Gold Medal";
            else if (i == 2) res[index] = "Silver Medal";
            else if (i == 3) res[index] = "Bronze Medal";
            else res[index] = "" + i;
            i++;
        }

        return res;
    }
}


public class _0506_RelativeRanks {
    public static void main(String[] args) {
        int[] scores = {10, 3, 8, 9, 4};
        Solution0506 slt = new Solution0506();
        String[] res = slt.findRelativeRanks(scores);
        for (String s : res) {
            System.out.print(s + " ");
        }

    }
}
