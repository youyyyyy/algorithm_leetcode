package leetcode_heap;

import java.util.*;

/*
* Time complexity: O(nlogk)
* Space complexity: O(n)
* */
class Solution0692 {
    public List<String> topKFrequent(String[] words, int k) {

        List<String> res = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b.compareTo(a));
        for (String key : map.keySet()) { // only keep k elements sorted in heap
            pq.add(key);
            if (pq.size() > k) pq.poll();
        }

        while (!pq.isEmpty()) res.add(pq.poll());
        Collections.reverse(res);

        return res;
    }
}

public class _0692_TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        Solution0692 slt = new Solution0692();
        List<String> res = slt.topKFrequent(words, k);
        System.out.println(res);

    }
}
