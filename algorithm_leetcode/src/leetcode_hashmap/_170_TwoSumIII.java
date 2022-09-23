package leetcode_hashmap;

import java.util.HashMap;


// Time complexity: add(number) - O(1)
//                  find(value) - O(N)
// Space complexity: O(N)
class TwoSum {
    HashMap<Integer, Integer> map;

    public TwoSum() {
        map = new HashMap<>();
    }

    public void add(int number) {
        // put the number and its occurrence as a pair in the map
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (int key : map.keySet()) {
            int temp = value - key;
            if (temp != key && map.containsKey(temp)) return true;
            if (temp == key && map.get(key) > 1) return true;
        }
        return false;
    }
}

public class _170_TwoSumIII {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(1);   // [] --> [1]
        twoSum.add(3);   // [1] --> [1,3]
        twoSum.add(5);   // [1,3] --> [1,3,5]
        System.out.println(twoSum.find(4));   // 1 + 3 = 4, return true;
        System.out.println(twoSum.find(7));   // No two integers sum up to 7, return false
    }
}
