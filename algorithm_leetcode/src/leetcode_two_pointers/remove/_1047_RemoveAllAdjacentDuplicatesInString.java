package leetcode_two_pointers.remove;

class Solution1047 {
    public String removeDuplicates(String s) {

        // using two pointers to simulate stack
        int left = 1, right = 1;
        char[] arr = s.toCharArray();
        for (; right < arr.length; right++) {
            if (left > 0) {
                if (arr[right] != arr[left - 1]) arr[left++] = arr[right];
                else left--; // has duplicates, remove elements
            } else { // stack is empty, add element
                arr[left++] = arr[right];
            }
        }

        return new String(arr, 0, left);
    }
}

public class _1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "a";
        Solution1047 slt = new Solution1047();
        String res = slt.removeDuplicates(s);
        System.out.println(res);
    }
}
