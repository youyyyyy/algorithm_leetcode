package leetcode_string;

class Solution0838 {
    public String pushDominoes(String dominoes) {

        // 1. append 'L' and 'R' to each side, it will not affect the behavior of Dominoes, because '.' may appear at each end
        String s = 'L' + dominoes + 'R';

        StringBuilder res = new StringBuilder();
        int left = 0;
        for (int right = 1; right < s.length(); right++) {

            while (s.charAt(right) == '.') right++;
            char tempRight = s.charAt(right);
            char tempLeft = s.charAt(left);


            if (tempLeft == tempRight) {  // 'L...L' or 'R....R'
                for (int i = left + 1; i < right; i++) res.append(tempRight);
            } else if (tempLeft == 'R' && tempRight == 'L') {  // 'R.....L'
                for (int i = 1; i <= (right - left - 1) / 2; i++) res.append(tempLeft);
                if ((right - left) % 2 == 0) res.append('.');
                for (int i = 1; i <= (right - left - 1) / 2; i++) res.append(tempRight);
            } else {  // 'L.....R'
                for (int i = left + 1; i < right; i++) res.append('.');
            }

            // 2. don't append first 'L' and last 'R' to res
            if (right != s.length() - 1) res.append(tempRight);
            left = right;
        }

        return res.toString();
    }
}

public class _0838_PushDominoes {
    public static void main(String[] args) {
        Solution0838 slt = new Solution0838();
        String dominoes = "RR.L";
        String res = slt.pushDominoes(dominoes);
        System.out.println(res);
    }
}
