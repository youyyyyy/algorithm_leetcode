/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package resources.fcc_code_example_recursion;

public class RecursionWithStrings {

    public static String revertString(String s) {
        // what is the base case?
        if (s.equals("")) return "";

        // what is the smallest amount of work I can do in each iteration
        // what's the smallest unit of work I can do to contribute to the goal
        return revertString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "the simple engineer";
        String vs = revertString(s);
        System.out.println(vs);
    }
}
