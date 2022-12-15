/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package resources.fcc_code_example_recursion;

public class Recursion {

    public static String A() {
        return "Hello " + B();
    }

    public static String B() {
        return "my " + C();
    }

    public static String C() {
        return "friends.";
    }

    public static void main(String[] args) {
        String res = A();
        System.out.println(res);
    }
}
