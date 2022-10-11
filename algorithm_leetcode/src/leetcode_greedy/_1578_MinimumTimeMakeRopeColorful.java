package leetcode_greedy;

/*
Time complexity: O(n)
Space complexity: O(1)

class Solution1578 {
    public int minCost(String colors, int[] neededTime) {
        int res = 0;

        for (int i = 1; i < colors.length(); i++) {
            int totalNeededTime = neededTime[i - 1];
            int maxNeededTime = neededTime[i - 1];
            while (i < colors.length() && colors.charAt(i - 1) == colors.charAt(i)) {
                totalNeededTime += neededTime[i];
                maxNeededTime = Math.max(maxNeededTime, neededTime[i]);
                i++;
            }
            res += totalNeededTime - maxNeededTime;
        }

        return res;
    }
}
*/


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution1578 {
    public int minCost(String colors, int[] neededTime) {

        int res = 0;
        int maxNeededTime = 0;

        // group the same color balloons together, only keep track the Math.max(neededTime) and totalTime - Math.max(neededTime)
        for (int i = 0; i < colors.length(); i++) {
            if (i > 0 && colors.charAt(i) != colors.charAt(i - 1)) maxNeededTime = 0;
            res += Math.min(maxNeededTime, neededTime[i]);
            maxNeededTime = Math.max(maxNeededTime, neededTime[i]);
        }

        return res;
    }
}


public class _1578_MinimumTimeMakeRopeColorful {
    public static void main(String[] args) {
        String colors = "aaaac";
        int[] neededTime = {1, 2, 3, 4, 5};
        Solution1578 slt = new Solution1578();
        int res = slt.minCost(colors, neededTime);
        System.out.println(res);
    }
}
