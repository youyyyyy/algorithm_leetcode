package leetcode_heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Solution0692 {
    public List<String> topKFrequent(String[] words, int k) {

        List<String> res = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> map.get(a) != map.get(b) ? map.get(b) - map.get(a) : a.compareTo(b));
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        for (String key : map.keySet()) pq.add(key);
        for (int i = 0; i < k; i++) res.add(pq.poll());

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
