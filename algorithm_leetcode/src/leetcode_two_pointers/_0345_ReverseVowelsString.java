package leetcode_two_pointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution0345 {
    public String reverseVowels(String s) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> set = new HashSet<>(Arrays.asList(vowels));

        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < s.length() && !set.contains(arr[left])) left++;
            while (right >= 0 && !set.contains(arr[right])) right--;

            if (left < right) {
                // swap
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;

            }
        }

        return new String(arr);
    }
}

public class _0345_ReverseVowelsString {
    public static void main(String[] args) {
        String s = "leetcode";
        Solution0345 slt = new Solution0345();
        String res = slt.reverseVowels(s);
        System.out.println(res);
    }
}
