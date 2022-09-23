/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package fcc_code_example_recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println(getSum(10));
    }

    public static int getSum(int n) {
        if (n <= 1) return n;
        return getSum(n - 1) + n;
    }
}
