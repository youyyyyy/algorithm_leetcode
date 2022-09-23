/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package fcc_code_example_recursion;

public class Fibonacci {

    public static void main(String[] args) {
        long res = fib(10);
        System.out.println(res);
    }

    // not-optimized
    public static long fib(long n) {
        if ((n == 1) || (n == 0)) return n;
        else return fib(n - 1) + fib(n - 2);  // always generate the left operand first
    }

}
