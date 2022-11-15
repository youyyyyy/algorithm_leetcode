package leetcode_binary_search;

class GuessGame {
    int guess(int num) {
        int answer = 6;
        if (num == answer) return 0;
        else if (num > answer) return -1;
        else return 1;
    }
}


/*
 * Time complexity: O(logN)
 * Space complexity: O(1)
 * */
class Solution0374 extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == -1) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }
}

public class _0374_GuessNumberHigherLower {
    public static void main(String[] args) {
        Solution0374 slt = new Solution0374();
        int res = slt.guessNumber(10);
        System.out.println(res);
    }
}
