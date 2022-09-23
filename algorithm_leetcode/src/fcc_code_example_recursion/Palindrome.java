/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package fcc_code_example_recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "kayak";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // define the base-case / stopping condition
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        // do some work to shrink the problem
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        // additional base-case to handle non-palindrome
        return false;
    }
}
