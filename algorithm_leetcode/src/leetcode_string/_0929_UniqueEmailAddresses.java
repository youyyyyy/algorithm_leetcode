package leetcode_string;

import java.util.HashSet;

class Solution0929 {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            int indexOfAt = email.indexOf('@');
            String subBefore = email.substring(0, indexOfAt);
            String subAfter = email.substring(indexOfAt + 1);

            StringBuilder sb = new StringBuilder();
            for (char ch : subBefore.toCharArray()) {
                if (ch == '+') break;
                if (ch != '.') sb.append(ch);
            }

            set.add(sb.append('@').append(subAfter).toString());

        }

        return set.size();
    }
}

public class _0929_UniqueEmailAddresses {
    public static void main(String[] args) {
        Solution0929 slt = new Solution0929();
        // System.out.println(slt.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
        // System.out.println(slt.numUniqueEmails(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}));
        System.out.println(slt.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"}));

    }
}
