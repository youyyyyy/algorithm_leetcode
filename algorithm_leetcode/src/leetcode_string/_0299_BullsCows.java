package leetcode_string;

class Solution0299 {
    public String getHint(String secret, String guess) {

        int[] occurrence = new int[10];
        int bull = 0, cow = 0;

        for (int i = 0; i < secret.length(); i++) {
            int digitS = secret.charAt(i) - '0';
            int digitG = guess.charAt(i) - '0';
            if (digitG == digitS) bull++;
            else {
                if (occurrence[digitS] < 0) cow++;
                if (occurrence[digitG] > 0) cow++;
                occurrence[digitS]++;
                occurrence[digitG]--;
            }
        }

        return new StringBuilder().append(bull).append("A").append(cow).append("B").toString();
    }
}

public class _0299_BullsCows {
    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";

        Solution0299 slt = new Solution0299();
        String res = slt.getHint(secret, guess);
        System.out.println(res);
    }
}
