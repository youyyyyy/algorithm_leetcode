package leetcode_bucket_sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0347 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) buckets[i] = new ArrayList<>();

        for (int key : map.keySet()) buckets[map.get(key)].add(key);

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && al.size() <= k; i--) {
            al.addAll(buckets[i]);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = al.get(i);

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
