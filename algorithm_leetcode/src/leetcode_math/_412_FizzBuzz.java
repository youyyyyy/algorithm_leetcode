package leetcode_math;

import java.util.ArrayList;
import java.util.List;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }

        return res;
    }
}

public class _412_FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        Solution412 slt = new Solution412();
        List<String> res = slt.fizzBuzz(n);
        System.out.println(res);
    }
}
