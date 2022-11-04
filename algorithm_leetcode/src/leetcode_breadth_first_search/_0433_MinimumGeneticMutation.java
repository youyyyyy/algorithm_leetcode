package leetcode_breadth_first_search;

import java.util.*;



class Solution0433 {
    public int minMutation(String start, String end, String[] bank) {


        if (bank.length == 0) return -1;
        if (start.equals(end)) return 0;

        HashSet<String> visited = new HashSet<>();
        HashSet<String> bankSet = new HashSet<>(Arrays.asList(bank));
        Queue<String> queue = new LinkedList<>();

        int res = 1;
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                String cur = queue.poll();
                for (int j = 0; j < cur.length(); j++) {
                    char ch = cur.charAt(j);
                    for (char key : new char[]{'A', 'C', 'G', 'T'}) {
                        if (key != ch) {
                            String temp = cur.substring(0, j) + key + cur.substring(j + 1);
                            if (!visited.contains(temp) && bankSet.contains(temp)) {
                                if (temp.equals(end)) return res;
                                queue.add(temp);
                                visited.add(temp);
                            }
                        }
                    }
                }
            }

            res++;
        }

        return -1;
    }
}



public class _0433_MinimumGeneticMutation {
    public static void main(String[] args) {
        String start = "AACCTTGG", end = "AATTCCGG";
        String[] bank = {"AATTCCGG", "AACCTGGG", "AACCCCGG", "AACCTACC"};

        Solution0433 slt = new Solution0433();
        int res = slt.minMutation(start, end, bank);
        System.out.println(res);
    }
}

