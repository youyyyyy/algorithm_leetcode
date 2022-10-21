package leetcode_heap;

import java.util.HashMap;
import java.util.PriorityQueue;


/*
* Time complexity: O(nlogk)
* Space complexity: O(n + k)
* */
class Solution0347 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) { // store k elements in heap, always pop up the least frequent one
            pq.add(key);
            if (pq.size() > k) pq.poll();
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();

        return res;

    }
}

public class _0347_TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Solution0347 slt = new Solution0347();
        int[] res = slt.topKFrequent(nums, k);

        for (int i : res) System.out.print(i + " ");
    }
}
