package leetcode_hashmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            if (!map.containsKey(num)) map.put(num, 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) == 1) {
                al.add(num);
                map.put(num, 0);
            }
        }

        int[] res = new int[al.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = al.get(i);
        }
        return res;
    }
}

public class _349_IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Solution349 slt = new Solution349();
        int[] res = slt.intersection(nums1, nums2);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
