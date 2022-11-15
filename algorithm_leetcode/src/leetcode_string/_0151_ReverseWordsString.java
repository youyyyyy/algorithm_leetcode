package leetcode_string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class Solution0151 {
    public String reverseWords(String s) {

        s = remove(s);
        List<String> strs = new ArrayList<>();
        int i = 0, j = 0;
        while (j < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') i++;
            j = i;
            while (j < s.length() && s.charAt(j) != ' ') j++;
            strs.add(s.substring(i, j));
            i = j;
        }

        StringJoiner sj = new StringJoiner(" ");
        for (int k = strs.size() - 1; k >= 0; k--) sj.add(strs.get(k));

        return sj.toString();
    }

    private String remove(String s) {
        int i = s.length() - 1;
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') break;
        }

        return s.substring(0, i + 1);
    }
}

public class _0151_ReverseWordsString {
    public static void main(String[] args) {
        String s = "a good   example";
        Solution0151 slt = new Solution0151();
        String res = slt.reverseWords(s);
        System.out.println(res + "!");
    }
}
